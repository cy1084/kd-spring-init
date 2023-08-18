<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="GET" action="/test">
		<input type="text" name="name">
		<button>GET</button>
	</form>
	<!-- localhost/test?name=어쩌고 로 감 -->

	<form method="POST" action="/test">
		<input type="text" name="name">
		<button>POST</button>
	</form>

</body>
</html>