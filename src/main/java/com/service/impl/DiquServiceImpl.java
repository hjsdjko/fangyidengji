package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.DiquDao;
import com.entity.DiquEntity;
import com.service.DiquService;
import com.entity.view.DiquView;

/**
 * 风险地区管理 服务实现类
 * @author 
 * @since 2021-04-26
 */
@Service("diquService")
@Transactional
public class DiquServiceImpl extends ServiceImpl<DiquDao, DiquEntity> implements DiquService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<DiquView> page =new Query<DiquView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
