package com.entity.view;

import com.entity.DiquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 风险地区管理
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("diqu")
public class DiquView extends DiquEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 行政区域的值
		*/
		private String diquValue;
		/**
		* 风险等级的值
		*/
		private String fengxianValue;



	public DiquView() {

	}

	public DiquView(DiquEntity diquEntity) {
		try {
			BeanUtils.copyProperties(this, diquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 行政区域的值
			*/
			public String getDiquValue() {
				return diquValue;
			}
			/**
			* 设置： 行政区域的值
			*/
			public void setDiquValue(String diquValue) {
				this.diquValue = diquValue;
			}
			/**
			* 获取： 风险等级的值
			*/
			public String getFengxianValue() {
				return fengxianValue;
			}
			/**
			* 设置： 风险等级的值
			*/
			public void setFengxianValue(String fengxianValue) {
				this.fengxianValue = fengxianValue;
			}








}
