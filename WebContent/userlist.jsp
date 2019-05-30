<%@page import="org.ma.entity.User"%>
<%@page import="java.util.List"%>
<%@include file="/include/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container mtb">
<div align="center" style="background-color: #d1ffbe; color: black; padding: 20px; ">
<h1>Customer Details</h1>
</div>
	<div class="row">
		<table style="background-color:black;width:100%; height: 100%;">
		<thead>
		<th style="text-align: center;font-size: 20px;color:white;">User Id</th>
		<th style="text-align: center;font-size: 20px;color: white;">Username</th>
		<th style="text-align: center;font-size: 20px;color: white;">Frist Name</th>
		<th style="text-align: center;font-size: 20px;color: white;">Last Name</th>
		<th style="text-align: center;font-size: 20px;color: white;">email</th>
		<th style="text-align: center;font-size: 20px;color: white;">Reg-Date</th>
		<th style="text-align: center;font-size: 20px;color: white;">Action</th>
		</thead>
		<c:forEach items="${userlist}" var="user">
		<c:url var="updateuser" value="userController">
		<c:param name="page" value="updateuserform"></c:param>
		<c:param name="userId" value="${user.userId}"></c:param>
		</c:url>
		<c:url var ="deleteuser" value="userController">
		<c:param name="page" value="deleteuser"></c:param>
		<c:param name="userId" value="${user.userId}"></c:param>
		
		</c:url>
		
		
	
  
		<tr style=" color: white;">
		<td style="text-align: center;font-size: 20px;color: white;">${user.userId}</td>
		<td style="text-align: center;font-size: 20px;color: white;">${user.fristName}</td>
		<td style="text-align: center;font-size: 20px;color: white;">${user.lastName}</td>
		<td style="text-align: center;font-size: 20px;color: white;">${user.email}</td>
		<td style="text-align: center;font-size: 20px;color: white;">${user.userName}</td>
		<td style="text-align: center;font-size: 20px;color: white;">${user.regdate}</td>
        <td style="text-align: center;font-size: 20px;color: white;"><a href="${updateuser}">Update</a></td>
        <td style="text-align: center;font-size: 20px;color: white;"><a href="${deleteuser}">Delete</a></td>
		
		</tr style="color: white;">
		
	</c:forEach>
		
		</table>
	</div>
</div>





<%@include file="/include/footer.jsp" %>