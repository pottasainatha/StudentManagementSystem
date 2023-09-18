<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>


	<form action="Insert" method="post">
		<div>
			<h2>Registration_Details :-</h2>
			<table align="center">
				<tr>
					<td>Full_name :</td>
					<td><input type="text" name="name" id="tbname"></td>
				</tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr>
					<td>Email_Id:</td>
					<td><input type="email" name="email" id="tbname"></td>
				</tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password" id="tbpassword"></td>
				</tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr>
					<td>Mobile_number</td>
					<td><input type="tel" name="mobile" id="tbmobile"></td>
				</tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr>
					<td>Gender :</td>
					<td><input type="radio" name="gender" value="Male">Male&nbsp;&nbsp;
						<input type="radio" name="gender" value="Female">Female&nbsp;&nbsp;
						<input type="radio" name="gender" value="Others">Others</td>
				</tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr>
					<td>City :</td>
				<td>	<select name="city" id="city">
						<option value="Banglore">Banglore</option>
						<option value="Manglore">Manglore</option>
						<option value="Gokarna">Gokarna</option></td>

					</select>

					<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></table>

             <input type="submit">
		</div>




	</form>
</body>
</html>