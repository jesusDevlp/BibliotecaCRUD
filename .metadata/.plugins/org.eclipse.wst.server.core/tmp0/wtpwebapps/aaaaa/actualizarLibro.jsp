<%@page import="com.cibertec.beans.LibroDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Interfaz</title>
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
		LibroDTO a = (LibroDTO) request.getAttribute("registro");
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
				<h2>Actualizar Libro</h2>
				<form action="ServletLibro?tipo=actualizar" id="frmactualizar"
					method="post">
					<input type="hidden" name="txt_cod" value="<%=a.getIdLibro()%>">
					<div class="mb-3">
						<label for="nombre" class="form-label">Nombre:</label> <input
							type="text" class="form-control" name="txt_nom"
							value="<%=a.getNomLibro()%>" id="nombre" placeholder="Nombre"
							autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">Editorial:</label> <input
							type="text" class="form-control" name="txt_edit"
							value="<%=a.getEditorial()%>" id="editorial"
							placeholder="Editorial" autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">Autor:</label> <input
							type="text" class="form-control" name="txt_autor"
							value="<%=a.getAutor()%>" id="autor" placeholder="Autor" autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">Género:</label> <input
							type="text" class="form-control" name="txt_genero"
							value="<%=a.getGenero()%>" id="genero"
							placeholder="Género" autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">País Autor:</label> <input
							type="text" class="form-control" name="txt_pais"
							value="<%=a.getPaisAutor()%>" id="pais" placeholder="País Autor"
							autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">Número de Páginas:</label>
						<input type="text" class="form-control" name="txt_paginas"
							value="<%=a.getNumPaginas()%>" id="paginas"
							placeholder="Número de Páginas" autofocus />
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">Precio</label> <input
							type="text" class="form-control" name="txt_precio"
							value="<%=a.getPrecio()%>" id="precio" placeholder="Precio"
							autofocus />
					</div>

					<div class="d-grid gap-2">
						<button class="btn btn-success" type="submit">Actualizar</button>
					</div>
				</form>
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