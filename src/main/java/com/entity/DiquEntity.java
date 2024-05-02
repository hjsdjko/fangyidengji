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
 * 风险地区管理
 *
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("diqu")
public class DiquEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DiquEntity() {

	}

	public DiquEntity(T t) {
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
     * 地区名字
     */
    @TableField(value = "diqu_name")

    private String diquName;


    /**
     * 行政区域
     */
    @TableField(value = "diqu_types")

    private Integer diquTypes;


    /**
     * 风险等级
     */
    @TableField(value = "fengxian_types")

    private Integer fengxianTypes;


    /**
     * 备注信息
     */
    @TableField(value = "diqu_content")

    private String diquContent;


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
	 * 设置：地区名字
	 */
    public String getDiquName() {
        return diquName;
    }


    /**
	 * 获取：地区名字
	 */

    public void setDiquName(String diquName) {
        this.diquName = diquName;
    }
    /**
	 * 设置：行政区域
	 */
    public Integer getDiquTypes() {
        return diquTypes;
    }


    /**
	 * 获取：行政区域
	 */

    public void setDiquTypes(Integer diquTypes) {
        this.diquTypes = diquTypes;
    }
    /**
	 * 设置：风险等级
	 */
    public Integer getFengxianTypes() {
        return fengxianTypes;
    }


    /**
	 * 获取：风险等级
	 */

    public void setFengxianTypes(Integer fengxianTypes) {
        this.fengxianTypes = fengxianTypes;
    }
    /**
	 * 设置：备注信息
	 */
    public String getDiquContent() {
        return diquContent;
    }


    /**
	 * 获取：备注信息
	 */

    public void setDiquContent(String diquContent) {
        this.diquContent = diquContent;
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
        return "Diqu{" +
            "id=" + id +
            ", diquName=" + diquName +
            ", diquTypes=" + diquTypes +
            ", fengxianTypes=" + fengxianTypes +
            ", diquContent=" + diquContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
