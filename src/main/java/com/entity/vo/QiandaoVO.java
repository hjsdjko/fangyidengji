package com.entity.vo;

import com.entity.QiandaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 签到
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("qiandao")
public class QiandaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "qiandao_time")
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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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

}
