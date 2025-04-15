<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
</head>
<body>
	<%
		String context = request.getContextPath();
	%>
	<table class="table table-bordered border-primary">

		<tr class="table-dark">
			<td>User ID</td>
			<td>User Name</td>
			<td>Order ID</td>
			<td>Product ID</td>
			<td>Email ID</td>
			<td>Contact Number</td>
			<td>City</td>
			<td>Pincode</td>
			<td>Product Type</td>
			<td>Product Name</td>
			<td>Product price</td>
			<td>Quantity</td>
		</tr>


		<c:forEach items="${orders}" var="order" varStatus="loop">
			<tr>
				<td><c:out value="${order.userID}" /></td>
				<td><c:out value="${order.userName}" /></td>
				<td><c:out value="${order.orderID }" /></td>
				<td><c:out value="${order.prodID }" /></td>
				<td><c:out value="${ order.emailID}" /></td>
				<td><c:out value="${order.contactnuber}" /></td>
				<td><c:out value="${order.city}" /></td>
				<td><c:out value="${order.pinCode }" /></td>
				<td><c:out value="${order.prodType}" /></td>
				<td><c:out value="${order.prodName}" /></td>
				<td><c:out value="${order.prodPrice}" /></td>
				<td><c:out value="${order.quantity}" /></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>