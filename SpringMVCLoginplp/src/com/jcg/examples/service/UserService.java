package com.jcg.examples.service;
import java.sql.SQLException;

import com.jcg.examples.exceptions.InvalidAccountEcxeption;

public interface UserService {
	public boolean isValidUser(String username, String password) throws SQLException, InvalidAccountEcxeption;
}
