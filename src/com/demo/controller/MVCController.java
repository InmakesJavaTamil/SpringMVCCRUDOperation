package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Student;
import com.demo.service.RegistrationService;

@Controller
public class MVCController 
{
   @Autowired	
   private RegistrationService ser;
   
   public MVCController() 
   {
	 System.out.println("Front-Controller invoked");
   }
   
   @RequestMapping(value="/")
   public String homePage()
   {
	   return "registration.jsp";
   }  
   
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public ModelAndView registerForm(Student s)
   {
	   ser.studentRegistrationService(s);
	   return new ModelAndView("success.jsp").addObject("success", "Record Successfully Inserted");
   }
   
   @RequestMapping(value="/viewAllStudents")
   public ModelAndView viewAllStudents()
   {
	   List<Student> allStudents=ser.viewAllStudentsService();   
	   /*for(int i=0;i<allStudents.size();i++)
	   {
		   System.out.println(allStudents.get(i).getSid()+"\t"+allStudents.get(i).getSname()
				   +"\t"+allStudents.get(i).getSage()+"\t"+allStudents.get(i).getSaddress()
				   +"\t"+allStudents.get(i).getScourse());
	   }*/
	   return new ModelAndView("AllStudents.jsp").addObject("Students", allStudents);
   }
   
   @RequestMapping(value="/edit/{sid}")
   public String editStudent(@PathVariable int sid,Model m)
   {
	   System.out.println("Edit Here..");	   
	   Student s=ser.viewStudentsServiceById(sid);
	   System.out.println(s.getSid());
	   System.out.println(s.getSname());
	   System.out.println(s.getSage());
	   System.out.println(s.getSaddress());
	   System.out.println(s.getScourse());
	   m.addAttribute("command", ser.viewStudentsServiceById(sid));	   
	   return "redirect:/editStudent.jsp";
   }
}
