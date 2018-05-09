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

					<div class="col-lg-8">
					
						<div class="ibox-content">

							<div class="float-e-margins">


								<div class="carousel slide" id="carousel2">
									<ol class="carousel-indicators">
										<li data-slide-to="0" data-target="#carousel2" class="active"></li>
										<li data-slide-to="1" data-target="#carousel2"></li>
										<li data-slide-to="2" data-target="#carousel2" class=""></li>
									</ol>
									<div class="carousel-inner">
										<div class="item active">
											<img alt="image" class="img-responsive" src="https://hdwallsource.com/img/2015/9/sports-wallpaper-47735-49291-hd-wallpapers.jpg">
											<div class="carousel-caption">
												<p>This is simple caption 1</p>
											</div>
										</div>
										<div class="item ">
											<img alt="image" class="img-responsive" src="http://www.gsfdcy.com/data/img/81/2086778-sport-wallpaper.jpg">
											<div class="carousel-caption">
												<p>This is simple caption 2</p>
											</div>
										</div>
										<div class="item">
											<img alt="image" class="img-responsive" src="https://images.alphacoders.com/484/484929.jpg">
											<div class="carousel-caption">
												<p>This is simple caption 3</p>
											</div>
										</div>
									</div>
									<a data-slide="prev" href="#carousel2"
										class="left carousel-control"> <span class="icon-prev"></span>
									</a> <a data-slide="next" href="#carousel2"
										class="right carousel-control"> <span class="icon-next"></span>
									</a>
								</div>

							</div>

						</div>
					</div>
					<div class="col-lg-4">
					<a class="twitter-timeline" data-height="500" href="https://twitter.com/TwitterDev?ref_src=twsrc%5Etfw">Tweets by TwitterDev</a> <script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
					</div>
				
				</div>
				<div class="row">
					<div class="col-lg-12">
						<div class="ibox float-e-margins">
							<div class="ibox-title">
								<h5>Quinielas disponibles</h5>
							</div>
							<div class="ibox-content">
								<input type="text" class="form-control input-sm m-b-xs"
									id="filter" placeholder="Buscar..">

								<table class="footable table table-stripped" data-page-size="8"
									data-filter=#filter>
									<thead>
										<tr>
											<th>Participar</th>
											<th>Codigo</th>
											<th>Quiniela</th>
											<th data-hide="phone,tablet">Deporte</th>
											<th>Fin de Registros</th>
											<th data-hide="phone,tablet">Fin de la Quiniela</th>
											<th>Privada</th>
											<th>Ingresar</th>
										</tr>
									</thead>
									<tbody>
										<tr class="gradeX">
											<td class="center">x</td>
											<td class="center">002</td>
											<td class="center">Mundial de Futbol 2018</td>
											<td class="center hide-text"> <img alt="Bootstrap Image Preview" src="/ico/football.png" class="img-responsive icono-deporte"> <div> Football</div> </td>
											<td class="center">5/5/2018</td>
											<td class="center">5/6/2018</td>
											<td class="center">SI</td>
											<td class="center"> <a href="/quiniela" ><button type="button" class="btn btn-success">ir</button> </a></td>
										</tr>
										<tr class="gradeC">
											<td class="center"></td>
											<td class="center">003</td>
											<td class="center">Mundial de Futbol 2018</td>
											<td class="center"><img alt="Bootstrap Image Preview" src="/ico/football.png" class="img-responsive icono-deporte"><div> Football</div></td>
											<td class="center">5/5/2018</td>
											<td class="center">5/6/2018</td>
											<td class="center">NO</td>
											<td class="center"> <a href="#" ><button type="button" class="btn btn-success">ir</button> </a></td>
										</tr>
										<tr class="gradeA">
											<td class="center">x</td>
											<td class="center">015</td>
											<td class="center">BarcaVsRealMadrid</td>
											<td class="center"><img alt="Bootstrap Image Preview" src="/ico/football.png" class="img-responsive icono-deporte"><div> Football</div></td>
											<td class="center">10/5/2018</td>
											<td class="center">15/6/2018</td>
											<td class="center">NO</td>
											<td class="center"> <a href="#" ><button type="button" class="btn btn-success">ir</button> </a></td>
										</tr>
										<tr class="gradeA">
											<td class="center"></td>
											<td class="center">008</td>
											<td class="center">YankesVsMets</td>
											<td class="center"><img alt="Bootstrap Image Preview" src="/ico/baseball.png" class="img-responsive icono-deporte"><div> Baseball</div></td>
											<td class="center">25/5/2018</td>
											<td class="center">26/5/2018</td>
											<td class="center">NO</td>
											<td class="center"> <a href="#" ><button type="button" class="btn btn-success">ir</button> </a></td>
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
