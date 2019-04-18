package com.huajj.test;

import com.huajj.mapper.SpecilMapper;
import com.huajj.po.Specil;
import com.huajj.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestIf {
    public static void main(String[] args) {
        SqlSession sqlSessionA = MybatisUtils.getSqlSession(false);
        int pageNum=2;
        int pageSize=5;

        int start=(pageNum-1)*pageSize;
        // 把多个参数放入“篮子”
        Map<String,Object>map=new HashMap<>();
        map.put("start",start);
        map.put("pageSize",pageSize);

        SpecilMapper specilMapper = sqlSessionA.getMapper(SpecilMapper.class);
        List<Specil> specilList = specilMapper.findAllSplit(map);

        for (Specil specil : specilList) {
            System.out.println(specil);
        }

    }
}
