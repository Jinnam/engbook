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
		<div class="panel-heading" style="background-color:#2F2F2F;color:white" align="center">ȸ������</div>
		<div class="panel-body">
		
			<table class="table" style="color:black; width:60%" align="center">
				<tr>
					<td>ȸ�����̵�</td>
					<td><input type="text" name="memberId" id="memberId"/>
						<button id="memberBtn" class="btn btn-default">��ȸ</button>
					</td>
				</tr>
				<tr>
					<td>�̸�</td>
					<td><input type="text" name = "memberName" id="memberName" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>��ȭ��ȣ</td>
					<td><input type="text" name = "memberPhone" id="memberPhone" readonly="readonly"/></td>
				</tr>
			</table>
		</div>
	</div>


	<div class="panel panel-default" style="lign:center">
		<div class="panel-heading" style="background-color:#2F2F2F;color:white; align:center">��������</div>
		<div class="panel-body" style="align:center">
		
			<table class="table" style="color:black; align :center">
				<tr>
					<td>�����ڵ�</td>
					<td><input type="text" name="bookCode" id="bookCode"/>
						<button class="btn btn-default" id="bookbtn">��ȸ</button> 
					</td>
				</tr>
				<tr>
					<td>������</td>
					<td><input type="text" name="bookName" id="bookName"/></td>
				</tr>
				<tr>
					<td>�����̸�</td>
					<td><input type="text" name="writer" id="writer"/></td>
				</tr>
				<tr>
					<td>���ǻ�</td>
					<td><input type="text" name="publisher" id="publisher"/></td>
				</tr>
				<tr>
					<td>�з���</td>
					<td><input type="text" name="category" id="category"/></td>
				</tr>
				<tr>
					<td>�帣</td>
					<td><input type="text" name="genre" id="genre"/></td>
				</tr>
				<tr>
					<td>��ġ</td>
					<td><input type="text" name="bookLocation" id="bookLocation"/></td>
				</tr>
				<tr>
					<td>�뿩������</td>
					<td><input type="text" name="rentalStartDay" id="rentalStartDay"></td>
				</tr>
				<tr>
					<td>�ݳ�������	</td>
					<td><input type="text"/></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td>�����ݾ�</td>
					<td><input type="text"/>��</td>
				</tr>
				<tr>
					<td colspan="2" align="right"><button class="btn btn-default">����/�뿩</button></td>
				</tr>
			</table>
		</div>
	</div>

	<div style="height:100px"></div>
<script>
$(document).ready(function(){
    $("#memberBtn").click(function(){
    	console.log('��ưŬ��');
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
