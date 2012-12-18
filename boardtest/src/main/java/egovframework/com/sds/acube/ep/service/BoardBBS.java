package egovframework.com.sds.acube.ep.service;

import java.io.Serializable;

import oracle.sql.CLOB;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 게시물에 대한 데이터 처리 모델 클래스
 *   수정일      수정자          수정내용
 *  -------    --------    ---------------------------
 *  2011.08.31  JJY            경량환경 템플릿 커스터마이징버전 생성
 *  </pre>
 */

@SuppressWarnings("serial")
public class BoardBBS implements Serializable {

	/**
	 * 게시판 아이디
	 */
	private String boardId = "";
	/**
	 * 게시판 명
	 */
	private String boardName = "";
	/**
	 * 게시물 아이디
	 */
	private String bullId = "";
	/**
	 * 게시물 제목
	 */
	private String bullTitle = "";
	/**
	 * 본문
	 */
	private CLOB content = null;
	/**
	 * 게시물 등록자 아이디
	 */
	private String regId = "";
	/**
	 * 게시물 등록자 명
	 */
	private String RegName = "";
	/**
	 * 게시물 등록일
	 */
	private String regDate = "";
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
	 * @return the boardName
	 */
	public String getBoardName() {
		return boardName;
	}
	/**
	 * @param boardName the boardName to set
	 */
	public void setBoardName(String boardName) {
		this.boardName = boardName;
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
	 * @return the content
	 */
	public CLOB getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(CLOB content) {
		this.content = content;
	}
	/**
	 * @return the regId
	 */
	public String getRegId() {
		return regId;
	}
	/**
	 * @param regId the regId to set
	 */
	public void setRegId(String regId) {
		this.regId = regId;
	}
	/**
	 * @return the regName
	 */
	public String getRegName() {
		return RegName;
	}
	/**
	 * @param regName the regName to set
	 */
	public void setRegName(String regName) {
		RegName = regName;
	}
	/**
	 * @return the regDate
	 */
	public String getRegDate() {
		return regDate;
	}
	/**
	 * @param regDate the regDate to set
	 */
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	/**
	 * toString 메소드를 대치한다.
	 */
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
}