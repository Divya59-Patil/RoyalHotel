package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.RoomStyle;

import javax.persistence.*;



@Entity
@Table(name = "executiveRoom")
public class ExecutiveRoom extends Room {

    @Column(name = "price", columnDefinition = "Decimal(10,2) default '500.0'")
    private Double price;

    @Column(name = "description", columnDefinition = "varchar(100) default 'This is an Executive Room'")
    private String description;

    public ExecutiveRoom() {
        price = 500.0;
        description = "This is an Executive Room";
        this.setRoomType("EXECUTIVE");
    }

    @Override
    public Double getPrice() {
        return 500.0;
    }

    @Override
    public String getDescription() {
        return description;
    }

}
