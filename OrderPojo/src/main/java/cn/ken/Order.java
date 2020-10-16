package cn.ken;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/16 8:00 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int id;
    private String message;
}
