package egovframework.com.dev.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.com.dev.service.EDevBBS;

@Repository("EDevBBSManageDAO")
public class EDevBBSManageDAO extends EDevAbstractDAO {
	
	@SuppressWarnings("unchecked")
	public List<EDevBBS> getBoardNmList(EDevBBS eDevBBS) {
		
		return list("EDevBBSManageDAO.getBoardNmList", eDevBBS);
	}

	@SuppressWarnings("unchecked")
	public List<EDevBBS> getBullList(EDevBBS eDevBBS) {
		
		return list("EDevBBSManageDAO.getBullList", eDevBBS);
	}
	
	@SuppressWarnings("unchecked")
	public void putNoticeBull(EDevBBS eDevBBS) {
		
		insert("EDevBBSManageDAO.putNoticeBull", eDevBBS);
	}
}