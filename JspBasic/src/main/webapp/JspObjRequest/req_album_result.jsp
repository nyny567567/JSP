<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String title = request.getParameter("title");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<% if(title.equals("sel1")) { %>
		<div align="center">
		<h2>선택하신 앨범 정보</h2>
		<hr>
		<p>
			당신이 선택하신 앨범은 IU의 <strong>LILAC</strong>  입니다.
		</p>
		<hr>
		<h3>타이틀 곡 뮤직 비디오</h3>
		<iframe width="1280" height="720" src="https://www.youtube.com/embed/v7bnOxV4jAc?autoplay=1" title="[MV] IU(아이유)_LILAC(라일락)" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe></div>
	<% } else if(title.equals("sel2")){ %>
	 	<div align="center">
		<h2>선택하신 앨범 정보</h2>
		<hr>
		<p>
			당신이 선택하신 앨범은 BLACK PINK의 <strong>BRON PINK</strong>  입니다.
		</p>
		<hr>
		<h3>타이틀 곡 뮤직 비디오</h3>
		<iframe width="1280" height="720" src="https://www.youtube.com/embed/POe9SOEKotk?autoplay=1" title="BLACKPINK - ‘Shut Down’ M/V" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
		
	<% } %>

</body>
</html>