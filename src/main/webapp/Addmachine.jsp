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
		<form class="formarea" name="frm" action="newmachine" method="POST">
			<div class="form-group">
				<label for="exampleInputEmail1">Machine Code</label> <br />
				<br /> <input type="text" class="form-control control"
					name="machinecode" ; id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter machine code">
					<br/><br/>
					<table>
					<%
					FuelService fservice=new FueltypeServiceImpl();
					List<FuelTypeModel> list=fservice.getAllfueltypes();
					for(FuelTypeModel m:list)
					{
						%>
						<tr>
						<td><input type='checkbox' name='ftype' value='<%=m.getId()%>'/>&nbsp;&nbsp;<%=m.getName() %></td>
						<td align='right'><input type='text' name='capacity' value=''/></td>
						</tr>
						<%
					}
					%>
					</table>
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