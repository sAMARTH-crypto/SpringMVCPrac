<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code = "ecomm.customer.login.page.title"/></title>

<style>

span {color:red;
	font-family: verdana;}
</style>

</head>
<body>
<form:form action ="customerLogin" method="post" modelAttribute="loginForm">

<table>

	<tr>
	
		<td><spring:message code="ecomm.customer.login.un.lable"/></td>
		<td><form:input path="username"/></td>
		<td><span><form:errors path="username"/></span></td>
	</tr>
    <tr>
	
		<td><spring:message code ="ecomm.customer.login.pw.lable"/></td>
		<td><form:password path="password"/></td>
		<td><span><form:errors path="password"/></span></td>
	
	</tr>
	
	<tr>
		
		<td><input type="submit" value='<spring:message code = "ecom.customer.login.submit.lable"/>'/></td>
		
	</tr>

</table>



</form:form>
</body>
</html>