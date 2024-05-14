<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="org.petrolpumpadmin.model.*,org.petrolpumpadmin.Service.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="admindashboard.jsp"%>
	<div class="col py-3">
		<form class="formarea" name="frm" action="addemployee" method="POST">
			<div class="form-group">
				<label for="exampleInputEmail1">Employee Name</label>
				<input type="text" class="form-control control"
					name="name" ; id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="ENTER EMPLOYEE NAME">
					
				<label for="exampleInputEmail1">Employee Email</label>
			    <input type="text" class="form-control control"
					name="email" ; id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="ENTER EMPLOYEE EMAIL">
					
				<label for="exampleInputEmail1">Employee Contact</label>
				<input type="text" class="form-control control"
					name="contact" ; id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="ENTER EMPLOYEE CONTACT">
					
					
				<label for="exampleInputEmail1">Employee Address</label>
				 <input type="text" class="form-control control"
					name="address" ; id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="ENTER EMPLOYEE ADDRESS">
					
					<label for="exampleInputEmail1">Employee Salary</label>
				<input type="text" class="form-control control"
					name="sal" ; id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="ENTER EMPLOYEE SALARY">
					
			</div>
			<br />
			<button type="submit" class="btn btn-primary">Add New
				Machine</button>
		</form>
	</div>
	</div>
	</div>
</body>
</html>