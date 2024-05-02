package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.DiquEntity;

import com.service.DiquService;
import com.entity.view.DiquView;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 风险地区管理
 * 后端接口
 * @author
 * @email
 * @date 2021-04-26
*/
@RestController
@Controller
@RequestMapping("/diqu")
public class DiquController {
    private static final Logger logger = LoggerFactory.getLogger(DiquController.class);

    @Autowired
    private DiquService diquService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
     
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = diquService.queryPage(params);

        //字典表数据转换
        List<DiquView> list =(List<DiquView>)page.getList();
        for(DiquView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        DiquEntity diqu = diquService.selectById(id);
        if(diqu !=null){
            //entity转view
            DiquView view = new DiquView();
            BeanUtils.copyProperties( diqu , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody DiquEntity diqu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,diqu:{}",this.getClass().getName(),diqu.toString());
        Wrapper<DiquEntity> queryWrapper = new EntityWrapper<DiquEntity>()
            .eq("diqu_name", diqu.getDiquName())
            .eq("diqu_types", diqu.getDiquTypes())
            .eq("fengxian_types", diqu.getFengxianTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DiquEntity diquEntity = diquService.selectOne(queryWrapper);
        if(diquEntity==null){
            diqu.setInsertTime(new Date());
            diqu.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      diqu.set
        //  }
            diquService.insert(diqu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody DiquEntity diqu, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,diqu:{}",this.getClass().getName(),diqu.toString());
        //根据字段查询是否有相同数据
        Wrapper<DiquEntity> queryWrapper = new EntityWrapper<DiquEntity>()
            .notIn("id",diqu.getId())
            .andNew()
            .eq("diqu_name", diqu.getDiquName())
            .eq("diqu_types", diqu.getDiquTypes())
            .eq("fengxian_types", diqu.getFengxianTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DiquEntity diquEntity = diquService.selectOne(queryWrapper);
        if(diquEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      diqu.set
            //  }
            diquService.updateById(diqu);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        diquService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }






}

