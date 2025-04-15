<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
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


	<div class="bg-success p-2 text-dark bg-opacity-25">

		<%
			String context = request.getContextPath();
		%>
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active"
				aria-current="page" href="<%=context%>\pages\banner.jsp"
				target="fr1">Home</a></li>
			<li class="nav-item"><a class="nav-link active"
				aria-current="page" href="#">aboutus</a></li>
			<li class="nav-item"><a class="nav-link"
				href="<%=context%>\pages\Login.jsp" target="fr1">login</a></li>
			<li class="nav-item"><a class="nav-link"
				href="<%=context%>\pages\Register.jsp" target="fr1">Registration</a></li>
			<li class="nav-item"><a class="nav-link disabled">Parmacy</a></li>
		</ul>



		<iframe name="fr1" width="100%" height="600" frameborder="0"
			src="<%=context%>\pages\banner.jsp" id="bg"> </iframe>



	</div>

</body>
</html>