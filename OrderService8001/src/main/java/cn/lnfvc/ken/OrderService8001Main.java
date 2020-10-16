package cn.lnfvc.ken;


import cn.ken.StartTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/16 7:58 下午
 */
@SpringBootApplication
public class OrderService8001Main {
    public static void main(String[] args) {
        SpringApplication.run(OrderService8001Main.class,args);
        StartTime startTime = new StartTime();
        startTime.getStartTime("OrderService8001Main");
    }
}
