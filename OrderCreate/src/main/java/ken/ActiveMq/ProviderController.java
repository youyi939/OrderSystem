package ken.ActiveMq;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/17 9:30 上午
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

/*
 * @author uv
 * @date 2018/9/15 14:54
 *
 */
@RestController
public class ProviderController {

    //注入存放消息的队列，用于下列方法一
    @Autowired
    private Queue queue;

    //注入springboot封装的工具类
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("send")
    public void send(String name) {
        //方法一：添加消息到消息队列
        jmsMessagingTemplate.convertAndSend(queue, name);
        //方法二：这种方式不需要手动创建queue，系统会自行创建名为test的队列
        //jmsMessagingTemplate.convertAndSend("test", name);
    }
}
