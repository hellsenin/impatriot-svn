package egovframework.let.cop.bbs.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.let.cop.bbs.service.Bull;
import egovframework.let.cop.bbs.service.BullVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("BBSBullListDAO")
public class BBSBullListDAO extends EgovAbstractDAO {
	
	/**
     * 조건에 맞는 게시물 목록을 조회 한다.
     * 
     * @param boardVO
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<BullVO> selectBBSBullList(Bull bull) throws Exception {
    	
    	return list("BBSBullListDAO.selectBBSBullList", bull);
    }
}