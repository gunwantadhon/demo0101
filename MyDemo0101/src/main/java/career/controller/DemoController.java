package career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
@RequestMapping("/hii")
public ModelAndView m1()
{
	ModelAndView mm=new ModelAndView("page");
	return mm;
	
}
}
