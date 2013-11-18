package com.qunar.fresh.service;

import com.qunar.fresh.domain.User;
import com.qunar.fresh.exception.THException;

public interface IUserService {
	public void add(User user)throws THException;
}
