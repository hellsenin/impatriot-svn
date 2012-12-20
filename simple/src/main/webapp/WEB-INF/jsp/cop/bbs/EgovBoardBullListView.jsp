<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="egovframework.com.cmm.service.EgovProperties" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="ImgUrl" value="/images/egovframework/cop/bbs/"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
		<meta http-equiv="content-language" content="ko">
		<link href="<c:url value='/'/>css/common.css" rel="stylesheet" type="text/css" >
		<script type="text/javascript" src="<c:url value='/js/EgovBBSMng.js' />" ></script>
		<style type="text/css">
		    h1 {font-size:12px;}
		    caption {visibility:hidden; font-size:0; height:0; margin:0; padding:0; line-height:0;}
		</style>
	</head>
<body>
	<noscript class="noScriptTitle">자바스크립트를 지원하지 않는 브라우저에서는 일부 기능을 사용하실 수 없습니다.</noscript>
	<div class="default_tablestyle">
		<table summary="번호, 제목, 게시시작일, 게시종료일, 작성자, 작성일, 조회수   입니다" cellpadding="0" cellspacing="0">
			<caption>게시물 목록</caption>
			<colgroup>
				<col width="10%">
				<col width="10%">
				<col width="15%">
				<col width="8%">
			</colgroup>
			<thead>
				<tr>
					<th scope="col" class="f_field" nowrap="nowrap">번호</th>
					<th scope="col" nowrap="nowrap">제목</th>
					<th scope="col" nowrap="nowrap">작성자</th>
					<th scope="col" nowrap="nowrap">작성일</th>
				</tr>
			</thead>
			<tbody>
	
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<!-- loop 시작 -->                                
			  <tr>
				<td align="left">
					<form name="subForm" method="post" action="<c:url value='/cop/bbs${prefix}/selectBoardArticle.do'/>">
						<input type="hidden" name="bbsId" value="<c:out value='${result.bbsId}'/>" />
						<input type="hidden" name="nttId"  value="<c:out value="${result.nttId}"/>" />
						<span class="link"><input type="submit" style="width:320px;border:solid 0px black;text-align:left;" value="<c:out value="${result.nttSj}"/>" ></span>
					</form>
				</td>
				<td ><c:out value="${result.ntcrNm}"/></td>
				<td ><c:out value="${result.frstRegisterPnttm}"/></td>
			  </tr>
			 </c:forEach>
			 <c:if test="${fn:length(resultList) == 0}">
			 	<tr>
			 		<td colspan="5" ><spring:message code="common.nodata.msg" /></td>
				</tr>
			 </c:if>  
			</tbody>
		</table>
	</div>
 </body>
</html>