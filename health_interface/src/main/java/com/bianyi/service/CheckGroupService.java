package com.bianyi.service;

import com.bianyi.entity.PageResult;
import com.bianyi.entity.QueryPageBean;
import com.bianyi.pojo.CheckGroup;

import java.util.List;


public interface CheckGroupService {
    //新增检查组
    void add(CheckGroup checkGroup, Integer[] checkitemIds);

    //分页查询
    PageResult findPage(QueryPageBean queryPageBean);
    //通过ID查询检查组并回显
    CheckGroup findById(Integer id);
    //根据检查组ID查询检查组包含的多个检查项ID
    List<Integer> findCheckItemIdsByCheckGroupId(Integer id);
    //编辑检查组
    void edit(CheckGroup checkGroup, Integer[] checkitemIds);
    //删除检查组
    void delete(Integer id);


    List<CheckGroup> findAll();
}
