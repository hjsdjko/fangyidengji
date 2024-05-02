package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 签到
 *
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("qiandao")
public class QiandaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QiandaoEntity() {

	}

	public QiandaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 签到日期
     */
    @TableField(value = "qiandao_time",fill = FieldFill.UPDATE)

    private String qiandaoTime;


    /**
     * 身体状况
     */
    @TableField(value = "shenti_types")

    private Integer shentiTypes;


    /**
     * 国内外
     */
    @TableField(value = "guowai_types")

    private Integer guowaiTypes;


    /**
     * 是否是感染者
     */
    @TableField(value = "ganranzhe_types")

    private Integer ganranzheTypes;


    /**
     * 备注
     */
    @TableField(value = "qiandao_content")

    private String qiandaoContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：签到日期
	 */
    public String getQiandaoTime() {
        return qiandaoTime;
    }


    /**
	 * 获取：签到日期
	 */

    public void setQiandaoTime(String qiandaoTime) {
        this.qiandaoTime = qiandaoTime;
    }
    /**
	 * 设置：身体状况
	 */
    public Integer getShentiTypes() {
        return shentiTypes;
    }


    /**
	 * 获取：身体状况
	 */

    public void setShentiTypes(Integer shentiTypes) {
        this.shentiTypes = shentiTypes;
    }
    /**
	 * 设置：国内外
	 */
    public Integer getGuowaiTypes() {
        return guowaiTypes;
    }


    /**
	 * 获取：国内外
	 */

    public void setGuowaiTypes(Integer guowaiTypes) {
        this.guowaiTypes = guowaiTypes;
    }
    /**
	 * 设置：是否是感染者
	 */
    public Integer getGanranzheTypes() {
        return ganranzheTypes;
    }


    /**
	 * 获取：是否是感染者
	 */

    public void setGanranzheTypes(Integer ganranzheTypes) {
        this.ganranzheTypes = ganranzheTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getQiandaoContent() {
        return qiandaoContent;
    }


    /**
	 * 获取：备注
	 */

    public void setQiandaoContent(String qiandaoContent) {
        this.qiandaoContent = qiandaoContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Qiandao{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", qiandaoTime=" + qiandaoTime +
            ", shentiTypes=" + shentiTypes +
            ", guowaiTypes=" + guowaiTypes +
            ", ganranzheTypes=" + ganranzheTypes +
            ", qiandaoContent=" + qiandaoContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
