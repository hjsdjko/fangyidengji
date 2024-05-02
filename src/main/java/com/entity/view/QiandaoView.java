package com.entity.view;

import com.entity.QiandaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 签到
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("qiandao")
public class QiandaoView extends QiandaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 身体状况的值
		*/
		private String shentiValue;
		/**
		* 国内外的值
		*/
		private String guowaiValue;
		/**
		* 是否是感染者的值
		*/
		private String ganranzheValue;



		//级联表 yonghu
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 身份证正面
			*/
			private String shenfenzhengZPhoto;
			/**
			* 身份证反面
			*/
			private String shenfenzhengFPhoto;

	public QiandaoView() {

	}

	public QiandaoView(QiandaoEntity qiandaoEntity) {
		try {
			BeanUtils.copyProperties(this, qiandaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 身体状况的值
			*/
			public String getShentiValue() {
				return shentiValue;
			}
			/**
			* 设置： 身体状况的值
			*/
			public void setShentiValue(String shentiValue) {
				this.shentiValue = shentiValue;
			}
			/**
			* 获取： 国内外的值
			*/
			public String getGuowaiValue() {
				return guowaiValue;
			}
			/**
			* 设置： 国内外的值
			*/
			public void setGuowaiValue(String guowaiValue) {
				this.guowaiValue = guowaiValue;
			}
			/**
			* 获取： 是否是感染者的值
			*/
			public String getGanranzheValue() {
				return ganranzheValue;
			}
			/**
			* 设置： 是否是感染者的值
			*/
			public void setGanranzheValue(String ganranzheValue) {
				this.ganranzheValue = ganranzheValue;
			}












				//级联表的get和set yonghu
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 身份证正面
					*/
					public String getShenfenzhengZPhoto() {
						return shenfenzhengZPhoto;
					}
					/**
					* 设置： 身份证正面
					*/
					public void setShenfenzhengZPhoto(String shenfenzhengZPhoto) {
						this.shenfenzhengZPhoto = shenfenzhengZPhoto;
					}
					/**
					* 获取： 身份证反面
					*/
					public String getShenfenzhengFPhoto() {
						return shenfenzhengFPhoto;
					}
					/**
					* 设置： 身份证反面
					*/
					public void setShenfenzhengFPhoto(String shenfenzhengFPhoto) {
						this.shenfenzhengFPhoto = shenfenzhengFPhoto;
					}


}
