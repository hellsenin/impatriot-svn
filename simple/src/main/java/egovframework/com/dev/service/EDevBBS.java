package egovframework.com.dev.service;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EDevBBS implements Serializable {
	
	/**
	 * 게시판 아이디
	 */
	private String boardId = "";
	
	/**
	 * 게시판 명
	 */
	private String boardNm = "";
	
	/**
	 * 게시물 아이디
	 */
	private String bullId = "";
	
	/**
	 * 게시물 제목
	 */
	private String bullTitle = "";
	
	/**
	 * 게시물 본문 내용
	 */
	private String bullContent = "";
	
	/**
	 * 게시물 등록자 아이디
	 */
	private String bullRegId = "";
	
	/**
	 * 게시물 등록자 명
	 */
	private String bullRegNm = "";
	
	/**
	 * 게시물 등록 일
	 */
	private String bullRegDate = "";
	
	
	/**
	 * @return the boardId
	 */
	public String getBoardId() {
		return boardId;
	}

	/**
	 * @param boardId the boardId to set
	 */
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	/**
	 * @return the boardNm
	 */
	public String getBoardNm() {
		return boardNm;
	}

	/**
	 * @param boardNm the boardNm to set
	 */
	public void setBoardNm(String boardNm) {
		this.boardNm = boardNm;
	}

	/**
	 * @return the bullId
	 */
	public String getBullId() {
		return bullId;
	}

	/**
	 * @param bullId the bullId to set
	 */
	public void setBullId(String bullId) {
		this.bullId = bullId;
	}

	/**
	 * @return the bullTitle
	 */
	public String getBullTitle() {
		return bullTitle;
	}

	/**
	 * @param bullTitle the bullTitle to set
	 */
	public void setBullTitle(String bullTitle) {
		this.bullTitle = bullTitle;
	}

	/**
	 * @return the bullContent
	 */
	public String getBullContent() {
		return bullContent;
	}

	/**
	 * @param bullContent the bullContent to set
	 */
	public void setBullContent(String bullContent) {
		this.bullContent = bullContent;
	}

	/**
	 * @return the bullRegId
	 */
	public String getBullRegId() {
		return bullRegId;
	}

	/**
	 * @param bullRegId the bullRegId to set
	 */
	public void setBullRegId(String bullRegId) {
		this.bullRegId = bullRegId;
	}

	/**
	 * @return the bullRegNm
	 */
	public String getBullRegNm() {
		return bullRegNm;
	}

	/**
	 * @param bullRegNm the bullRegNm to set
	 */
	public void setBullRegNm(String bullRegNm) {
		this.bullRegNm = bullRegNm;
	}

	/**
	 * @return the bullRegDate
	 */
	public String getBullRegDate() {
		return bullRegDate;
	}

	/**
	 * @param bullRegDate the bullRegDate to set
	 */
	public void setBullRegDate(String bullRegDate) {
		this.bullRegDate = bullRegDate;
	}
}