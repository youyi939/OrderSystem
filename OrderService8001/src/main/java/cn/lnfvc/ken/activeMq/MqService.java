package cn.lnfvc.ken.activeMq;

import cn.lnfvc.ken.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/17 9:45 上午
 */
@Component
public class MqService {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Resource
    private OrderService orderService;

    // 使用JmsListener配置消费者监听的队列，其中name是接收到的消息
    @JmsListener(destination = "ActiveMQQueue")
    // SendTo 会将此方法返回的数据, 写入到 OutQueue 中去.
    @SendTo("SQueue")
    public String handleMessage(String message) {
        System.out.println("成功接受Mq消息" + message);


        return "成功接受Mq消息" + message;
    }
}
