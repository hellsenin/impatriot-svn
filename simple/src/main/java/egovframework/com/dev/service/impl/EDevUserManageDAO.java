package egovframework.com.dev.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.com.dev.service.EDevUser;

@Repository("EDevUserManageDAO")
public class EDevUserManageDAO extends EDevAbstractDAO {
	
	public void putUserInfo(EDevUser eDevUser) {
		
		insert("EDevUserManageDAO.putUserInfo", eDevUser);
	}
}