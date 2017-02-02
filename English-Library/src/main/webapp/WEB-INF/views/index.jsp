<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <div class="intro-lead-in">꿈과 사랑이 가득한</div>
                <div class="intro-heading">JB 도서관에 오신것을 환영합니다.</div>
                <!-- Button trigger modal -->
<button type="button" class="btn btn-warning btn-lg" data-toggle="modal" data-target="#myModal">
  회원가입
</button>

<!-- 회원가입  폼 -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">회원가입 신청서</h4>
      </div>
      <div class="modal-body">
      
      <!-- 회원가입 폼 -->
        <form action="/index" method="post">
			<table class="table table-hover">
				<tr>
					<td>도서관</td>
					
					<td><select name="libCode">
						<c:forEach var="library" items="${library}">
							<option value="${library.libCode}">${library.libName}</option>
						</c:forEach>
					</select>  </td>
				</tr>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="memberId"/>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="memberPw"/></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="memberName"/></td>
				</tr>
				<tr>
					<td>생년월일</td>
					<td><input type="text" name="memberBirthDay"/></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" size="3" maxlength="3" name="phone1"/>-
					<input type="text" size="4" maxlength="4" name="Phone2"/>-
					<input type="text" size="4" maxlength="4" name="Phone3"/></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="memberAddr"/>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<button type="submit" class="btn btn-warning">가입신청</button>&nbsp;<button type="reset" class="btn btn-warning">다시입력</button>
					</td>
				</tr>
			</table>
		</form>
	
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-warning" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-warning">Apply</button>
      </div>
    </div>
  </div>
</div>
        </div>
    </header>
<jsp:include page="/WEB-INF/module/footer.jsp"/>
</body>
</html>