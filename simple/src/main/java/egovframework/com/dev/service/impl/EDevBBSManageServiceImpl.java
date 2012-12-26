package egovframework.com.dev.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import egovframework.com.dev.service.EDevBBS;
import egovframework.com.dev.service.EDevBBSManageService;

@Service("EDevBBSManageService")
public class EDevBBSManageServiceImpl implements EDevBBSManageService {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name = "EDevBBSManageDAO")
    private EDevBBSManageDAO eDevBBSManageDAO;
	
	/**
	 * 게시판ID로 게시물 리스트를 조회한다.
	 * @param EDevBBS
	 * 
	 * @param eDevBBS
	 * @exception Exception Exception
	 */
	public List<EDevBBS> getBullList(EDevBBS eDevBBS) throws Exception {
		
		List<EDevBBS> resultList = new ArrayList<EDevBBS>();
		
		try {
			resultList = eDevBBSManageDAO.getBullList(eDevBBS);
		} catch (Exception e) {
			log.info(e);
		} finally {
		}
		
		return resultList;
	}
}