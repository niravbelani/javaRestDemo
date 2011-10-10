<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Shoppe</title>
</head>
<body bgcolor="green">
	<font align="center"><h2>Welcome to the Online Shoppe</h2>
	</font>
	<div id="loginDiv">
		<form method="post" action="ProductSearchServlet">
			<table name="LoginTable" rows="4" Cols="2" border="0">
				<tr>
					<td>
						<h3>Please Login:</h3>
					</td>
					<td></td>
				</tr>
				<tr>
					<td>User Name:</td>
					<td><input type="text" id="username" name="username">
					</td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" id="password" name="password">
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="Login">
					</td>
					<td></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>