package com.scalog.test.scalogtest.controller;

import java.math.BigDecimal;

/**
 * @author wangzhongxiang
 * @date 2020年08月10日 10:58:43
 */
public class Credit {

    private String name;

    private BigDecimal money;

    private Integer count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", count=" + count +
                '}';
    }
}
