<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<form action=req_album_result.jsp>
<table border="1" width="800" heign="400">
<tr height="20%">
<th width="20%"></th>
<th width="20%">사진</th>
<th width="20%">가수</th>
<th width="20%">앨범 제목</th>
<th width="20%">발매일</th>
<tr align=center>
<td><input type="radio" name="title" value="sel1"></td>
<td><img src="10554246_20210325161233_500.jpg" width="100px"></td>
<td>IU</td>
<td>LILAC</td>
<td>2021.03.25</td>
</tr>
<tr align=center>
<td><input type="radio" name="title" value="sel2"></td>
<td><img src="1Cl5T0XXy1lz637307627208670072.jpg" width="100px"></td>
<td>BLACKPINK</td>
<td>BORN PINK</td>
<td>2022.08.19</td>
</tr>
<tr align=center>
<td colspan="5">
<input type="submit" value="확인">
</td>
</tr>
</table>
</div>
</form>


</body>
</html>