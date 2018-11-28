package com.jcg.examples.controller;

 

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

 




import com.jcg.examples.exceptions.InvalidAccountEcxeption;
import com.jcg.examples.service.UserService;
import com.jcg.examples.viewBean.LoginBean;

 

 

@Controller

public class loginController

{

    @Autowired
    UserService ser;
   

 

    @RequestMapping(value="login",method=RequestMethod.GET)

    public String displayLogin(@ModelAttribute("my") LoginBean lb)

    {
        return "Login";

    }

    @RequestMapping(value="welcome",method=RequestMethod.POST)
    public ModelAndView executeLogin( @ModelAttribute("my")LoginBean lb) throws SQLException

    {
    	String message;
    	boolean b;
		try {
			b = ser.isValidUser(lb.getUsername(), lb.getpassword());
		} catch (InvalidAccountEcxeption e) {
			// TODO Auto-generated catch block
			return new ModelAndView("welcome", "data", e.getMessage());
		}
    	if(b==true){
    		message="Successful Login";
    	}
    	else
    		message="Invalid Login Details";

		return new ModelAndView("welcome", "data", message);

    }

}
