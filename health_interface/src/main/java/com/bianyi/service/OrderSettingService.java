package com.bianyi.service;

import com.bianyi.pojo.OrderSetting;

import java.util.List;
import java.util.Map;

public interface OrderSettingService {


    void add(List<OrderSetting> list);

    List<Map> getOrderSettingByMonth(String date);

    void editNumberByDate(OrderSetting orderSetting);
}
