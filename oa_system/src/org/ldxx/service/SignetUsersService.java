package org.ldxx.service;

import java.util.List;

import org.ldxx.bean.SignetManage;
import org.ldxx.bean.SignetUsers;

public interface SignetUsersService {

	int addsUser(SignetUsers sUser);

	int deletesUserById(String suId);

	int updatesUser(SignetUsers sUser);

	List<SignetUsers> selectUser(String status);

	SignetUsers selectUsersById(String suId, String status);

}
