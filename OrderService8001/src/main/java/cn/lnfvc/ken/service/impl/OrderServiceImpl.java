package cn.lnfvc.ken.service.impl;

import cn.ken.Order;
import cn.lnfvc.ken.dao.OrderDao;
import cn.lnfvc.ken.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/16 8:08 下午
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;


    @Override
    public List<Order> findAll() {
        return orderDao.findAll();
    }

    @Override
    public int create(Order order) {
        return orderDao.create(order);
    }
}
