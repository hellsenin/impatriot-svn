package egovframework.com.sds.acube.ep.service;

import java.io.Serializable;
import java.util.ArrayList;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 게시물 관리를 위한 VO 클래스
 * @author 공통 서비스 개발팀 이삼섭
 * @since 2009.03.19
 * @version 1.0
 * @see
 *  
 * <pre>
 * << 개정이력(Modification Information) >>
 * 
 *   수정일      수정자          수정내용
 *  -------    --------    ---------------------------
 *  2009.03.19  이삼섭          최초 생성
 *  2009.06.29  한성곤		   2단계 기능 추가 (댓글관리, 만족도조사)
 *  2011.08.31  JJY            경량환경 템플릿 커스터마이징버전 생성 
 *  
 *  </pre>
 */
@SuppressWarnings("serial")
public class BoardBBSListVO extends BoardBBS implements Serializable {
	
	/**
	 * 게시물 리스트
	 */
	private ArrayList<String> boardList;
	
    /**
     * toString 메소드를 대치한다.
     */
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }

	/**
	 * @return the boardList
	 */
	public ArrayList<String> getBoardList() {
		return boardList;
	}

	/**
	 * @param boardList the boardList to set
	 */
	public void setBoardList(ArrayList<String> boardList) {
		this.boardList = boardList;
	}

}