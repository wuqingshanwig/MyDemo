package com.maket;

/**
 * 外挂枚举
 */
public enum CommodityEnum {
    积分外挂("你想白嫖吗?"),

    刷钱外挂("你想一夜暴富吗?");

 private  String explain;

    CommodityEnum(String explain) {
        this.explain = explain;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
