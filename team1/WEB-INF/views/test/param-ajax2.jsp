<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
		</tr>
		<tbody id="tBody"></tbody>
	</table>
	<button onclick="location.href='/views/test/param-ajax'">등록</button>
	<script>
	window.addEventListener('load',function(){
		//alert('load');
		const xhr=new XMLHttpRequest();
		xhr.open('GET','/params');
		xhr.setRequestHeader('Content-Type','application/json;charset=UTF-8'); 
		xhr.onreadystatechange=function(){
			if(xhr.readyState===4){
				if(xhr.status===200){
					const paramList=JSON.parse(xhr.responseText);
					let html='<tr>';
					if(xhr.responseText=='1'){
						alert('정상 입력');
						  
					}
				}
			}
		}
	})
	</script>
</body>
</html>