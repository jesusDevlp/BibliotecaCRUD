<%@page import="java.util.List"%>
<%@page import="com.cibertec.beans.PrestamoDTO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Préstamo</title>
<!-- Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous" />
<!-- Custom CSS -->
<link rel="stylesheet" href="css/interfaz.css" />
<script src="https://kit.fontawesome.com/abe8abb470.js"></script>
</head>

<body>
	<%
		List<PrestamoDTO> da = (List<PrestamoDTO>) request.getAttribute("data");
	%>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<b><a class="navbar-brand" style="font-size: 40px" href="#">Biblioteca</a></b>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown"
				aria-controls="navbarNavDarkDropdown" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
				<ul class="navbar-nav">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDarkDropdownMenuLink" role="button"
						data-bs-toggle="dropdown" aria-expanded="false">
							Mantenimientos </a>
						<ul class="dropdown-menu dropdown-menu-dark"
							aria-labelledby="navbarDarkDropdownMenuLink">
							<li><a class="dropdown-item"
								href="ServletCliente?tipo=listar">Cliente</a></li>
							<li><a class="dropdown-item" href="ServletLibro?tipo=listar">Libro</a></li>
							<li><a class="dropdown-item"
								href="ServletPrestamo?tipo=listar">Préstamo</a></li>
						</ul></li>
				</ul>
				<ul class="navbar-nav">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDarkDropdownMenuLink" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Registros </a>
						<ul class="dropdown-menu dropdown-menu-dark"
							aria-labelledby="navbarDarkDropdownMenuLink">
							<li><a class="dropdown-item" href="#">Cliente</a></li>
							<li><a class="dropdown-item" href="#">Libro</a></li>
						</ul></li>
				</ul>
				<ul class="navbar-nav">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDarkDropdownMenuLink" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Consultas </a>
						<ul class="dropdown-menu dropdown-menu-dark"
							aria-labelledby="navbarDarkDropdownMenuLink">
							<li><a class="dropdown-item" href="#">Cliente</a></li>
							<li><a class="dropdown-item" href="#">Libro</a></li>
						</ul></li>
				</ul>
				<ul class="navbar-nav">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDarkDropdownMenuLink" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Reportes </a>
						<ul class="dropdown-menu dropdown-menu-dark"
							aria-labelledby="navbarDarkDropdownMenuLink">
							<li><a class="dropdown-item" href="#">Cliente</a></li>
							<li><a class="dropdown-item" href="#">Libro</a></li>
						</ul></li>
				</ul>

			</div>
		</div>
	</nav>
	<div class="container my-3">
		<div class="row">
			<div class="col-sm-12 col-md-4 col-lg-4 col-xl-4 py-4 bg-white">
				<h2>Añadir Préstamo</h2>
				<form action="ServletPrestamo?tipo=registrar" id="frmregistro"
					method="post">
					<div class="mb-3">
						<label for="nombre" class="form-label">Id Libro:</label> <input
							type="text" class="form-control" name="txt_libro" id="libro"
							placeholder="Id Libro" autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">Id Cliente:</label> <input
							type="text" class="form-control" name="txt_cliente" id="cliente"
							placeholder="Id Cliente" autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">Fecha Salida:</label> <input
							type="date" class="form-control" name="txt_salida" id="fechasalida"
							placeholder="Fecha Salida" autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">Fecha Máxima a Devolver:</label> <input
							type="date" class="form-control" name="txt_devolver"
							id="fechamax" placeholder="Fecha Máxima a Devolver" autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">Fecha Devolución:</label> <input type="date" class="form-control"
							name="txt_devolucion" id="fechadev" placeholder="Fecha Devolución"
							autofocus />
					</div>

					<div class="d-grid gap-2">
						<button class="btn btn-success" type="submit">Registrar</button>
						<button class="btn btn-secondary">Limpiar</button>
					</div>
				</form>
			</div>
			<div class="col-sm-12 col-md-8 col-lg-8 col-xl-8 py-4 bg-white">
				<h2>Listado de Prestamos</h2>
				<table class="table table-dark table-striped">
					<thead>
						<tr>
							<th class="centrado">Número Pedido</th>
							<th class="centrado">Nombre Libro</th>
							<th class="centrado">Nombre Cliente</th>
							<th class="centrado">Fecha Salida</th>
							<th class="centrado">Fecha Máxima Devolver</th>
							<th class="centrado">Fecha Devolución</th>
							<th colspan="2">ACCIONES</th>
						</tr>
					</thead>

					<%
						if (da != null) {
						for (PrestamoDTO a : da) {
					%>
					<tbody>

						<tr>
							<td class="centrado"><%=a.getNroPedido()%></td>
							<td class="centrado"><%=a.getNombreLibro()%></td>
							<td class="centrado"><%=a.getNombreCliente()%></td>
							<td class="centrado"><%=a.getFechaSalida()%></td>
							<td class="centrado"><%=a.getFechaMaxDevolver()%></td>
							<td class="centrado"><%=a.getFechaDevolucion()%></td>
														<td class="centrado"><a
								href="ServletPrestamo?tipo=buscar&cod=<%=a.getNroPedido()%>">
									<img title="Editar" src="img/pencil.png" width="30px"
									height="30px">
							</a> <a href="ServletPrestamo?tipo=eliminar&cod=<%=a.getNroPedido()%>">
									<img title="Eliminar" src="img/eliminar.png" width="30px"
									height="30px">
							</a></td>
						</tr>
						<%
							} 
						}
						%>

					</tbody>
				</table>
			</div>
		</div>
	</div>
	<!-- Bootstrap -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>