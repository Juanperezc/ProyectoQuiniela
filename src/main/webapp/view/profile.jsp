<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Quiniela | Main view</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="font-awesome/css/font-awesome.css" rel="stylesheet">

<link href="css/animate.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

<!--  separados -->

<!-- FooTable -->
<link href="css/plugins/footable/footable.core.css" rel="stylesheet">

<!--   -->
</head>

<body class="skin-1 pace-done fixed-sidebar mini-navbar body-small">

	<div id="wrapper">
		<!--  menu sidebar -->
		<%@ include file="layouts/menu.jsp"%>
		<!--  end menu sidebar -->
		<div id="page-wrapper" class="gray-bg">
			<div class="row border-bottom">
				<%@ include file="layouts/topbar.jsp"%>
			</div>

			<!--  content ! -->
			<div class="wrapper wrapper-content animated fadeInRight">
				<div class="row animated fadeInRight">
					<div class="col-md-4">
						<div class="ibox float-e-margins">
							<div class="ibox-title">
								<h5>Detalle del Perfil</h5>
							</div>
							<div>
								<div class="ibox-content no-padding border-left-right">
									<center>
										<img alt="image" class="profile img-responsive img-circle circle-border"src="img/man.png">
									</center>
								</div>
								<div class="ibox-content profile-content">
									<h4>
										<strong>Juan Perez</strong>
									</h4>
									<p>
										<i class="fa fa-map-marker"></i> 21 años
									</p>
								
									<div class="row m-t-lg">
										<div class="col-md-4">
											<span class="bar">5,3,9,6,5,9,7,3,5,2</span>
											<h5>
												<strong>169</strong> Quinielas
											</h5>
										</div>
										<div class="col-md-4">
										</div>
										<!--  --><div class="col-md-4">
										 <img alt="image" alt="maricoelquelolea" class="rank-ico img-responsive"src="ico/chess.svg">
										
										</div>
								
									</div>
									<div class="user-button">
										<div class="row">
										<br>
											<div class="col-md-12">
												<button type="button"
													class="btn btn-warning btn-sm btn-block">
													<i class="fa fa-coffee"></i> Quiero ser un adminsitrador de quinielas 
												</button>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-8">
						<div class="ibox float-e-margins">
							<div class="ibox-title">
								<h5>
									Editar Perfil 
								</h5>
							
							</div>
							<div class="ibox-content">
								<form method="get" class="form-horizontal">
									<div class="form-group">
										<label class="col-sm-2 control-label">Nombre</label>

										<div class="col-sm-10">
											<input type="text" class="form-control">
										</div>
									</div>
									<div class="hr-line-dashed"></div>
									<div class="form-group">
										<label class="col-sm-2 control-label">Correo</label>
										<div class="col-sm-10">
											<input type="text" class="form-control"> 
										</div>
									</div>
									<div class="hr-line-dashed"></div>
									<div class="form-group">
										<label class="col-sm-2 control-label">Contraseña</label>

										<div class="col-sm-10">
											<input type="password" class="form-control" name="password">
										</div>
									</div>
															<div class="hr-line-dashed"></div>
									<div class="form-group">
										<label class="col-sm-2 control-label">Repite tu contraseña</label>

										<div class="col-sm-10">
											<input type="password" class="form-control" name="password">
										</div>
									</div>
					
									<div class="hr-line-dashed"></div>
									<div class="form-group">
										<div class="col-sm-4 col-sm-offset-2">
											<button class="btn btn-primary" type="submit">Guardar Cambios</button>
										</div>
									</div>
								</form>

							</div>
						</div>

					</div>
				</div>

			</div>

			<!--  end content! -->

			<%@ include file="layouts/footer.jsp"%>
		</div>
	</div>





	<!-- Mainly scripts -->
	<script src="js/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
	<script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

	<!-- FooTable -->
	<script src="js/plugins/footable/footable.all.min.js"></script>

	<!-- Custom and plugin javascript -->
	<script src="js/inspinia.js"></script>
	<script src="js/plugins/pace/pace.min.js"></script>



	<!-- Peity -->
	<script src="js/plugins/peity/jquery.peity.min.js"></script>

	<!-- Peity -->
	<script src="js/demo/peity-demo.js"></script>


</body>

</html>
