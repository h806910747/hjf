package com.bianyi.service;

import com.bianyi.entity.PageResult;
import com.bianyi.entity.QueryPageBean;
import com.bianyi.pojo.Setmeal;

import java.util.List;
import java.util.Map;

public interface SetmealService {
    void add(Setmeal setmeal, Integer[] checkgroupIds);

    PageResult findPage(QueryPageBean queryPageBean);

    List<Setmeal> getAllSetmeal();

    Setmeal findById(Integer id);

    List<Map<String,Object>> findSetmealCount();
}
