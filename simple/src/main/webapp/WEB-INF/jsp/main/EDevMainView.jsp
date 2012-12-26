<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
    <title>제이와이케이 디벨로퍼</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="<c:url value='/'/>css/redmond/jquery-ui-1.9.2.custom.css" rel="stylesheet">
	<script src="<c:url value='/'/>js/jquery-1.8.3.js"></script>
	<script src="<c:url value='/'/>js/jquery-ui-1.9.2.custom.js"></script>
	<script>
		$(function() {
			$( "#tabs" ).tabs();
			
			$( "#regBull" ).click(function(){
			});
		});
	</script>
	<style>
		body{
			font: 80% "Trebuchet MS", sans-serif;
			margin: 30px;
		}
	</style>
</head>
<body>
    <header>
    </header>
    
    <nav>
    </nav>
  
    <artcle>
    	<div id="tabs">
    		<ul>
    			<li><a href="#tabs-1">공지사항</a></li>
    			<li><a href="#tabs-2">자유게시판</a></li>
    			<li><a href="#tabs-3">개인게시판</a></li>
    			<li><a href="#tabs-4">등록</a></li>
    		</ul>
    		<div id="tabs-1">
    			<table style="" border=1>
					<tbody>
						<tr>
							<td>
								<p>번호</p>
							</td>
							<td>
								<p>제목</p>
							</td>
							<td>
								<p>작성자</p>
							</td>
							<td>
								<p>작성일</p>
							</td>
						</tr>
					</tbody>
				</table>
				<c:forEach var="result" items="${resultList}" varStatus="status">
					<table style="" border=1>
						<tbody>
							<tr>
								<td>
									<p><c:out value="${status.count}"/></p>
								</td>
								<td>
									<p><c:out value="${result.bullTitle}"/></p>
								</td>
								<td>
									<p><c:out value="${result.bullRegNm}"/></p>
								</td>
								<td>
									<p><c:out value="${result.bullRegDate}"/></p>
								</td>
							</tr>
						</tbody>
					</table>
				</c:forEach>
    		</div>
    		<div id="tabs-2"></div>
    		<div id="tabs-3"></div>
    		<div id="tabs-4">
    			<form id="noticeReg" action="/dev/notice/bullReg.do">
	    			<table>
	    				<thead>게시물 등록</thead>
	    				<tbody>
	    					<tr>
	    						<td>
	    							<p>제목 : </p>
	    						</td>
	    						<td>
	    							<input id="regTitle" value="">
	    						</td>
	    					</tr>
	    					<tr>
	    						<td>
	    							<p>작성자ID : </p>
	    						</td>
	    						<td>
	    							<input id="regId" value="">
	    						</td>
	    					</tr>
	    					<tr>
	    						<td>
	    							<p>작성자명 : </p>
	    						</td>
	    						<td>
	    							<input id="regName" value="">
	    						</td>
	    					</tr>
	    					<tr>
	    						<td>
	    							<p>등록게시판 : </p>
	    						</td>
	    						<td>
	    							<input id="regBoardName" value="">
	    						</td>
	    					</tr>
	    					<tr>
	    						<td>
	    							<p>내용 : </p>
	    						</td>
	    						<td>
	    							<input id="regContent" value="">
	    						</td>
	    					</tr>
	    				</tbody>
	    				<tfoot>
	    					<button id="regBull">등록</button>
	    				</tfoot>
	    			</table>
    			</form>
    		</div>
    	</div>
    </artcle>
  
    <footer>
    </footer>
</body>
</html>