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
				<div class="row">
					<div class="col-lg-12">
						<div class="jumbotron">
							<h2>Mundial de Futbol 2018</h2>
							<h5 class="text-right">Codigo de la Quiniela:</h5>
							<h5 class="text-right">Admonistrador:</h5>
							<h5 class="text-right">Fecha de Apertura:</h5>
							<h5 class="text-right">Fecha de Cierre:</h5>
							<h3>Descripcion y Reglas:</h3>
							<p>This is a template for a simple marketing or informational
								website. It includes a large callout called the hero unit and
								three supporting pieces of content. Use it as a starting point
								to create something more unique.</p>
							<p>
								<a class="btn btn-primary btn-large" href="#">Solicitar
									Subcripcion de Participacion</a>
							</p>
							<div>
                <div class="dropdown">
                    <a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <div class="dropdown-messages-box">
                                
                                <div class="media-body">
                                    <small class="pull-right">4h ago</small>
                                    <strong>Mike</strong> Quiere ser parte de esta quiniela. <br>
                                </div>
                            </div>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="dropdown-messages-box">
                                
                                <div class="media-body ">
                                    <small class="pull-right text-navy">5h ago</small>
                                    <strong>Isac</strong> Quiere ser parte de esta quiniela. <br>
                                </div>
                            </div>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="dropdown-messages-box">
                                
                                <div class="media-body ">
                                    <small class="pull-right">23h ago</small>
                                    <strong>Alex</strong> Quiere ser parte de esta quiniela. <br>
                                </div>
                            </div>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="text-center link-block">
                                <a href="mailbox.html">
                                    <i class="fa fa-envelope"></i> <strong>Read All Messages</strong>
                                </a>
                            </div>
                        </li>
                    </ul>
                </div>
                <div class="dropdown">
                    <a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <div class="dropdown-messages-box">
                                
                                <div class="media-body">
                                    <small class="pull-right">4h ago</small>
                                    <strong>Mike</strong> Quiere ser parte de esta quiniela. <br>
                                </div>
                            </div>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="dropdown-messages-box">
                                
                                <div class="media-body ">
                                    <small class="pull-right text-navy">5h ago</small>
                                    <strong>Isac</strong> Quiere ser parte de esta quiniela. <br>
                                </div>
                            </div>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="dropdown-messages-box">
                                
                                <div class="media-body ">
                                    <small class="pull-right">23h ago</small>
                                    <strong>Alex</strong> Quiere ser parte de esta quiniela. <br>
                                </div>
                            </div>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="text-center link-block">
                                <a href="mailbox.html">
                                    <i class="fa fa-envelope"></i> <strong>Read All Messages</strong>
                                </a>
                            </div>
                        </li>
                    </ul>
                </div>
                </div>
                
                
                
                
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-md-6">
					<table class="table table-sm" >
						<thead>
							<tr>
								<th>
									Equipo
								</th>
								<th>
									Resultado
								</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									Equipo 1
								</td>
								<td>
									0
								</td>
							</tr>
							<tr class="table-active">
								<td>
									Equipo 2
								</td>
								<td>
									0
								</td>
							</tr>
						</tbody>
					</table>
						<form role="form">
							<div class="form-group">

								<label for="imput-equipo"> Equipo 1</label>
								<div class="input-group mb-3">
									<div class="input-group-prepend">
										<div class="input-group-text"> </div>
									</div>
									<input type="text" class="form-control"
										aria-label="Text input with checkbox">
								</div>
								<label for="imput-equipo"> Equipo 2</label>
								<div class="input-group mb-3">
									<div class="input-group-prepend">
										<div class="input-group-text">
										</div>
									</div>
									<input type="text" class="form-control"
										aria-label="Text input with checkbox">
								</div>
							</div>
							<button class="btn btn-default" data-toggle="confirmation">Confirmation</button>
						</form>
					</div>
					<div class="col-md-6">
					<table class="table table-sm" >
						<thead>
							<tr>
								<th>
									Participantes
								</th>
								<th>
									Resultado
								</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									Perez
								</td>
								<td>
									0
								</td>
							</tr>
							<tr class="table-active">
								<td>
									Marco
								</td>
								<td>
									0
								</td>
							</tr>
							<tr class="table-active">
								<td>
									Luis
								</td>
								<td>
									0
								</td>
							</tr>
							<tr class="table-active">
								<td>
									Jose
								</td>
								<td>
									0
								</td>
							</tr>
						</tbody>
					</table>
					 

				<!--  end content! -->


			</div>
							<%@ include file="layouts/footer.jsp"%>
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

		<!-- Page-Level Scripts -->
		<script>
			$(document).ready(function() {

				$('.footable').footable();
				$('.footable2').footable();

			});
		</script>
</body>

</html>
