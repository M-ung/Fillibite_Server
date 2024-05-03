package com.example.hackathon.domain.order.entity;

import com.example.hackathon.domain.delivery.entity.Delivery;
import com.example.hackathon.domain.user.entity.User;
import com.example.hackathon.global.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "orders")
public class Order extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "orders_id")
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private OrderStatus orderStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;
}
