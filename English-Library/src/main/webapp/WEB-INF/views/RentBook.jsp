<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
<jsp:include page="/WEB-INF/module/AdminTop.jsp"/>

<!-- First Container -->

	<div style="height:100px"></div>

	<div class="panel panel-default" style="width:40%" align="left">
		<div class="panel-heading" style="background-color:#2F2F2F;color:white" align="center">회원정보</div>
		<div class="panel-body">
		
			<table class="table" style="color:black; width:60%" align="center">
				<tr>
					<td>회원아이디</td>
					<td><input type="text" name="memberId" id="memberId"/>
						<button id="memberBtn" class="btn btn-default">조회</button>
					</td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name = "memberName" id="memberName" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name = "memberPhone" id="memberPhone" readonly="readonly"/></td>
				</tr>
			</table>
		</div>
	</div>


	<div class="panel panel-default" style="lign:center">
		<div class="panel-heading" style="background-color:#2F2F2F;color:white; align:center">도서정보</div>
		<div class="panel-body" style="align:center">
		
			<table class="table" style="color:black; align :center">
				<tr>
					<td>도서코드</td>
					<td><input type="text" name="bookCode" id="bookCode"/>
						<button class="btn btn-default" id="bookbtn">조회</button> 
					</td>
				</tr>
				<tr>
					<td>도서명</td>
					<td><input type="text" name="bookName" id="bookName"/></td>
				</tr>
				<tr>
					<td>저자이름</td>
					<td><input type="text" name="writer" id="writer"/></td>
				</tr>
				<tr>
					<td>출판사</td>
					<td><input type="text" name="publisher" id="publisher"/></td>
				</tr>
				<tr>
					<td>분류명</td>
					<td><input type="text" name="category" id="category"/></td>
				</tr>
				<tr>
					<td>장르</td>
					<td><input type="text" name="genre" id="genre"/></td>
				</tr>
				<tr>
					<td>위치</td>
					<td><input type="text" name="bookLocation" id="bookLocation"/></td>
				</tr>
				<tr>
					<td>대여시작일</td>
					<td><input type="text" name="rentalStartDay" id="rentalStartDay"></td>
				</tr>
				<tr>
					<td>반납예정일	</td>
					<td><input type="text"/></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td>결제금액</td>
					<td><input type="text"/>원</td>
				</tr>
				<tr>
					<td colspan="2" align="right"><button class="btn btn-default">결제/대여</button></td>
				</tr>
			</table>
		</div>
	</div>

	<div style="height:100px"></div>
<script>
$(document).ready(function(){
    $("#memberBtn").click(function(){
    	console.log('버튼클릭');
       $.ajax({
    	   url : "/rentmember",
    	   type : "POST",
    	   data : {"memberId" : $('#memberId').val()},
    	   dataType : "json",
    	   success : function(data){
    		   console.log(data);
				var memberName=data.memberName;
				var memberPhone=data.memberPhone;
				$('#memberName').val(memberName);
				$('#memberPhone').val(memberPhone);
				
    	   }
       })
    });
 
	$("#bookbtn").click(function(){
		$.ajax({
			url : "/selectbook",
			type : "POST",
			data : {"bookCode" : $('#bookCode').val()},
			dateType : "json",
			success: function(data){
				console.log(data);
				$('#bookName').val(data.bookName);
				$('#writer').val(data.writer);
				$('#publisher').val(data.publisher);
				$('#category').val(data.category);
				$('#genre').val(data.genre);
				$('#bookLocation').val(data.bookLocation);
				$('#rentalStartDay').val(data.rentalStartDay);
			}
			
		})		
		
	});
});
</script>

<jsp:include page="/WEB-INF/module/footer.jsp"/>

</body>
</html>
