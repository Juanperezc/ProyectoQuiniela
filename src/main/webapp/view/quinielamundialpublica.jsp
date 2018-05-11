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
				<!-- Primer Nivel de la pg -->
				<div class="row">
					<!-- Datos quiniela -->
					<div class="col-lg-12">
					<a class="btn btn-success pull-right" href="/index"> <i class = "fa fa-home"></i> </a>
						<div class="jumbotron">
							<h2>Mundial de Futbol 2018 Grupo F</h2>
							<h5 class="text-right">Codigo de la Quiniela: 003</h5>
							<h5 class="text-right">Administrador: Leon</h5>
							<h5 class="text-right">Fecha de Apertura:5/5/2018</h5>
							<h5 class="text-right">Fecha de Cierre: 5/6/2018</h5>
							<h3>Descripcion y Reglas:</h3>
							<p>Quiniela para los juegos de la fase de grupos del grupo F
								del mundial, los equipos son Alemania, México, Suecia, Corea del
								Sur las reglas son : - Acertar quien gana 4pts - Puntaje
								correcto por equipo +2t (c/u).</p>
							<p>
								<a class="btn btn-primary btn-large hide" href="#">Solicitar
									Subcripcion de Participacion</a>
							</p>

							<div class="dropdown hide">
								<div>
									<a class="dropdown-toggle count-info" data-toggle="dropdown"
										href="#"> <i class="fa fa-envelope"></i>
									</a>
									<h6>Solicitudes de Subcripcion</h6>
									<ul class="dropdown-menu dropdown-messages">
										<li>
											<div class="dropdown-messages-box">

												<div class="media-body">
													<small class="pull-right">4h ago</small> <strong>Mike</strong>
													Quiere ser parte de esta quiniela. <br>
												</div>
											</div>
										</li>
										<li class="divider"></li>
										<li>
											<div class="dropdown-messages-box">

												<div class="media-body ">
													<small class="pull-right text-navy">5h ago</small> <strong>Isac</strong>
													Quiere ser parte de esta quiniela. <br>
												</div>
											</div>
										</li>
										<li class="divider"></li>
										<li>
											<div class="dropdown-messages-box">

												<div class="media-body ">
													<small class="pull-right">23h ago</small> <strong>Alex</strong>
													Quiere ser parte de esta quiniela. <br>
												</div>
											</div>
										</li>
										<li class="divider"></li>
										<li>
											<div class="text-center link-block">
												<a href="mailbox.html"> <i class="fa fa-envelope"></i> <strong>Read
														All Messages</strong>
												</a>
											</div>
										</li>
									</ul>
								</div>
							</div>

						</div>
					</div>
				</div>
				<!-- Segundo nivel de la pg -->
				<div class="row">
					<!-- datos del juego -->
					<div class="col-md-6">
						<div class="ibox-content">
							<h2 class="text-center">Resultado</h2>
							<table class="footable table table-stripped" data-page-size="2"
								data-filter=#filter>
								<thead>
									<tr>
										<th>Equipo</th>
										<th>Resultado</th>
									</tr>
								</thead>
								<tbody>
									<tr class="gradeX">
										<td class="center">Alemania</td>
										<td class="center">0</td>
									</tr>
									<tr class="gradeC">
										<td class="center">México</td>
										<td class="center">0</td>
									</tr>
									<tr class="gradeA">
										<td class="center">Suecia</td>
										<td class="center">0</td>
									</tr>
									<tr class="gradeA">
										<td class="center">Corea del Sur</td>
										<td class="center">0</td>
									</tr>
									<tr class="gradeX">
										<td class="center">Alemania</td>
										<td class="center">0</td>
									</tr>
									<tr class="gradeA">
										<td class="center">Suecia</td>
										<td class="center">0</td>
									</tr>
									<tr class="gradeA">
										<td class="center">Corea del Sur</td>
										<td class="center">0</td>
									<tr class="gradeC">
										<td class="center">México</td>
										<td class="center">0</td>
									</tr>
									<tr class="gradeA">
										<td class="center">Corea del Sur</td>
										<td class="center">0</td>
									</tr>
									<tr class="gradeX">
										<td class="center">Alemania</td>
										<td class="center">0</td>
									</tr>
									<tr class="gradeC">
										<td class="center">México</td>
										<td class="center">0</td>
									</tr>
									<tr class="gradeA">
										<td class="center">Suecia</td>
										<td class="center">0</td>
									</tr>
								</tbody>
								<tfoot>
									<tr>
										<td colspan="5">
											<ul class="pagination pull-right"></ul>
										</td>
									</tr>
								</tfoot>
							</table>

							<!-- datos del usuario para participar -->
							<div class="row">
								<div class="col-md-6 b-r">
									<form role="form">
										<h2>Participa</h2>
										<div class="form-group">

											<label for="imput-equipo"> Alemania</label>
											<div class="input-group mb-3">
												<div class="input-group-prepend">
													<div class="input-group-text"></div>
												</div>
												<input type="text" class="form-control"
													aria-label="Text input with checkbox">
											</div>
											<label for="imput-equipo"> México</label>
											<div class="input-group mb-3">
												<div class="input-group-prepend">
													<div class="input-group-text"></div>
												</div>
												<input type="text" class="form-control"
													aria-label="Text input with checkbox">
											</div>
										</div>
										<button class="btn btn-large btn-primary"
											data-toggle="confirmation" data-btn-ok-label="SI"
											data-btn-ok-class="btn-success"
											data-btn-ok-icon-class="material-icons"
											data-btn-ok-icon-content="check" data-btn-cancel-label="NO"
											data-btn-cancel-class="btn-danger"
											data-btn-cancel-icon-class="material-icons"
											data-btn-cancel-icon-content="close"
											data-title="¿Esta Seguro?"
											data-content="Estos resultados no podran ser cambiados"
											data-placement="right">Confirmar</button>
									</form>
								</div>
								<!-- Segundo Reglas de la quiniela -->
								<div class="col-md-6">
									<table class="table table-sm">
										<thead>
											<tr>
												<th>Condicion</th>
												<th>Puntaje</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>Acertar quien gana</td>
												<td>4 Pts</td>
											</tr>
											<tr class="table-active">
												<td>Puntaje correcto por equipo</td>
												<td>2 pt(c/u)</td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
					<!-- Columna para el ranking -->
					<div class="col-md-6">
						<div class="jumbotron">
							<h2 class="text-center">Ranking</h2>
							<table class="table table-sm">
								<thead>
									<tr>
										<th>Participantes</th>
										<th>Resultado</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Rafael</td>
										<td>0</td>
									</tr>
									<tr class="table-active">
										<td>Jose</td>
										<td>0</td>
									</tr>
									<tr class="table-active">
										<td>Luis</td>
										<td>0</td>
									</tr>
									<tr class="table-active">
										<td>Dorys</td>
										<td>0</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>

			<!-- Seccion de preguntas de usuarios -->
			<div class="row">
				<div class="col-lg-12">
					<br /> <br />
					<div class="jumbotron">
						<h2>Pregunta</h2>
						<div class="social-feed-box">
							<div class="social-avatar">
								<a href="" class="pull-left"> </a>
								<div class="media-body">
									<a href="#"> Dorys </a> <small class="text-muted">
										7/5/2018</small>
								</div>
							</div>
							<div class="social-body">
								<p>Son todos los juegos de la fase de grupos</p>
							</div>
							<div class="social-footer">
								<div class="social-comment">
									<a href="" class="pull-left"> </a>
									<div class="media-body">
										<a href="#"> Leon </a> Si. <br />
										<small class="text-muted">8/5/2018</small>
									</div>
								</div>

								<div class="social-comment">
									<a href="" class="pull-left"> </a>
									<div class="media-body">
										<textarea class="form-control" placeholder="Write comment..."></textarea>
									</div>
								</div>

							</div>
						</div>
					</div>
				</div>

			</div>
			<%@ include file="layouts/footer.jsp"%>
		</div>

		<!--  end content! -->
	</div>







	<!-- Mainly scripts -->
	<script src="js/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap-confirmation.js"></script>
	<script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
	<script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>





	<!-- FooTable -->
	<script src="js/plugins/footable/footable.all.min.js"></script>

	<!-- Custom and plugin javascript -->
	<script src="js/inspinia.js"></script>
	<script src="js/plugins/pace/pace.min.js"></script>

	<!-- Page-Level Scripts -->
	<script>
		$(document).ready(function() {
			
			$('.footable').footable();

			
			$('[data-toggle=confirmation]').confirmation({
				rootSelector : '[data-toggle=confirmation]',
			// other options
			});
		});
	</script>
</body>

</html>
