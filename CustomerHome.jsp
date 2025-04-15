<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Home Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
	integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
	crossorigin="anonymous" />
	
<style>
.i1{
	
	color:yellow;

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
	<h3 align="center">
		WelCome User: <font color='Green'>${requestScope.Name} <font
			color='red'><i class="fas fa-user-tie"></i>
	</h3>
	<div class="card text-center">
		<div class="card-header">
			<ul class="nav nav-tabs card-header-tabs navbar-dark bg-dark">
				<li class="nav-item"><a class="nav-link active bg-success p-2 text-white bg-opacity-75"
					aria-current="true" href="#">Customer</a></li>
				<li class="nav-item dropdown"><label
					class="nav-link dropdown-toggle" id="navbarDarkDropdownMenuLink"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">
						Shop By Category<i class="fas fa-cart-plus i1"></i> </label>
					<ul class="dropdown-menu dropdown-menu-dark"
						aria-labelledby="navbarDarkDropdownMenuLink">
						<li><a class="dropdown-item" href="PersonalCareMedicine.do"
							target="fr2">Personal care</a></li>
						<li><a class="dropdown-item" href="NutritionMedicine.do" target="fr2">Nutrition</a></li>
						<li><a class="dropdown-item" href="HealthCareMedicine.do" target="fr2">Health Care</a></li>
					</ul></li>
				
				<li class="nav-item"><a class="nav-link" href="<%=context%>\pages\getOrder.jsp" target="fr2">Get All Orders<i class="fas fa-search i1"></i></a></li>
				<li class="nav-item"><a class="nav-link" href="<%=context%>\pages\updateOrder.jsp" target="fr2">Update
						Order<i class="fas fa-edit i1"></i></a></li>
				<li class="nav-item"><a class="nav-link" href="<%=context%>\pages\cancelOrder.jsp" target="fr2">Cancel
						Order<i class="fas fa-trash-alt i1"></i></a></li>
				<li class="nav-item"><a class="nav-link" href="Logout.do">LogOut<i class="fas fa-power-off i1"></i></a></li>
				<li class="nav-item"><a class="nav-link disabled">Contact
						Us<i class="fas fa-id-card-alt i1"></i></a></li>
			</ul>
		</div>

	</div>
<iframe name="fr2" width="100%" height="550" frameborder="0"
			 id="bg"> </iframe>


</body>
</html>