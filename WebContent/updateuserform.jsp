<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="/include/header1.jsp"%>

	<div class="container mtb" style="background-color: blue;">
		<div class="row">

			<form action="${pageContext.request.contextPath}/userController"
				method="post">
				<input type="hidden" name="operation" value="updateUser"> <input
					type="hidden" name="userId" value="${theUser.userId}">



				<table
					style="background-color: navy; width: 70%; height: 100%; margin-left: 20%;">
					<thead>
						<tr>
							<th colspan="2"
								style="text-align: center; font-size: 40px; color: white;">Enter
								Information Here</th>
						</tr>
					</thead>
					<tbody>

						<tr>
							<td style="text-align: center; font-size: 20px; color: white;">First
								Name</td>
							<td><input type="text" name="fristname"
								value="${theUser.fristName}" /></td>
						</tr>
						<tr>
							<td style="text-align: center; font-size: 20px; color: white;">Last
								Name</td>
							<td><input type="text" name="lastname"
								value="${theUser.lastName}" /></td>
						</tr>
						<tr>
							<td style="text-align: center; font-size: 20px; color: white;">Email</td>
							<td><input type="text" name="email" value="${theUser.email}" /></td>
						</tr>
						<tr>
							<td style="text-align: center; font-size: 20px; color: white;">User
								Name</td>
							<td><input type="text" name="username"
								value="${theUser.userName}" /></td>
						</tr>

						<tr>
							<td></td>
							<td style="text-align: center; font-size: 20px; color: white;"><input
								type="submit" value="Submit" />| <input type="reset"
								value="Reset" /></td>
							<td></td>
						</tr>

					</tbody>
				</table>
				</center>
			</form>
		</div>
	</div>
	<%@include file="/include/footer1.jsp"%>
</body>
</html>