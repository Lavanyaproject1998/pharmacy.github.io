<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<style>
.c1 {
	height: 60vh !important;
	width: 27vw !important;
	border: 2px solid pink !important;
}

</style>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
</head>
<body>
	<%
		String context = request.getContextPath();
	%>
	<div class="container">
		<table class="table table-bordered border-primary">
			<tr class="table-dark">
				<td>Product ID</td>
				<td>Product Name</td>
				<td>Product Type</td>
				<td>Product Price</td>
			</tr>
			<c:forEach items="${medicines}" var="medicines" varStatus="loop">
				<tr>
					<td><c:out value="${medicines.prodID}" /></td>
					<td><c:out value="${medicines.prodType}" /></td>
					<td><c:out value="${medicines.prodName}" /></td>
					<td><c:out value="${medicines.prodPrice}" /></td>
				</tr>
			</c:forEach>
		</table>
		
		
		<div class="container c1 p-3 mb-2 bg-secondary text-white">
			<form action="Orders.do" method="get">
			<div class="d-flex bd-highlight">
				<div class="mb-3 p-2 flex-fill bd-highligh">
					<label for="formGroupExampleInput" class="form-label" class="bg-success p-2 text-dark bg-opacity-25">
						Product ID:</label> <input type="text" class="form-control"
						id="formGroupExampleInput" placeholder="EnterProductID"
						name="pid" required />
				</div>
				<div class="mb-3 p-2 flex-fill bd-highlight">
					<label for="formGroupExampleInput" class="form-label" class="bg-success p-2 text-dark bg-opacity-25">
						User ID:</label> <input type="text" class="form-control"
						id="formGroupExampleInput" placeholder="EnterUserID"
						name="uid" required />
				</div>
			</div>
				<br> <label for="medicine" >Choose a Medicine type</label> <select
					name="medicines" id="cars" border-radius="3px">
					<option class="bg-success p-2 text-dark bg-opacity-25">Select</option>
					<option value="p">Personal Care</option>
					<option value="n">Nutrition</option>
					<option value="h">Health Care</option>
				</select><br><br>
			 Quantity:<input type="number" name="quantity"min="1" class="bg-success p-2 text-dark bg-opacity-25" required>
			  <br><br>
				 Submit:
				<button type="submit" class="bg-success p-2 text-dark bg-opacity-25" ><b>placeOrder</b></button>
	
			</form>
			<br>
		</div>
	</div>


</body>
</html>