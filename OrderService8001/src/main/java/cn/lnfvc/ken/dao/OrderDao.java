package cn.lnfvc.ken.dao;

import cn.ken.Order;
import com.sun.tools.corba.se.idl.constExpr.Or;
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
}
