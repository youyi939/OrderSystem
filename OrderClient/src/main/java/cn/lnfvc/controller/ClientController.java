package cn.lnfvc.controller;

import cn.lnfvc.ken.service.Order;
import cn.lnfvc.ken.service.OrderService;
import cn.lnfvc.ken.service.impl.OrderServiceImplService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/17 10:50 上午
 */
@RestController
public class ClientController {

    @GetMapping(value = "findAll")
    public List<Order> findAllUser(){
        OrderServiceImplService serviceImplService = new OrderServiceImplService();
        OrderService orderService = serviceImplService.getOrderServiceImplPort();
        List<Order> orderList = orderService.findAll();
        return orderList;
    }
}
