package ken;

import cn.ken.StartTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/17 10:20 上午
 */
@SpringBootApplication
@EnableJms
public class OrderCreate9001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderCreate9001.class,args);
        StartTime startTime = new StartTime();
        startTime.getStartTime("OrderCreate9001");
    }
}
