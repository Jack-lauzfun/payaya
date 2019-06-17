package com.itcast.mapper;

import com.itcast.domain.Items;

import java.util.List;

public interface ItemsMapper {

    public List<Items> findAll();

    public Items findById(int id);



}
