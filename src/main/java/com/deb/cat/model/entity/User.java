package com.deb.cat.model.entity;

import com.sun.istack.Nullable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "t_user")
@ToString
public class User extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String openid;

    @Lob
    @Column(nullable = false)
    private String avatar;

    private int gender;

    @Column(length = 11)
    private String phone;

    @Column(nullable = false)
    private String nickname;

}
