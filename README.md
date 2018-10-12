# dubboDemo 项目介绍
是一个简单的dubbo服务示例，包含了api，provider，consumer。
## 新建dubbo项目
1 idea 建多module 工程 <br>
1.1新建dubbo-demo。architype不勾选 <br>
1.2 项目名称右键new module  依次建立dubbo-api dubbo-provider dubbo-consumer

## 安装zk
w3c schoole的教程
https://www.w3cschool.cn/zookeeper/zookeeper_installation.html


## dubbo admin （dubbo服务治理管理后台）部署
参考：http://www.cnblogs.com/geekdc/p/9267341.html
2.6.x版本的dubbo 没有dubbo-admin模块了，被抽出来了  <br>
git地址：https://github.com/apache/incubator-dubbo-ops  <br>
clone代码后，idea打开，找到DubboAdminApplication类， 启动main方法。 <br>
启动后浏览器访问127.0.0.1， 默认密码是root:root  <br>
配置在dubbo-admin /src/main/resources/dubbo-admin.xml里 



## 其他参考资料
https://github.com/apache/incubator-dubbo <br>
dubbo 官网 ：http://dubbo.apache.org/zh-cn/docs/user/quick-start.html  <br>
dubbo 常见问题排查：https://blog.yoodb.com/yoodb/article/detail/1129  <br>
dubbo sample：https://github.com/dubbo/dubbo-samples  <br>
