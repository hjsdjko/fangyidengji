package com.entity.model;

import com.entity.DiquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 风险地区管理
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-26
 */
public class DiquModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 地区名字
     */
    private String diquName;


    /**
     * 行政区域
     */
    private Integer diquTypes;


    /**
     * 风险等级
     */
    private Integer fengxianTypes;


    /**
     * 备注信息
     */
    private String diquContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：地区名字
	 */
    public String getDiquName() {
        return diquName;
    }


    /**
	 * 设置：地区名字
	 */
    public void setDiquName(String diquName) {
        this.diquName = diquName;
    }
    /**
	 * 获取：行政区域
	 */
    public Integer getDiquTypes() {
        return diquTypes;
    }


    /**
	 * 设置：行政区域
	 */
    public void setDiquTypes(Integer diquTypes) {
        this.diquTypes = diquTypes;
    }
    /**
	 * 获取：风险等级
	 */
    public Integer getFengxianTypes() {
        return fengxianTypes;
    }


    /**
	 * 设置：风险等级
	 */
    public void setFengxianTypes(Integer fengxianTypes) {
        this.fengxianTypes = fengxianTypes;
    }
    /**
	 * 获取：备注信息
	 */
    public String getDiquContent() {
        return diquContent;
    }


    /**
	 * 设置：备注信息
	 */
    public void setDiquContent(String diquContent) {
        this.diquContent = diquContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
