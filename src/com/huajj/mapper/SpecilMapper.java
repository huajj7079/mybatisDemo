package com.huajj.mapper;

import com.huajj.po.Specil;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SpecilMapper {

    Specil findSpecilById(int id);

    List<Specil> findAll();

    List<Specil> findAllSplit(Map<String,Object> map);

    List<Specil> findAllSplit2(@Param("start") int start, @Param("pageSize") int pageSize);

    List<Specil> findAllSplit3(Map<String,Object> map);
// if
    List<Specil> findAllSplit4(Map<String,Object> map);

 }
