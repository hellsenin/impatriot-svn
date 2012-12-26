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
		$( "#accordion" ).accordion();
		
		var availableTags = [
			"ActionScript",
			"AppleScript",
			"Asp",
			"BASIC",
			"C",
			"C++",
			"Clojure",
			"COBOL",
			"ColdFusion",
			"Erlang",
			"Fortran",
			"Groovy",
			"Haskell",
			"Java",
			"JavaScript",
			"Lisp",
			"Perl",
			"PHP",
			"Python",
			"Ruby",
			"Scala",
			"Scheme"
		];
		$( "#autocomplete" ).autocomplete({
			source: availableTags
		});
		
		$( "#button" ).button();
		$( "#radioset" ).buttonset();
		
		$( "#tabs" ).tabs();
		
		$( "#tabs-1" ).addClass( "ui-datepicker" );
		
		$( "#dialog" ).dialog({
			autoOpen: false,
			width: 400,
			buttons: [
				{
					text: "Ok",
					click: function() {
						$( this ).dialog( "close" );
					}
				},
				{
					text: "Cancel",
					click: function() {
						$( this ).dialog( "close" );
					}
				}
			]
		});

		// Link to open the dialog
		$( "#dialog-link" ).click(function( event ) {
			$( "#dialog" ).dialog( "open" );
			event.preventDefault();
		});
		
		$( "#datepicker" ).datepicker({
			inline: true
		});
		
		$( "#slider" ).slider({
			range: true,
			values: [ 17, 67 ]
		});
		
		$( "#progressbar" ).progressbar({
			value: 20
		});

		// Hover states on the static widgets
		$( "#dialog-link, #icons li" ).hover(
			function() {
				$( this ).addClass( "ui-state-hover" );
			},
			function() {
				$( this ).removeClass( "ui-state-hover" );
			}
		);
	});
	</script>
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
									<p><c:out value="${result.frstRegisterPnttm}"/></p>
								</td>
								<td>
									<p><c:out value="${result.frstRegisterPnttm}"/></p>
								</td>
								<td>
									<p><c:out value="${result.frstRegisterPnttm}"/></p>
								</td>
								<td>
									<p><c:out value="${result.frstRegisterPnttm}"/></p>
								</td>
							</tr>
						</tbody>
					</table>
				</c:forEach>
    		</div>
    		<div id="tabs-2"></div>
    		<div id="tabs-3"></div>
    	</div>
    </artcle>
  
    <footer>
    </footer>
</body>
</html>