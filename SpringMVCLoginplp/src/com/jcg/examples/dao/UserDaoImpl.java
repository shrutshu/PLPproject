package com.jcg.examples.dao;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jcg.examples.exceptions.InvalidAccountEcxeption;
import com.jcg.examples.viewBean.LoginBean;
@Repository("dao")
public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
	EntityManager em;
	 
	
	    @Override
	
	    public boolean isValidUser(String username, String password) throws SQLException, InvalidAccountEcxeption
	
	    {
	    	/*LoginBean l=new LoginBean("sruthi@gmail.com", "9874563210");
	    	
	    	em.persist(l);
	    	em.flush();*/
	    	
	    	
	              
	        LoginBean lb=em.find(LoginBean.class, username);
	        if(lb==null)
	        	throw new InvalidAccountEcxeption("Account is not registered");
	        
	        if(lb.getpassword().contentEquals(password))
	        	return true;
	
	        else
	           return false;
	
	       }

}
