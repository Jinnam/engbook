<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
<jsp:include page="/WEB-INF/module/AdminTop.jsp"/>
	<div style="height:200px"></div>
	<center>
	<div class="panel panel-default" style="width:60%" >
		<div class="panel-heading" style="background-color:#2F2F2F;color:white" align="center">회원 승인</div>
		<div class="panel-body">
			<form action="/approval" method="post">
				<table class="table" style="color:black" align="center">
					<thead>
					<tr>
						<td>아이디</td>
						<td>이름</td>
						<td>연락처</td>
						<td>주소</td>
						<td>승인</td>
					</thead>
					</tr>
					<c:forEach var="member" items="${list}">
						<tr>
							<td>${member.MEMBERID }</td>
							<td>${member.MEMBERNAME }</td>
							<td>${member.PHONE1}-${member.PHONE2}-${member.PHONE3}</td>
							<td>${member.MEMBERADDR }</td>
							<td><input type="checkbox" name="MEMBERID" value="${member.MEMBERID }"/></td>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="5" align="right"><button type="submit" class="btn btn-default">가입승인</button>
					</tr>
				</table>
			</form>
		</div>
	</div>
	</center>
	<div style="height:100px"></div>
	<jsp:include page="/WEB-INF/module/footer.jsp"/>
</body>
</html>
