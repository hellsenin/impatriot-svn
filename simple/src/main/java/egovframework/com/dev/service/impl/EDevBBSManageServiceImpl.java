package egovframework.com.dev.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.springframework.stereotype.Service;

import egovframework.com.dev.service.EDevBBS;
import egovframework.com.dev.service.EDevBBSManageService;

@Service("EDevBBSManageService")
public class EDevBBSManageServiceImpl implements EDevBBSManageService {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name = "EDevBBSManageDAO")
    private EDevBBSManageDAO eDevBBSManageDAO;
	
	private Document docBoardNmList = new Document();

	/**
	 * 비동기 방식으로 게시판 종류 리스트를 가져온다.
	 * @param EDevBBS
	 * 
	 * @param eDevBBS
	 * @exception Exception Exception
	 */
	public Document getBoardNmList(EDevBBS eDevBBS) throws Exception {
		
		List<EDevBBS> resultList = new ArrayList<EDevBBS>();
		
		Element root = new Element("root");
		Element board = new Element("board");
		Element boardId = new Element("boardId");
		Element boardNm = new Element("boardNm");
		
		try {
			resultList = eDevBBSManageDAO.getBoardNmList(eDevBBS);
			
			for (int i=0; i<resultList.size(); i++) {
				
				eDevBBS = new EDevBBS();
				board = new Element("board");
				boardId = new Element("boardId");
				boardNm = new Element("boardNm");
				
				eDevBBS = resultList.get(i);
				
				boardId.setText(eDevBBS.getBoardId());
				boardNm.setText(eDevBBS.getBoardNm());
				
				board.addContent(boardId);
				board.addContent(boardNm);
				
				root.addContent(board);
			}
			
			if (root != null) {
				docBoardNmList.setRootElement(root);
			}
			
			//docBoardNmList.setRootElement(root);
		} catch (Exception e) {
			log.debug(e);
		} finally {
		}
		
		return docBoardNmList;
	}
	
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
	
	/**
	 * 공지사항 게시물을 등록한다.
	 * @param EDevBBS
	 * 
	 * @param eDevBBS
	 * @exception Exception Exception
	 */
	public void putNoticeBull(EDevBBS eDevBBS) throws Exception {
		
		try {
			eDevBBSManageDAO.putNoticeBull(eDevBBS);
		} catch (Exception e) {
			log.info(e);
		} finally {
		}
	}
}