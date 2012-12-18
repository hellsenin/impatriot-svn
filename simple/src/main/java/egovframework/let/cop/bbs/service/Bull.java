package egovframework.let.cop.bbs.service;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Bull implements Serializable {
	
	/**
	 * 게시물 첨부파일 아이디
	 */
	private String atchFileId = "";
	
	/**
	 * 게시판 아이디
	 */
	private String bbsId = "";
	
	/**
	 * 최초등록자 아이디
	 */
	private String frstRegisterId = "";
	
	/**
	 * 최초등록시점
	 */
	private String frstRegisterPnttm = "";
	
	/**
	 * 최종수정자 아이디
	 */
	private String lastUpdusrId = "";
	
	/**
	 * 최종수정시점
	 */
	private String lastUpdusrPnttm = "";
	
	/**
	 * 게시시작일
	 */
	private String ntceBgnde = "";
	
	/**
	 * 게시종료일
	 */
	private String ntceEndde = "";
	
	/**
	 * 게시자 아이디
	 */
	private String ntcrId = "";
	
	/**
	 * 게시자명
	 */
	private String ntcrNm = "";
	
	/**
	 * 게시물 내용
	 */
	private String nttCn = "";
	
	/**
	 * 게시물 아이디
	 */
	private long nttId = 0L;
	
	/**
	 * 게시물 번호
	 */
	private long nttNo = 0L;
	
	/**
	 * 게시물 제목
	 */
	private String nttSj = "";
	
	/**
	 * 부모글번호
	 */
	private String parnts = "0";
	
	/**
	 * 패스워드
	 */
	private String password = "";
	
	/**
	 * 조회수
	 */
	private int inqireCo = 0;
	
	/**
	 * 답장여부
	 */
	private String replyAt = "";
	
	/**
	 * 답장위치
	 */
	private String replyLc = "0";
	
	/**
	 * 정렬순서
	 */
	private long sortOrdr = 0L;
	
	/**
	 * 사용여부
	 */
	private String useAt = "";
	
	/**
	 * 게시 종료일
	 */
	private String ntceEnddeView = "";
	
	/**
	 * 게시 시작일
	 */
	private String ntceBgndeView = "";

	
	/**
	 * @return the atchFileId
	 */
	public String getAtchFileId() {
		return atchFileId;
	}

	/**
	 * @param atchFileId the atchFileId to set
	 */
	public void setAtchFileId(String atchFileId) {
		this.atchFileId = atchFileId;
	}

	/**
	 * @return the bbsId
	 */
	public String getBbsId() {
		return bbsId;
	}

	/**
	 * @param bbsId the bbsId to set
	 */
	public void setBbsId(String bbsId) {
		this.bbsId = bbsId;
	}

	/**
	 * @return the frstRegisterId
	 */
	public String getFrstRegisterId() {
		return frstRegisterId;
	}

	/**
	 * @param frstRegisterId the frstRegisterId to set
	 */
	public void setFrstRegisterId(String frstRegisterId) {
		this.frstRegisterId = frstRegisterId;
	}

	/**
	 * @return the frstRegisterPnttm
	 */
	public String getFrstRegisterPnttm() {
		return frstRegisterPnttm;
	}

	/**
	 * @param frstRegisterPnttm the frstRegisterPnttm to set
	 */
	public void setFrstRegisterPnttm(String frstRegisterPnttm) {
		this.frstRegisterPnttm = frstRegisterPnttm;
	}

	/**
	 * @return the lastUpdusrId
	 */
	public String getLastUpdusrId() {
		return lastUpdusrId;
	}

	/**
	 * @param lastUpdusrId the lastUpdusrId to set
	 */
	public void setLastUpdusrId(String lastUpdusrId) {
		this.lastUpdusrId = lastUpdusrId;
	}

	/**
	 * @return the lastUpdusrPnttm
	 */
	public String getLastUpdusrPnttm() {
		return lastUpdusrPnttm;
	}

	/**
	 * @param lastUpdusrPnttm the lastUpdusrPnttm to set
	 */
	public void setLastUpdusrPnttm(String lastUpdusrPnttm) {
		this.lastUpdusrPnttm = lastUpdusrPnttm;
	}

	/**
	 * @return the ntceBgnde
	 */
	public String getNtceBgnde() {
		return ntceBgnde;
	}

	/**
	 * @param ntceBgnde the ntceBgnde to set
	 */
	public void setNtceBgnde(String ntceBgnde) {
		this.ntceBgnde = ntceBgnde;
	}

	/**
	 * @return the ntceEndde
	 */
	public String getNtceEndde() {
		return ntceEndde;
	}

	/**
	 * @param ntceEndde the ntceEndde to set
	 */
	public void setNtceEndde(String ntceEndde) {
		this.ntceEndde = ntceEndde;
	}

	/**
	 * @return the ntcrId
	 */
	public String getNtcrId() {
		return ntcrId;
	}

	/**
	 * @param ntcrId the ntcrId to set
	 */
	public void setNtcrId(String ntcrId) {
		this.ntcrId = ntcrId;
	}

	/**
	 * @return the ntcrNm
	 */
	public String getNtcrNm() {
		return ntcrNm;
	}

	/**
	 * @param ntcrNm the ntcrNm to set
	 */
	public void setNtcrNm(String ntcrNm) {
		this.ntcrNm = ntcrNm;
	}

	/**
	 * @return the nttCn
	 */
	public String getNttCn() {
		return nttCn;
	}

	/**
	 * @param nttCn the nttCn to set
	 */
	public void setNttCn(String nttCn) {
		this.nttCn = nttCn;
	}

	/**
	 * @return the nttId
	 */
	public long getNttId() {
		return nttId;
	}

	/**
	 * @param nttId the nttId to set
	 */
	public void setNttId(long nttId) {
		this.nttId = nttId;
	}

	/**
	 * @return the nttNo
	 */
	public long getNttNo() {
		return nttNo;
	}

	/**
	 * @param nttNo the nttNo to set
	 */
	public void setNttNo(long nttNo) {
		this.nttNo = nttNo;
	}

	/**
	 * @return the nttSj
	 */
	public String getNttSj() {
		return nttSj;
	}

	/**
	 * @param nttSj the nttSj to set
	 */
	public void setNttSj(String nttSj) {
		this.nttSj = nttSj;
	}

	/**
	 * @return the parnts
	 */
	public String getParnts() {
		return parnts;
	}

	/**
	 * @param parnts the parnts to set
	 */
	public void setParnts(String parnts) {
		this.parnts = parnts;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the inqireCo
	 */
	public int getInqireCo() {
		return inqireCo;
	}

	/**
	 * @param inqireCo the inqireCo to set
	 */
	public void setInqireCo(int inqireCo) {
		this.inqireCo = inqireCo;
	}

	/**
	 * @return the replyAt
	 */
	public String getReplyAt() {
		return replyAt;
	}

	/**
	 * @param replyAt the replyAt to set
	 */
	public void setReplyAt(String replyAt) {
		this.replyAt = replyAt;
	}

	/**
	 * @return the replyLc
	 */
	public String getReplyLc() {
		return replyLc;
	}

	/**
	 * @param replyLc the replyLc to set
	 */
	public void setReplyLc(String replyLc) {
		this.replyLc = replyLc;
	}

	/**
	 * @return the sortOrdr
	 */
	public long getSortOrdr() {
		return sortOrdr;
	}

	/**
	 * @param sortOrdr the sortOrdr to set
	 */
	public void setSortOrdr(long sortOrdr) {
		this.sortOrdr = sortOrdr;
	}

	/**
	 * @return the useAt
	 */
	public String getUseAt() {
		return useAt;
	}

	/**
	 * @param useAt the useAt to set
	 */
	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}

	/**
	 * @return the ntceEnddeView
	 */
	public String getNtceEnddeView() {
		return ntceEnddeView;
	}

	/**
	 * @param ntceEnddeView the ntceEnddeView to set
	 */
	public void setNtceEnddeView(String ntceEnddeView) {
		this.ntceEnddeView = ntceEnddeView;
	}

	/**
	 * @return the ntceBgndeView
	 */
	public String getNtceBgndeView() {
		return ntceBgndeView;
	}

	/**
	 * @param ntceBgndeView the ntceBgndeView to set
	 */
	public void setNtceBgndeView(String ntceBgndeView) {
		this.ntceBgndeView = ntceBgndeView;
	}
}