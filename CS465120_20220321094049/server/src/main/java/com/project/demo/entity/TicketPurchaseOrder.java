package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *购票订单：(TicketPurchaseOrder)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "TicketPurchaseOrder")
public class TicketPurchaseOrder implements Serializable {

    //TicketPurchaseOrder编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_purchase_order_id")
    private Integer ticket_purchase_order_id;
   // 火车编号
   @Basic
    private String train_number;
   // 出发站
   @Basic
    private String departure_station;
   // 沿途站
   @Basic
    private String station_along_the_way;
   // 终点站
   @Basic
    private String terminus;
   // 发车时间
   @Basic
    private String departure_time;
   // 座位类型
   @Basic
    private String seat_type;
   // 座位价格
   @Basic
    private String seat_price;
   // 车票编号
   @Basic
    private String ticket_no;
   // 购买用户
   @Basic
    private Integer purchase_user;
   // 购票时间
   @Basic
    private Timestamp ticket_purchase_time;
   // 购买票数
   @Basic
    private Integer number_of_votes_purchased;
   // 支付金额
   @Basic
    private String payment_amount;
   // 购票须知
   @Basic
    private String ticket_purchase_instructions;
    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
