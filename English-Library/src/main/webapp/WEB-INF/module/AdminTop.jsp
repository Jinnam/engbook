<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<!-- Theme Made By www.w3schools.com - No Copyright -->
	<title>Bootstrap Theme Simply Me</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<link href="/resources/admincss.css" rel="stylesheet" type="text/css" >
</head>
<body>
<!-- Navbar -->
<nav class="navbar navbar-default">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>                        
			</button>
		<a class="navbar-brand" href="#">JB-LIBRARY</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav navbar-right">
				<li role="presentation" class="dropdown">
					<a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-expanded="false">
					도서관관리 <span class="caret"></span>
					 </a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="/addlib">도서관등록</a></li>
					    </ul>
				</li>
				<li role="presentation" class="dropdown">
					<a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-expanded="false">
					도서관리 <span class="caret"></span>
					 </a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="/addbook">도서등록</a></li>
							<li><a href="#">도서폐기</a></li>
					    </ul>
				</li>
				<li role="presentation" class="dropdown">
					<a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-expanded="false">
					대여/반납<span class="caret"></span>
					 </a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#">도서대여</a></li>
							<li><a href="#">도서반납</a></li>
					    </ul>
				</li>
				
				<li role="presentation" class="dropdown">
					<a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-expanded="false">
					회원관리 <span class="caret"></span>
					 </a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="/approval">회비납부</a></li>
					    </ul>
				</li>
				<li><a href="#">로그아웃</a></li>
			</ul>
		</div>
	</div>
</nav>

</body>
</html>