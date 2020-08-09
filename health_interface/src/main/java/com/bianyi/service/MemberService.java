package com.bianyi.service;

import com.bianyi.pojo.Member;

import java.util.List;

public interface MemberService {
    //根据手机号查询会员
    Member findByTelephone(String telephone);
    //自动注册会员
    void add(Member member);
    //根据月份查询会员数量
    List<Integer> findMemberByMonths(List<String> months);
}
