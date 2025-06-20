package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *车票中心：(TicketCenter)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "TicketCenter")
public class TicketCenter implements Serializable {

    //TicketCenter编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_center_id")
    private Integer ticket_center_id;
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
    private Timestamp departure_time;
   // 座位类型
   @Basic
    private String seat_type;
   // 座位价格
   @Basic
    private Integer seat_price;
   // 剩余座位
   @Basic
    private String remaining_seats;
   // 封面图
   @Basic
    private String cover_picture;
   // 购票须知
   @Basic
    private String ticket_purchase_instructions;
    // 点击数
    @Basic
    private Integer hits;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
