<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<input type="text" name="name">
	<br>
	<input type="text" name="age">
	<br>
	<input type="text" name="address">
	<br>
	<input type="text" name="birth">
	<br>
	<button onclick="get()">GET</button>
	<button onclick="post()">POST</button>
	<script>
		function get() {
		//body 가 없으므로 ? 기준 key, value를 보내야 함
		}
		function post() {
		//body를 이용해 json 형태로 보냄
			

			const xhr=new XMLHttpRequest();
			xhr.open('POST','/ajax/test');
			xhr.setRequestHeader('Content-Type','application/json;charset=UTF-8'); 
			xhr.onreadystatechange=function(){
				if(xhr.readyState===4){
					if(xhr.status===200){
						if(xhr.responseText=='1'){
							alert('정상 입력');
							  
						}
					}
				}
			}
			const param={
					name:document.querySelector('#name').value;
					age:document.querySelector('#age').value;
					address:document.querySelector('#address').value;
					birth:document.querySelector('#birth').value;
			}
			const json=JSON.stringify(param);
			xhr.send(json);
		}
</script>
</body>
</html>