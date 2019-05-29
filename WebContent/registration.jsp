<%@include file="/include/header1.jsp"%>

<div class="container mtb" style="background-color: blue;">
	<div class="row">

		<form action="${pageContext.request.contextPath}/siteController"
			method="post">

			<input type="hidden" name="action" value="userregistration">

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
						<td><input type="text" name="fristname" value="" /></td>
					</tr>
					<tr>
						<td style="text-align: center; font-size: 20px; color: white;">Last
							Name</td>
						<td><input type="text" name="lastname" value="" /></td>
					</tr>
					<tr>
						<td style="text-align: center; font-size: 20px; color: white;">Email</td>
						<td><input type="text" name="email" value="" /></td>
					</tr>
					<tr>
						<td style="text-align: center; font-size: 20px; color: white;">User
							Name</td>
						<td><input type="text" name="username" value="" /></td>
					</tr>
					<tr>
						<td style="text-align: center; font-size: 20px; color: white;">Password</td>
						<td><input type="password" name="password" value="" /></td>
					</tr>
					<tr>
						<td></td>
						<td style="text-align: center; font-size: 20px; color: white;"><input
							type="submit" value="Submit" />| <input type="reset"
							value="Reset" /></td>
						<td></td>
					</tr>
					<tr>
						<td colspan="2"
							style="text-align: center; font-size: 20px; color: white;">Already
							registered!! <a
							style="text-align: center; font-size: 20px; color: white;"
							href="login.jsp">Login Here</a>
						</td>
					</tr>
				</tbody>
			</table>
			</center>
		</form>
	</div>
</div>
<%@include file="/include/footer1.jsp"%>