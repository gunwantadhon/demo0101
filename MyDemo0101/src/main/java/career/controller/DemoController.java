package career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
@RequestMapping(value={"/","/home","/index","/MyDemo0101/","/MyDemo0101"})
public ModelAndView m1()
{
	ModelAndView mm=new ModelAndView("page");
	mm.addObject("title","Home");
	mm.addObject("userClickHome",true);


	return mm;
	
}


@RequestMapping("/about")
public ModelAndView aboutus()
{
	ModelAndView mm=new ModelAndView("page");
	mm.addObject("title","About");
	mm.addObject("userClickAbout",true);
return mm;
	
}


@RequestMapping("/contact")
public ModelAndView contact1()
{
	ModelAndView mm=new ModelAndView("page");
	mm.addObject("title","Contact");
	mm.addObject("userClickContact",true);
return mm;
	
}

@RequestMapping("/listProducts")
public ModelAndView ab12()
{
	ModelAndView mm=new ModelAndView("page");
	mm.addObject("title","ViewProducts");
	mm.addObject("userClickAllProducts",true);
return mm;
	
}

@RequestMapping("/viewproducts")
public ModelAndView abou()
{
	ModelAndView mm=new ModelAndView("page");
	mm.addObject("title","ViewProducts");
	mm.addObject("userClickCategaryProducts",true);
return mm;
	
}

@RequestMapping("/singleProduct")
public ModelAndView single()
{
	ModelAndView mm=new ModelAndView("page");
	mm.addObject("title","ShowProduct");
	mm.addObject("userClickShowProduct",true);
return mm;
	
}

@RequestMapping("/managedProducts")
public ModelAndView manage()
{
	ModelAndView mm=new ModelAndView("page");
	mm.addObject("title","ManageProduct");
	mm.addObject("userClickManageProduct",true);
return mm;
	
}
}
