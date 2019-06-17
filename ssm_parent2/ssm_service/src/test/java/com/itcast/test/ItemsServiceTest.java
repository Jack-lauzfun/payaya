package com.itcast.test;

import com.itcast.domain.Items;
import com.itcast.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsServiceTest {

    @Test
    public void findById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-service.xml");
        ItemsService itemsService = ac.getBean(ItemsService.class);
        Items items = itemsService.findById(1);
        System.out.println(items);
    }
}
