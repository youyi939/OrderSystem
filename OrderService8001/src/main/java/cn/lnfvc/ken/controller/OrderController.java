package cn.lnfvc.ken.controller;

import cn.ken.Order;
import cn.lnfvc.ken.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/16 8:13 下午
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping(value = "/find")
    public List<Order> find(){
        return orderService.findAll();
    }


}
