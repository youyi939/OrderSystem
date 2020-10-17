# OrderSystem
SpringCloud + ActiveMQ + CXF Webservice+ mysql +mybatis

## 子模块功能简介<br>
OrderClient :订单查询，CXF的客户端<br>
OrderService :核心的订单处理模块，CXF的服务端。负责接收ActiveMQ传来的消息，插入数据库，通过CXF发布服务。<br>
OrderCreate :订单生成模块，前端传过来订单信息，通过ActiveMQ发送出去。<br>
OrderPojo :抽离出去的公共模块，JAVA Bean和一些工具类。<br>

### 工作流程说明: <br>
前端页面传递给`OrderCreate`后,`OrderCreate`给`ActiviteMQ`发送消息。<br>
当`OrderService`订单处理模块接收到`ActiveMQ`发来的消息后，生成订单ID，插入到数据库。再通过CXF发布服务。<br>
`OrderClient`作为CXF的客户端，仅需调用接口给前端查询页面提供数据即可。 <br>
本项目旨在整合，故业务并不复杂。
