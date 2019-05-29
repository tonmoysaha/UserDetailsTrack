<%@include file="/include/header1.jsp"%>

<div class="container mtb">

          <div class="background">
		<form action="${pageContext.request.contextPath}/siteController" method="post"> 
		<h1>${reg}</h1>
		<input type="hidden" name="action" value="login">
			<center>
				<table class="login-form ">
					<thead>
						<tr>
							<th colspan="2"
								style="text-align: center; font-size: 40px; color: white;">Login
								Here</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td style="text-align: center; font-size: 20px; color: white;">UserName</td>
							<td style="font-size: 20px;,color: black; font-weight: bolder;"><input type="text" name="uname" value="" placeholder="enter username" /></td>
						</tr>
						<tr>
							<td style="text-align: center; font-size: 20px; color: white;">Password</td>
							<td style="font-size: 20px;,color: black;font-weight: bold;"><input type="password" name="pass" value="" placeholder="enter password" /></td>
						</tr>
						<tr>
							<td></td>
							<td  style="background-color: navy;font-size: 20px; color: black;font-weight: bold;"><input type="submit" value="Login" /> | <input
								type="reset" value="Reset" /></td>

						</tr>
						<tr>
							<td colspan="2"
								style="text-align: center; font-size: 20px; color: white;">Yet
								Not Registered!! <a href="registration.jsp">Register Here</a>
							</td>
						</tr>
					</tbody>
				</table>
			</center>
		</form>
	</div>
</div>
<%@include file="/include/footer1.jsp"%>