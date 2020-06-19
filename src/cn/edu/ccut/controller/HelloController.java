package cn.edu.ccut.controller;

import cn.edu.ccut.po.Xxx;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Administrator
 * @Controller 指定SpringMVC Controller对象
 * @RequsetMapping("helloController") 规定helloController,为一级访问目录
 */
@Controller
@RequestMapping("helloController")
@SessionAttributes("model")
public class HelloController  {

    @ModelAttribute
    public  String  modelShow(String name,Model m){
        /*m.addAttribute("modelsss",name);*/
        return name;
    }

    /**返回值ModelAndView封装着返回值类型和返回值数据内容
     * @RequestMapping 指定处理请求的处理器格式 value:请求格式一致 method=RequestMethod. 访问方式一致
     * @ModelAttribute 表示将它注解的对象直接添加到Model领域内，不加参数对象名当指定的键
     * */
    @RequestMapping(value = "{path}/hello.do",method = RequestMethod.POST)
    public ModelAndView hello( Model m, @RequestParam("name") String name1, Xxx x , @PathVariable String path,@ModelAttribute("xm") Xxx xx) throws Exception {
        m.addAttribute("model",x);
        System.out.println(path);
        /*显示页面："hello";显示时以键值对形式返回，键为："name",键值：name
         *默认为转发；利用重定向：前缀为“redirect:” 后缀为“.jsp”*/
        ModelAndView mv = new ModelAndView("hello","name",name1);
        return mv;
    }
}
