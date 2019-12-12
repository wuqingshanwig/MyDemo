package com.maket;
/**
 * 实体类
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor//带参
@NoArgsConstructor//无参
@Data//getter/setter
@Builder//点谁赋值谁
public class Entity {
    private String name;//会员姓名
    private String password;//密码
    private int cardId;//卡号
    private int score;//积分
    private String registration;//开卡日期


    public Entity() {
    }
}
