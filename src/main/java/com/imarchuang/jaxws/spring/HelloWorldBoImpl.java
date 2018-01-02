package com.imarchuang.jaxws.spring;

/**
 * Created by marchuang on 2017-07-21.
 */
public class HelloWorldBoImpl implements HelloWorldBo {
    @Override
    public String getHelloWorld() {
        return "JAX-WS + Spring!";
    }
}
