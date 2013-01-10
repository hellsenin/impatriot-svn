package egovframework.com.dev.service;

import java.util.List;

import org.jdom2.Document;

public interface EDevBBSManageService {

	/**
	 * 비동기 방식으로 게시판 종류 리스트를 가져온다.
	 * @param EDevBBS
	 * 
	 * @param eDevBBS
	 * @exception Exception Exception
	 */
	public Document getBoardNmList(EDevBBS eDevBBS) throws Exception;
	
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