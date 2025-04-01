package com.entity.vo;

import com.entity.CheliangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 车辆
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @email
 * @date 2021-03-20
 */
@TableName("cheliang")
public class CheliangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 车辆牌照 Search
     */

    @TableField(value = "name")
    private String name;


    /**
     * 品牌
     */

    @TableField(value = "brand")
    private String brand;


    /**
     * 款式
     */

    @TableField(value = "design")
    private String design;


    /**
     * 车辆图片
     */

    @TableField(value = "img_photo")
    private String imgPhoto;


    /**
     * 租赁价格/时
     */

    @TableField(value = "money")
    private Integer money;


    /**
     * 车龄
     */

    @TableField(value = "age")
    private Integer age;


    /**
     * 车辆状态
     */

    @TableField(value = "zt_types")
    private Integer ztTypes;


    /**
     * 车辆描述
     */

    @TableField(value = "miaoshu_content")
    private String miaoshuContent;


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
	 * 设置：车辆牌照 Search
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：车辆牌照 Search
	 */

    public void setName(String name) {
        this.name = name;
    }
    /**
	 * 设置：品牌
	 */
    public String getBrand() {
        return brand;
    }


    /**
	 * 获取：品牌
	 */

    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**
	 * 设置：款式
	 */
    public String getDesign() {
        return design;
    }


    /**
	 * 获取：款式
	 */

    public void setDesign(String design) {
        this.design = design;
    }
    /**
	 * 设置：车辆图片
	 */
    public String getImgPhoto() {
        return imgPhoto;
    }


    /**
	 * 获取：车辆图片
	 */

    public void setImgPhoto(String imgPhoto) {
        this.imgPhoto = imgPhoto;
    }
    /**
	 * 设置：租赁价格/时
	 */
    public Integer getMoney() {
        return money;
    }


    /**
	 * 获取：租赁价格/时
	 */

    public void setMoney(Integer money) {
        this.money = money;
    }
    /**
	 * 设置：车龄
	 */
    public Integer getAge() {
        return age;
    }


    /**
	 * 获取：车龄
	 */

    public void setAge(Integer age) {
        this.age = age;
    }
    /**
	 * 设置：车辆状态
	 */
    public Integer getZtTypes() {
        return ztTypes;
    }


    /**
	 * 获取：车辆状态
	 */

    public void setZtTypes(Integer ztTypes) {
        this.ztTypes = ztTypes;
    }
    /**
	 * 设置：车辆描述
	 */
    public String getMiaoshuContent() {
        return miaoshuContent;
    }


    /**
	 * 获取：车辆描述
	 */

    public void setMiaoshuContent(String miaoshuContent) {
        this.miaoshuContent = miaoshuContent;
    }

}
