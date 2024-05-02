package com.entity.model;

import com.entity.QiandaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 签到
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-26
 */
public class QiandaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 签到日期
     */
    private String qiandaoTime;


    /**
     * 身体状况
     */
    private Integer shentiTypes;


    /**
     * 国内外
     */
    private Integer guowaiTypes;


    /**
     * 是否是感染者
     */
    private Integer ganranzheTypes;


    /**
     * 备注
     */
    private String qiandaoContent;


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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：签到日期
	 */
    public String getQiandaoTime() {
        return qiandaoTime;
    }


    /**
	 * 设置：签到日期
	 */
    public void setQiandaoTime(String qiandaoTime) {
        this.qiandaoTime = qiandaoTime;
    }
    /**
	 * 获取：身体状况
	 */
    public Integer getShentiTypes() {
        return shentiTypes;
    }


    /**
	 * 设置：身体状况
	 */
    public void setShentiTypes(Integer shentiTypes) {
        this.shentiTypes = shentiTypes;
    }
    /**
	 * 获取：国内外
	 */
    public Integer getGuowaiTypes() {
        return guowaiTypes;
    }


    /**
	 * 设置：国内外
	 */
    public void setGuowaiTypes(Integer guowaiTypes) {
        this.guowaiTypes = guowaiTypes;
    }
    /**
	 * 获取：是否是感染者
	 */
    public Integer getGanranzheTypes() {
        return ganranzheTypes;
    }


    /**
	 * 设置：是否是感染者
	 */
    public void setGanranzheTypes(Integer ganranzheTypes) {
        this.ganranzheTypes = ganranzheTypes;
    }
    /**
	 * 获取：备注
	 */
    public String getQiandaoContent() {
        return qiandaoContent;
    }


    /**
	 * 设置：备注
	 */
    public void setQiandaoContent(String qiandaoContent) {
        this.qiandaoContent = qiandaoContent;
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
