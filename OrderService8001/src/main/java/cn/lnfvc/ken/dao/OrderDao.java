package cn.lnfvc.ken.dao;

import cn.ken.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/16 8:18 下午
 */
@Mapper
public interface OrderDao {
    public List<Order> findAll();
    public int create (Order order);
}
