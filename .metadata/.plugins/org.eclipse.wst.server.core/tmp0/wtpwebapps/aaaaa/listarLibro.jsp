<%@page import="java.util.List"%>
<%@page import="com.cibertec.beans.LibroDTO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Libro</title>
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
		List<LibroDTO> da = (List<LibroDTO>) request.getAttribute("data");
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
				<h2>Añadir Libro</h2>
				<form action="ServletLibro?tipo=registrar" id="frmregistro"
					method="post">
					<div class="mb-3">
						<label for="nombre" class="form-label">Nombre:</label> <input
							type="text" class="form-control" name="txt_nom" id="nombre"
							placeholder="Nombre" autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">Editorial:</label> <input
							type="text" class="form-control" name="txt_edit" id="editorial"
							placeholder="Editorial" autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">Autor:</label> <input
							type="text" class="form-control" name="txt_autor" id="autor"
							placeholder="Autor" autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">Género:</label> <input
							type="text" class="form-control" name="txt_genero" id="genero"
							placeholder="Género" autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">País Autor:</label> <input
							type="text" class="form-control" name="txt_pais" id="pais"
							placeholder="País Autor" autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">Número de Páginas:</label>
						<input type="text" class="form-control" name="txt_paginas"
							id="paginas" placeholder="Número de Páginas" autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">Precio:</label> <input
							type="text" class="form-control" name="txt_precio" id="precio"
							placeholder="Precio" autofocus />
					</div>
					<div class="d-grid gap-2">
						<button class="btn btn-success" type="submit">Registrar</button>
						<button class="btn btn-secondary">Limpiar</button>
					</div>
				</form>
			</div>
			<div class="col-sm-12 col-md-8 col-lg-8 col-xl-8 py-4 bg-white">
				<h2>Listado de Libros</h2>
				<table class="table table-dark table-striped">
					<thead>
						<tr>
							<th class="centrado">id</th>
							<th class="centrado">Nombre Libro</th>
							<th class="centrado">Editorial</th>
							<th class="centrado">Autor</th>
							<th class="centrado">Género</th>
							<th class="centrado">País Autor</th>
							<th class="centrado">Número Páginas</th>
							<th class="centrado">Precio</th>
							<th colspan="2">ACCIONES</th>
						</tr>
					</thead>

					<%
						if (da != null) {
						for (LibroDTO l : da) {
					%>
					<tbody>

						<tr>
							<td class="centrado"><%=l.getIdLibro()%></td>
							<td class="centrado"><%=l.getNomLibro()%></td>
							<td class="centrado"><%=l.getEditorial()%></td>
							<td class="centrado"><%=l.getAutor()%></td>
							<td class="centrado"><%=l.getGenero()%></td>
							<td class="centrado"><%=l.getPaisAutor()%></td>
							<td class="centrado"><%=l.getNumPaginas()%></td>
							<td class="centrado"><%=l.getPrecio()%></td>
							<td class="centrado"><a
								href="ServletLibro?tipo=buscar&cod=<%=l.getIdLibro()%>"> <img
									title="Editar" src="img/pencil.png" width="30px" height="30px">
							</a> <a href="ServletLibro?tipo=eliminar&cod=<%=l.getIdLibro()%>">
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