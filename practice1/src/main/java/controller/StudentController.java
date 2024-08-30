package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import beans.Student;

@Controller
public class StudentController {
	
	@ResponseBody
	@GetMapping("/getName")
	public String getName()
	{
		return "venkatesh";	
	}
	
	@GetMapping("/getStudent")
	public String getStudent()
	{
		return "Student";	
	}
	
	@GetMapping("/putModel")
	public String putModel(Model model)
	{
		String village="Krishnayapalem";
		model.addAttribute("village", village);
		return "viewVillage";
	}
	
	@PostMapping("/postModel")
	public String postModel(@RequestParam("FirstName")String fname,@RequestParam("LastName")String lname ,Model model)
	
	{
		model.addAttribute("fname", fname);
		model.addAttribute("lname", lname);
		
		System.out.println(fname +":"+lname);
		return "postPage";
	}
	
	@PostMapping("/modelAttribute")
	public ModelAndView modelAttribute(@ModelAttribute String FirstName ,@ModelAttribute String LastName)
	
	{
		System.out.println("Firstname:"+FirstName);
		ModelAndView mv=new ModelAndView("postPage");
		mv.addObject("fname", FirstName);
		mv.addObject("lname", LastName);
		
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="/testRequestBody",method = RequestMethod.POST)
	public String postRequestBody(@RequestBody Student stu)
	{
		return stu.toString();
	}

}
