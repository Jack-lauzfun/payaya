package com.itcast.service.impl;

import com.itcast.domain.Items;
import com.itcast.mapper.ItemsMapper;
import com.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    public Items findById(int id) {
        return itemsMapper.findById(id);
    }
}
