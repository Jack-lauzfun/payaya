package com.itcast.test;

import com.itcast.domain.Items;
import com.itcast.mapper.ItemsMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ItemsTest {

    @Test
    public void findAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-mapper.xml");
        ItemsMapper mapper = ac.getBean(ItemsMapper.class);
        List<Items> list = mapper.findAll();
        System.out.println(list);

    }

    @Test
    public void findById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-mapper.xml");
        ItemsMapper mapper = ac.getBean(ItemsMapper.class);
        Items items = mapper.findById(1);
        System.out.println(items);

    }

}
