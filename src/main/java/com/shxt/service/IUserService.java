package com.shxt.service;

import com.shxt.domain.User;
import com.shxt.exception.THException;

public interface IUserService {
	public void add(User user)throws THException;
}
