package egovframework.com.dev.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import egovframework.com.dev.service.EDevUser;
import egovframework.com.dev.service.EDevUserManageService;

@Service("EDevUserManageService")
public class EDevUserManageServiceImpl implements EDevUserManageService {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name = "EDevUserManageDAO")
    private EDevUserManageDAO eDevUserManageDAO;
	
	/**
	 * Dev 사용자 정보 등록
	 * @param EDevUser
	 * 
	 * @param eDevUser
	 * @exception Exception Exception
	 */
	public void putUserInfo(EDevUser eDevUser) throws Exception {
		
		try {
			eDevUserManageDAO.putUserInfo(eDevUser);
		} catch (Exception e) {
			log.info(e);
		} finally {
		}
	}

}
