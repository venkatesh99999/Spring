package controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import beans.Student;

@RestController
public class StudentRestController {
	
	@GetMapping(value = "/getValue")
	public String getValue(@RequestParam(name = "FirstName") String name)
	{
		return "In the Rest getValue"+"with name is: "+name;
	}
	
	@GetMapping(value="/getParam/{id}")
	public String getParam(@PathVariable("id") int id)
	{
		return "In the getParam with is: "+id;
		
	}
	
	@GetMapping(value="/getResponse")
	ResponseEntity<String> getHttpRestponse()
			{
		 return ResponseEntity.status(200).body("Hello Guys");
		
			}
	
	@PostMapping(value="/postData",consumes = {"application/json"})
	ResponseEntity<String> getHttpostRestponse(@RequestBody Student fname )
	
	{
		
		System.out.println(fname.toString());
		return ResponseEntity.status(200).body(fname.toString());
		
	}
	


}
