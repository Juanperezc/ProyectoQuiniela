<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Crear quiniela</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="font-awesome/css/font-awesome.css" rel="stylesheet">

<link href="css/animate.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

<!--  separados -->

<!-- FooTable -->
<link href="css/plugins/footable/footable.core.css" rel="stylesheet">

<!-- componentes personalizados  -->
<link href="css/plugins/iCheck/custom.css" rel="stylesheet">
<link href="css/plugins/select2/select2.min.css" rel="stylesheet">
<link
	href="css/plugins/awesome-bootstrap-checkbox/awesome-bootstrap-checkbox.css"
	rel="stylesheet">
<link href="css/plugins/chosen/bootstrap-chosen.css" rel="stylesheet">
<link href="css/plugins/touchspin/jquery.bootstrap-touchspin.min.css"
	rel="stylesheet">


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
			<div class="wrapper wrapper-content animated fadeInRight ecommerce">

				<div class="row">
					<div class="col-lg-12">
						<div class="tabs-container">
							<ul class="nav nav-tabs">
								<li class="active"><a data-toggle="tab" href="#tab-1">
										Información general</a></li>
								<li class=""><a data-toggle="tab" href="#tab-2">Información
										juegos</a></li>

							</ul>
							<div class="tab-content">
								<div id="tab-1" class="tab-pane active">
									<div class="panel-body">

										<fieldset class="form-horizontal">
											<div class="form-group">
												<label class="col-sm-2 control-label">Nombre de la
													quiniela:</label>
												<div class="col-sm-6">
													<input type="text" class="form-control"
														placeholder="quiniela 1">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Deporte:</label>
												<div class="col-sm-6">
													<div class="form-group">
														<select data-placeholder="Escoge un deporte..."
															class="chosen-select" tabindex="-1">
															<option value="">Seleccione un deporte</option>
															<option value="Futbol">Futbol</option>
															<option value="Beisbol">Beisbol</option>
															<option value="Hockey">Hockey</option>
															<option value="Rugby">Rugby</option>
															<option value="waterpolo">Waterpolo</option>
															<option value="Lol">Lol</option>
															<option value="Dota">Dota 2</option>
														</select>
													</div>
												</div>

											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Tipo:</label>
												<div class="col-sm-10">
													<div class="radio radio-inline radio-primary">
														<input type="radio" id="inlineRadio1" value="publica"
															name="radioInline"> <label for="inlineRadio1">Publica
														</label>
													</div>
													<div class="radio radio-inline radio-primary">
														<input type="radio" id="inlineRadio2" value="privada"
															name="radioInline"> <label for="inlineRadio2">Privada
														</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Descripción </label>
												<div class="col-sm-6">
													<input type="text" class="form-control" placeholder="...">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Fecha de
													apertura:</label>
												<div class="col-sm-2">
													<div class="form-group" id="fecha_1">
														<div class="input-group date">
															<span class="input-group-addon"><i
																class="fa fa-calendar"></i></span><input type="text"
																class="form-control" value="11/05/2018"
																disabled="disabled">
														</div>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Fecha de
													cierre:</label>
												<div class="col-sm-2">
													<div class="form-group" id="fecha_2">
														<div class="input-group date">
															<span class="input-group-addon"><i
																class="fa fa-calendar"></i></span><input type="text"
																class="form-control" value="11/05/2018"
																disabled="disabled">
														</div>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Puntuación
													para acierto de score del equipo ganador </label>
												<div class="col-sm-2">
													<input class="touchspin" type="text" value="0" name="">

												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Puntuación
													para acierto de score del Equipo 1 </label>
												<div class="col-sm-2">
													<input class="touchspin" type="text" value="0" name="">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Puntuación
													para acierto de score del Equipo 2 </label>
												<div class="col-sm-2">
													<input class="touchspin" type="text" value="0" name="">
												</div>
											</div>
										</fieldset>

									</div>
								</div>
								<div id="tab-2" class="tab-pane">
									<div class="panel-body">

										<fieldset class="form-horizontal">
											<div class="form-group">
												<label class="col-sm-2 control-label">ID:</label>
												<div class="col-sm-10">
													<input type="text" class="form-control" placeholder="543">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Model:</label>
												<div class="col-sm-10">
													<input type="text" class="form-control" placeholder="...">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Location:</label>
												<div class="col-sm-10">
													<input type="text" class="form-control"
														placeholder="location">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Tax Class:</label>
												<div class="col-sm-10">
													<select class="form-control">
														<option>option 1</option>
														<option>option 2</option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Quantity:</label>
												<div class="col-sm-10">
													<input type="text" class="form-control"
														placeholder="Quantity">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Minimum
													quantity:</label>
												<div class="col-sm-10">
													<input type="text" class="form-control" placeholder="2">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Sort order:</label>
												<div class="col-sm-10">
													<input type="text" class="form-control" placeholder="0">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Status:</label>
												<div class="col-sm-10">
													<select class="form-control">
														<option>option 1</option>
														<option>option 2</option>
													</select>
												</div>
											</div>
										</fieldset>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<%@ include file="layouts/footer.jsp"%>
		</div>

	</div>



	<!-- Mainly scripts -->
	<script src="js/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap-confirmation.js"></script>
	<script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
	<script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

	<!-- Select2 -->
	<script src="js/plugins/select2/select2.full.min.js"></script>

	<!-- Chosen -->
	<script src="js/plugins/chosen/chosen.jquery.js"></script>

	<!-- FooTable -->
	<script src="js/plugins/footable/footable.all.min.js"></script>

	<!-- Custom and plugin javascript -->
	<script src="js/inspinia.js"></script>
	<script src="js/plugins/pace/pace.min.js"></script>
	<!-- Date picker -->
	<script src="js/plugins/datapicker/bootstrap-datepicker.js"></script>
	<script src="js/plugins/fullcalendar/moment.min.js"></script>
	<script src="js/plugins/daterangepicker/daterangepicker.js"></script>
	<!-- TouchSpin -->
	<script src="js/plugins/touchspin/jquery.bootstrap-touchspin.min.js"></script>
	<script>
		$('#fecha_1 .input-group.date').datepicker({
			todayBtn : "linked",
			keyboardNavigation : false,
			forceParse : false,
			calendarWeeks : true,
			autoclose : true,
			format : 'dd/mm/yyyy'
		});
		$('#fecha_2 .input-group.date').datepicker({
			todayBtn : "linked",
			keyboardNavigation : false,
			forceParse : false,
			calendarWeeks : true,
			autoclose : true,
			format : 'dd/mm/yyyy'
		});
	</script>

	<!-- Page-Level Scripts -->
	<script>
		$(document).ready(function() {

			$('.footable').footable();
			$('.footable2').footable();
			$('[data-toggle=confirmation]').confirmation({
				rootSelector : '[data-toggle=confirmation]',
			// other options
			});
			$('.chosen-select').chosen({
				width : "100%"
			});

			$(".touchspin").TouchSpin({
				min : 1,
				max : 10,
				step : 1,
				decimals : 0,
				boostat : 5,
				maxboostedstep : 10,
				buttondown_class : 'btn btn-white',
				buttonup_class : 'btn btn-white'
			});
		});
	</script>
</body>

</html>
