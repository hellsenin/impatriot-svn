package egovframework.let.cop.bbs.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import egovframework.let.cop.bbs.service.Bull;
import egovframework.let.cop.bbs.service.BullVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("BBSBullListDAO")
public class BBSBullListDAO extends EgovAbstractDAO {
	
	Logger log = Logger.getLogger(this.getClass());
	
	/**
     * 조건에 맞는 게시물 목록을 조회 한다.
     * 
     * @param bull
     * @return bull
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<BullVO> selectBBSBullList(Bull bull) throws Exception {
    	
    	return list("BBSBullListDAO.selectBBSBullList", bull);
    }
    
    /**
     * 게시물을 등록 한다.
     * 
     * @param bull
     * @return boolean
     * @throws Exception
     */
    public boolean insertBull(Bull bull) throws Exception {
    	
    	try {
    		insert("BBSBullListDAO.selectBBSBullList", bull);
    		
    		return true;
    	} catch (Exception e) {
    		log.info(e);
    		
    		return false;
    	}
    }
}