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
						<div class="ibox float-e-margins">
							<div class="ibox-title">
								<h5>Quinielas disponibles</h5>
							</div>
							<div class="ibox-content">
								<input type="text" class="form-control input-sm m-b-xs"
									id="filter" placeholder="Buscar..">

								<table class="footable table table-stripped" data-page-size="4"
									data-filter=#filter>
									<thead>
										<tr>
											<th>Participando</th>
											<th>Codigo</th>
											<th>Quiniela</th>
											<th data-hide="phone,tablet">Deporte</th>
											<th>Fecha de Apertura</th>
											<th data-hide="phone,tablet">Fecha de Cierre</th>
											<th>Privada</th>
											<th>Accion</th>
										</tr>
									</thead>
									<tbody>
										<tr class="gradeA">
											<td class="center"></td>
											<td class="center">015</td>
											<td class="center">BarcaVsRealMadrid</td>
											<td class="center"><img alt="Bootstrap Image Preview" src="/ico/football.png" class="img-responsive icono-deporte"><div> Football</div></td>
											<td class="center">10/5/2018</td>
											<td class="center">15/6/2018</td>
											<td class="center">NO</td>
											<td class="center"> 
											
											<div class="btn-group" role="group" aria-label="...">
  										 		 <a href="/quinielaFootballPublica" class="btn btn-success">ir </a>
  												<a href="/modificarQuinielas" class="btn btn-warning"> Modificar </a>
  												<button class="btn btn-large btn-primary btn-danger" 
											data-toggle="confirmation" data-btn-ok-label="SI"
											data-btn-ok-class="btn-success"
											data-btn-ok-icon-class="material-icons"
											data-btn-ok-icon-content="check" data-btn-cancel-label="NO"
											data-btn-cancel-class="btn-danger"
											data-btn-cancel-icon-class="material-icons"
											data-btn-cancel-icon-content="close"
											data-title="¿Esta Seguro?"
											data-content="Estos resultados no podran ser cambiados"
											data-placement="top">Eliminar</button>
											</div>	
											
											</td>
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
	<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
</body>

</html>
