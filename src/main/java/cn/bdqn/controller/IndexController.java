package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	/**
	 * 控制器的写法分为两种
	 */
	/**
	 * 参数的获取和传递
	 * 获取页面的参数需要用到@RequestParam
	 * 并且做好了类型的转换但是注意时间格式最后（必须是）
	 * yyyy/mm/dd
	 * @return
	 */
	@RequestMapping(value="index.html",method=RequestMethod.GET)
	public ModelAndView show(@RequestParam("name") String name,
			@RequestParam("age") Integer age){
		System.out.println("name:"+name+"\t"+"age:"+age);
		//返回页面名称
		ModelAndView md = new ModelAndView();
		md.addObject("message","欢迎登陆");
		md.setViewName("index");
		return md;
	}
	@RequestMapping(value="index.html",method=RequestMethod.POST)
	public String show(Model model,@RequestParam("name") String name,
			@RequestParam("age") Integer age){
		System.out.println("name:"+name+"\t"+"age:"+age);
		model.addAttribute("message","欢迎光临");
		//直接返回页面名称
		return "index";
	}
}
