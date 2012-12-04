<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>로그인 화면</title>
<link href="<c:url value='/'/>css/common.css" rel="stylesheet" type="text/css" >
<script type="text/javascript">
</script>
</head>
<body> 
<article> 
    <header> 
        <h1>HTML5 오픈 컨퍼런스가 열립니다.</h1> 
    </header> 
    <p>2010 년 7 월 2 일 ...</p> 
    <!-- 블로그 글 내용 --> 
    <section> 
        <h1>댓글</h1> 
        <article> 
            <footer><!-- footer 요소가 섹션의 처음에 위치할 수도 있다. --> 
                <p>김민석님의 댓글</p> 
                <p><time pubdate datetime="2010-06-20T19:10-
08:00"></time></p> 
            </footer> 
            <p>...댓글 내용...</p> 
        </article> 
        <article> 
            <footer> 
                <p>이명호님의 댓글</p> 
                <p><time pubdate datetime="2009-06-20T19:15-
08:00"></time></p> 
            </footer> 
            <p>...댓글 내용...</p> 
        </article> 
        <!-- 생략 --> 
    </section> 
    <footer> 
        <p> 
            <time pubdate datetime="2010-06-20T14:36-08:00">어제</time>  
            작성 되었음
        </p> 
    </footer> 
</article> 
</body> 
</html>

