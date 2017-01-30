<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
<jsp:include page="/WEB-INF/module/MemberTop.jsp"/>
<!-- Header -->
    <header>
        <div id="mainbody" align="center">
        	<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
			<form action="login" method="post">
                <table>
                	<tr>
                		<td align="center">ID</td>
                		<td><input type="text" name="ID" style="color:black"/></td><br/>
                	</tr>
                	<tr>
                		<td>PASSWORD</td>
                		<td><input type="password" name="PASSWORD" style="color:black"/></td>
                	</tr>
                	<tr>
                		<td colspan="2" align="right">
                		<button type="submit" btn btn-warning">·Î±×ÀÎ</button>
                		</td>
                	</tr>
                </table>
			</form>
        </div>
    </header>

<jsp:include page="/WEB-INF/module/footer.jsp"/>
</body>
</html>
