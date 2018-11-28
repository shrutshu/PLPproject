package com.jcg.examples.dao;

import java.sql.SQLException;

import com.jcg.examples.exceptions.InvalidAccountEcxeption;

public interface UserDao {
	public boolean isValidUser(String username, String password) throws SQLException, InvalidAccountEcxeption;

}
