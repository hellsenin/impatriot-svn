package egovframework.com.dev.service;

import java.util.List;

public interface EDevBBSManageService {
	
	/**
	 * 게시판ID로 게시물 리스트를 조회한다.
	 * @param EDevBBS
	 * 
	 * @param eDevBBS
	 * @exception Exception Exception
	 */
	public List<EDevBBS> getBullList(EDevBBS eDevBBS) throws Exception;
	
	/**
	 * 공지사항 게시물을 등록한다.
	 * @param EDevBBS
	 * 
	 * @param eDevBBS
	 * @exception Exception Exception
	 */
	public void putNoticeBull(EDevBBS eDevBBS) throws Exception;
}