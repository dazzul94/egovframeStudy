package egovframework.example.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    
    @RequestMapping("/hello") //여기다가 .do 안해도 무조건 url에 .do를 붙여야한다? 왜?
    public String hello() {
        return "hello";
    }
}
//dispatcherServlet의 이름은 action이고 .do일때 dispatcherServlet이 실행된다
/*<servlet>
<servlet-name>action</servlet-name>
<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
<init-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/config/egovframework/springmvc/dispatcher-servlet.xml</param-value>
</init-param>
<load-on-startup>1</load-on-startup>
</servlet>

<servlet-mapping>
<servlet-name>action</servlet-name>
<url-pattern>*.do</url-pattern>
</servlet-mapping>*/
