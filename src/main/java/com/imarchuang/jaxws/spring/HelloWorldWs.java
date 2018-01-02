package com.imarchuang.jaxws.spring;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by marchuang on 2017-07-21.
 */
@WebService
public class HelloWorldWs {

    //DI via Spring
    HelloWorldBo helloWorldBo;

    @WebMethod(exclude=true)
    public void setHelloWorldBo(HelloWorldBo helloWorldBo) {
        this.helloWorldBo = helloWorldBo;
    }

    @WebMethod(operationName="getHelloWorld")
    public String getHelloWorld() {

        return helloWorldBo.getHelloWorld();

    }
}
