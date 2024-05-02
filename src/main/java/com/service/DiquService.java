package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiquEntity;
import java.util.Map;

/**
 * 风险地区管理 服务类
 * @author 
 * @since 2021-04-26
 */
public interface DiquService extends IService<DiquEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}