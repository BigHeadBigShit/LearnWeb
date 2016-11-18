<%@ page language="java" contentType="text/html;" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Log in</title>
<link rel="stylesheet" type="text/css" href="css/basic.css"/>
<script type="text/javascript" src="js/onclick.js"></script>
</head>
<body>
<jsp:include page="jsp/header.jsp" />
<form action="" method="post">
	name: <input type="text" name="name" /> <br />
	email: <input type="text" name="email" /> <br />
	password: <input type="password" name="password" /> <br />	 
	<input type="submit" value="submit" />
	<input type="reset" value="reset"> 
</form>

</body>
</html>