package cn.lnfvc;

import cn.ken.StartTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/17 10:48 上午
 */
@SpringBootApplication
public class OrderClient7001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderClient7001.class,args);
        StartTime startTime = new StartTime();
        startTime.getStartTime("OrderClient7001");
    }
}
