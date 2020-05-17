package com.atguigu.starter;

/**
 * @version v1.0
 * @Author yangchen
 * @date 2020/5/17 14:12
 * @Description: 自定义spring-boot场景启动器
 */
public class HelloService {

    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHelloAtguigu(String name){
        return helloProperties.getPrefix()+"-"+ name+helloProperties.getSuffix();
    }
}
