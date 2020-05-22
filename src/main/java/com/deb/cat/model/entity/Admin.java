package com.deb.cat.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "t_admin")
@ToString
@Data
public class Admin extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String password;

    private String avatar;

}
