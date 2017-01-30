<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
<jsp:include page="/WEB-INF/module/AdminTop.jsp"/>

	<div style="height:200px"></div>
	<center>
	<div class="panel panel-default" style="width:60%" >
		<div class="panel-heading" style="background-color:#2F2F2F;color:white" align="center">도서 폐기</div>
		<div class="panel-body">
			<table class="table" style="color:black; width:50%" align="center">
				<tr>
					<td>도서코드</td>
					<td><input type="text"/> <button class="btn btn-default">조회</button></td>
				</tr>
				<tr>
					<td>도서관명</td>
					<td><input type="text"/></td>
				</tr>
				<tr>
					<td>도서명</td>
					<td><input type="text"/></td>
				</tr>
				<tr>
					<td>저자이름</td>
					<td><input type="text"/></td>
				</tr>
				<tr>
					<td>출판사</td>
					<td><input type="text"/></td>
				</tr>
				<tr>
					<td>분류명</td>
					<td><input type="text"/></td>
				</tr>
				<tr>
					<td>장르</td>
					<td><input type="text"/></td>
				</tr>
				<tr>
					<td>위치</td>
					<td><input type="text"/></td>
				</tr>
				<tr>
					<td>폐기사유</td>
					<td><textarea rows="3" cols="19"></textarea> </td>
				</tr>
				<tr>
					<td colspan="2" align="right"><button class="btn btn-default">폐기</button>
				</tr>
			</table>
		</div>
	</div>
	</center>
	<div style="height:100px"></div>

<jsp:include page="/WEB-INF/module/footer.jsp"/>
</body>
</html>
