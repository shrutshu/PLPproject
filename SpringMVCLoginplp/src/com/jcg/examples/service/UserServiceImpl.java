package com.jcg.examples.service;

import java.sql.SQLException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcg.examples.dao.UserDao;
import com.jcg.examples.exceptions.InvalidAccountEcxeption;
@Service("ser")
@Transactional
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	 UserDao dao;


	@Override
	public boolean isValidUser(String username, String password)
			throws SQLException, InvalidAccountEcxeption {
		
		return dao.isValidUser(username, password);
	
	}

}
