<%--
  Class Name : index.jsp
  Description : 최초화면으로 메인화면으로 이동한다.(system)
  Modification Information
 
      수정일         수정자                   수정내용
    -------    --------    ---------------------------
     2011.08.31  JJY       경량환경 버전 생성
 
    author   : 실행환경 개발팀 JJY
    since    : 2011.08.31
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
<jsp:forward page="/cmm/main/mainPage.do"/>
--%>
<!--
<script type="text/javaScript">document.location.href="<c:url value='/cmm/main/mainPage.do'/>"</script> 
-->
<!DOCTYPE html>
<html>
<head>
    <title>JYK Developer</title>
    <meta charset="utf-8" />
  
    <script type="text/javascript">
        document.createElement('header');
        document.createElement('menu');
        document.createElement('content');
        document.createElement('footer');
    </script>
  
    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
        }
  
        header, menu, content, footer {
            display: block;
        }
  
        menu ul {
            list-style-type: none;
        }
  
        menu ul li {
            float: left;
            padding: 5px 20px;
        }
  
        content, footer {
            clear: both;
        }
    </style>
</head>
<body>
    <header>
        <h1>JYK Developer</h1>
        <menu>
            <ul>
                <li>
                    <a href="<c:url value='/cmm/main/mainPage.do'/>" title="snippets">정부표준 프레임워크 메인 페이지</a>
                </li>
                <li>
                    <a href="<c:url value='/dev/main/mainPage.do'/>" title="Portfolio">JYK Developer</a>
                </li>
                <li>
                    <a href="<c:url value='/dev/navi/mainPage.do'/>" title="Portfolio">JYK Navi</a>
                </li>
            </ul>
        </menu>
    </header>
  
    <content>
    </content>
  
    <footer>
    </footer>
</body>
</html>