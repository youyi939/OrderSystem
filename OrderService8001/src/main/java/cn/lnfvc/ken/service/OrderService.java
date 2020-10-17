package cn.lnfvc.ken.service;

import cn.ken.Order;

import javax.jws.WebService;
import java.util.List;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/16 8:07 下午
 */

@WebService
public interface OrderService {
    public List<Order> findAll();
    public int create (Order order);
}
