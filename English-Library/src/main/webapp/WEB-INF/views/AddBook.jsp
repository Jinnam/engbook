<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
<jsp:include page="/WEB-INF/module/AdminTop.jsp"/>

	<div style="height:200px"></div>
	

	<div class="panel panel-default" style="width:60%" >
		<div class="panel-heading" style="background-color:#2F2F2F;color:white" align="center">도서 등록</div>
		<div class="panel-body" align="center">
			
			<form action="/addbook" method="post">
				<table class="table" style="color:black; width:50%" align="center">
					<tr>
						<td>도서관</td>
						<td><input type="text" readonly="readonly" value="조봉도서관" style="background-color:gray; text-align:center"/></td>
					</tr>
					<tr>
						<td>도서이름</td>
						<td><input type="text" name="bookName"/></td>
					</tr>
					<tr>
						<td>저자이름</td>
						<td><input type="text" name="writer"/></td>
					</tr>
					<tr>
						<td>출판사</td>
						<td><input type="text" name="publisher"/></td>
					</tr>
					<tr>
						<td>분류명</td>
						<td><input type="text" name="category"/></td>
					</tr>
					<tr>
						<td>장르</td>
						<td><input type="text" name="genre"/></td>
					</tr>
					<tr>
						<td>위치</td>
						<td><input type="text" name="bookLocation"/></td>
					</tr>
					<tr>
						<td colspan="2" align="right"><button type="submit" class="btn btn-default">등록</button></td>
					</tr>
				</table>
			</form>
			
		</div>
	</div>

	
	<div style="height:100px"></div>
	
<jsp:include page="/WEB-INF/module/footer.jsp"/>
</body>
</html>
