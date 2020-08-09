package com.bianyi.service;



import com.bianyi.entity.PageResult;
import com.bianyi.entity.QueryPageBean;
import com.bianyi.pojo.CheckItem;

import java.util.List;


public interface CheckItemService {
    //新增检查项
     void addCheckItem(CheckItem checkItem);
    //分页查询
     PageResult pageQuery(QueryPageBean queryPageBean);
     //删除检查项
     void deleteById(Integer id);
     //回显检查项信息
    CheckItem findById(Integer id);
    //修改检查项
    void edit(CheckItem checkItem);
    //将检查项信息展示在检查组上
    List<CheckItem> findAll();
}
