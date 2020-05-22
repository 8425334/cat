package com.deb.cat.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@EqualsAndHashCode(callSuper = true)
@Table(name = "t_pet_type")
@Entity
public class PetType extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * 分类名称
     */
    private String typeName;
}
