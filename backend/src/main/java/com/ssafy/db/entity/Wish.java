package com.ssafy.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 유저 모델 정의.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="wish_product")
public class Wish {
    @Id
    @Column(name="wish_product_pk")
    Long wishproductpk;

    @Column(name="product_pk")
    Long productpk;

    @Column(name="user_id_buyer")
    String useridbuyer;

}