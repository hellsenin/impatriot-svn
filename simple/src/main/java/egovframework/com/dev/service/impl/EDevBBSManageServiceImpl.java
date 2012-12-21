package egovframework.com.dev.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import egovframework.com.dev.service.EDevBBS;
import egovframework.com.dev.service.EDevBBSManageService;
import egovframework.let.cop.bbs.service.EgovBBSAttributeManageService;

@Service("EDevBBSManageService")
public class EDevBBSManageServiceImpl implements EDevBBSManageService {
	
	/**
	 * 게시판ID로 게시물 리스트를 조회한다.
	 * @param EDevBBS
	 * 
	 * @param eDevBBS
	 * @exception Exception Exception
	 */
	public List<EDevBBS> getBullList(EDevBBS eDevBBS) throws Exception;

}