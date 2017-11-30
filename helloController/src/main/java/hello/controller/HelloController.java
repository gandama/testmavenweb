package hello.controller;

import hello.entity.User;
import hello.entity.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yang on 2017/11/28.
 */

@Controller
@RequestMapping("hello")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("sayHello")
    public ModelAndView sayHello(){
        ModelAndView mv=new ModelAndView();
        User user = helloService.findUserByName("22");
        System.out.println("user = " + user);
        mv.setViewName("hello.jsp");
        mv.addObject("user",user);
        mv.addObject("haha","哈哈");
        return mv;

    }
}
