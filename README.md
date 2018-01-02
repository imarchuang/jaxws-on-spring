# jaxws-on-spring

This is a demo of how Spring2.x integrates jaxws

servlet config:
```
    <servlet>
        <servlet-name>jaxws-servlet</servlet-name>
        <servlet-class>com.sun.xml.ws.transport.http.servlet.WSSpringServlet</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>jaxws-servlet</servlet-name>
        <url-pattern>/hello</url-pattern>
    </servlet-mapping>

    <!-- Register Spring Listener -->
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>
```

applicationContext config:
```
    <wss:binding url="/hello">
        <wss:service>
            <ws:service bean="#helloWs"/>
        </wss:service>
    </wss:binding>

    <!-- Web service methods -->
    <bean id="helloWs" class="com.imarchuang.jaxws.spring.HelloWorldWs">
        <property name="helloWorldBo" ref="HelloWorldBo" />
    </bean>

    <bean id="HelloWorldBo" class="com.imarchuang.jaxws.spring.HelloWorldBoImpl" />
```
