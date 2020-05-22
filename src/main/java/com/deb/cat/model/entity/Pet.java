package com.deb.cat.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "t_pet")
@ToString
public class Pet extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * 宠物昵称
     */
    private String name;

    /**
     * 宠物类型
     */
    private int petType;

    /**
     * 宠物性格
     */
    private String nature;

    /**
     * hair color 毛色
     */
    private String hairColor;

    /**
     * health status 健康状态
     */
    private int healthStatus;

    /**
     * 当前状态(领养, 流浪)
     */
    private int status;

    /**
     * 性别
     */
    private int gender;

    /**
     * 外貌
     */
    @Column(columnDefinition = "宠物外貌")
    private String appearance;

    /**
     * 绝育情况
     */
    private int sterilization;

    /**
     * 宠物图标
     */
    private String avatar;

    /**
     * 当前所在位置
     */
    private String location;

    /**
     * 位置状态
     */
    private int locStatus;

}
