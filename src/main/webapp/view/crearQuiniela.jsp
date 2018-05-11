<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
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
		<!--  menu sidebar  -->
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
																disabled="disabled" style="background-color: white">
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
																disabled="disabled" style="background-color: white">
														</div>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Puntuación
													para acierto de score del equipo ganador </label>
												<div class="col-sm-2">
													<input class="touchspin" type="text" value="0" name=""
														readonly="readonly" style="background-color: white">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Puntuación
													para acierto de score del Equipo 1 </label>
												<div class="col-sm-2">
													<input class="touchspin" type="text" value="0" name=""
														readonly="readonly" style="background-color: white">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Puntuación
													para acierto de score del Equipo 2 </label>
												<div class="col-sm-2">
													<input class="touchspin" type="text" value="0" name=""
														readonly="readonly" style="background-color: white">
												</div>
											</div>
										</fieldset>

									</div>
								</div>
								<div id="tab-2" class="tab-pane">
									<div class="panel-body">

										<fieldset class="form-horizontal">
											<div class="row">
												<div class="form-group">
													<div class="col-sm-6 col-sm-offset-5">
														<label class="control-label">Agregar Juego:</label> <input
															type="button" class="btn btn-primary" data-toggle="modal"
															data-target="#modalNuevo" value="Agregar">
													</div>

													<!-- Modales aqui -->
													<div class="modal inmodal" id="modalNuevo" tabindex="-1"
														role="dialog" aria-hidden="true">
														<div class="modal-dialog">
															<div class="modal-content animated bounceInRight">
																<div class="modal-header">
																	<button type="button" class="close"
																		data-dismiss="modal">
																		<span aria-hidden="true">&times;</span><span
																			class="sr-only">Close</span>
																	</button>
																	<i class="fa fa-futbol-o modal-icon"></i>
																	<h4 class="modal-title">Nuevo juego</h4>
																	<small class="font-bold">Por favor introduzca
																		todos los campos para agregar el juego a la quiniela</small>
																</div>
																<div class="modal-body">
																	<div class="form-group">
																		<label class="col-sm-2 control-label">Nombre
																			del Equipo 1:</label>
																		<div class="col-sm-10">
																			<input type="text" class="form-control"
																				placeholder="">
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-2 control-label">Nombre
																			del Equipo 2:</label>
																		<div class="col-sm-10">
																			<input type="text" class="form-control"
																				placeholder="">
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-2 control-label">Descripción:</label>
																		<div class="col-sm-10">
																			<input type="text" class="form-control"
																				placeholder="">
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-2 control-label">Fecha</label>
																		<div class="col-sm-3">
																			<div class="form-group" id="fecha_1">
																				<div class="input-group date">
																					<span class="input-group-addon"><i
																						class="fa fa-calendar"></i></span><input type="text"
																						class="form-control" value="" disabled="disabled"
																						style="background-color: white">
																				</div>
																			</div>
																		</div>
																	</div>


																</div>
																<div class="modal-footer">
																	<button type="button" class="btn btn-white"
																		data-dismiss="modal">Cerrar</button>
																	<button type="button" class="btn btn-primary" data-dismiss="modal">Agregar
																		juego</button>
																</div>
															</div>
														</div>
													</div>
													<div class="modal inmodal" id="modalVer" tabindex="-1"
														role="dialog" aria-hidden="true">
														<div class="modal-dialog">
															<div class="modal-content animated bounceInRight">
																<div class="modal-header">
																	<button type="button" class="close"
																		data-dismiss="modal">
																		<span aria-hidden="true">&times;</span><span
																			class="sr-only">Close</span>
																	</button>
																	<i class="fa fa-futbol-o modal-icon"></i>
																	<h3 class="modal-title">Información de juego
																		seleccionado</h3>
																</div>
																<div class="modal-body">
																	<div class="form-group">
																		<label class="col-sm-2 control-label">Nombre
																			del Equipo 1:</label>
																		<div class="col-sm-10">
																			<input type="text" class="form-control"
																				placeholder="" disabled="disabled">
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-2 control-label">Nombre
																			del Equipo 2:</label>
																		<div class="col-sm-10">
																			<input type="text" class="form-control"
																				placeholder="" disabled="disabled">
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-2 control-label">Descripción:</label>
																		<div class="col-sm-10">
																			<input type="text" class="form-control"
																				placeholder="" disabled="disabled">
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-2 control-label">Fecha</label>
																		<div class="col-sm-3">
																			<div class="form-group" id="fecha_1">
																				<div class="input-group date">
																					<span class="input-group-addon"><i
																						class="fa fa-calendar"></i></span><input type="text"
																						class="form-control" value="" disabled="disabled"
																						>
																				</div>
																			</div>
																		</div>
																	</div>


																</div>
																<div class="modal-footer">
																	<button type="button" class="btn btn-white"
																		data-dismiss="modal">Cerrar</button>
																</div>
															</div>
														</div>
													</div>
													<div class="modal inmodal" id="modalEditar" tabindex="-1"
														role="dialog" aria-hidden="true">
														<div class="modal-dialog">
															<div class="modal-content animated bounceInRight">
																<div class="modal-header">
																	<button type="button" class="close"
																		data-dismiss="modal">
																		<span aria-hidden="true">&times;</span><span
																			class="sr-only">Close</span>
																	</button>
																	<i class="fa fa-futbol-o modal-icon"></i>
																	<h4 class="modal-title">Edición de informacion</h4>
																	<small class="font-bold">Por favor modifique
																		los datos de su interes, sin dejar campos sin llenar</small>
																</div>
																<div class="modal-body">
																	<div class="form-group">
																		<label class="col-sm-2 control-label">Nombre
																			del Equipo 1:</label>
																		<div class="col-sm-10">
																			<input type="text" class="form-control"
																				placeholder="">
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-2 control-label">Nombre
																			del Equipo 2:</label>
																		<div class="col-sm-10">
																			<input type="text" class="form-control"
																				placeholder="">
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-2 control-label">Descripción:</label>
																		<div class="col-sm-10">
																			<input type="text" class="form-control"
																				placeholder="">
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-2 control-label">Fecha</label>
																		<div class="col-sm-3">
																			<div class="form-group" id="fecha_1">
																				<div class="input-group date">
																					<span class="input-group-addon"><i
																						class="fa fa-calendar"></i></span><input type="text"
																						class="form-control" value="" disabled="disabled"
																						style="background-color: white">
																				</div>
																			</div>
																		</div>
																	</div>


																</div>
																<div class="modal-footer">
																	<button type="button" class="btn btn-white"
																		data-dismiss="modal">Cerrar</button>
																	<button type="button" class="btn btn-primary" data-dismiss="modal">Guardar
																		Cambios</button>
																</div>
															</div>
														</div>
													</div>
												</div>


											</div>
											<div class="row">
												<div class="col-lg-12">
													<div class="ibox">
														<div class="ibox-content">
															<table
																class="footable table table-stripped toggle-arrow-tiny"
																data-page-size="15">
																<thead>
																	<tr>

																		<th data-toggle="true">Id</th>
																		<th data-hide="phone">Equipo 1</th>
																		<th data-hide="all">Puntuación E1</th>
																		<th data-hide="phone">Equipo 2</th>
																		<th data-hide="phone,tablet">Puntuación E2</th>
																		<th data-hide="phone">Status</th>
																		<th class="text-center" data-sort-ignore="true">Acción</th>

																	</tr>
																</thead>
																<tbody>
																	<tr>
																		<td>001</td>
																		<td>Alemania</td>
																		<td>0</td>
																		<td>México</td>
																		<td>0</td>
																		<td><span class="label label-success">Por
																				Disputar</span></td>
																		<td class="text-right">
																			<div class="btn-group">
																				<button class="btn btn-info" data-toggle="modal"
																					data-target="#modalVer">Ver</button>
																				<button class="btn btn-warning" data-toggle="modal"
																					data-target="#modalEditar">Editar</button>
																				<button class="btn btn-large btn-primary btn-danger"
																					data-toggle="confirmation" data-btn-ok-label="SI"
																					data-btn-ok-class="btn-success"
																					data-btn-ok-icon-class="material-icons"
																					data-btn-ok-icon-content="check"
																					data-btn-cancel-label="NO"
																					data-btn-cancel-class="btn-danger"
																					data-btn-cancel-icon-class="material-icons"
																					data-btn-cancel-icon-content="close"
																					data-title="¿Esta Seguro?"
																					data-content="Estos resultados no podran ser cambiados"
																					data-placement="top">Eliminar</button>
																			</div>
																		</td>
																	</tr>
																	<tr>
																		<td>002</td>
																		<td>Suecia</td>
																		<td>0</td>
																		<td>Corea del Sur</td>
																		<td>0</td>
																		<td><span class="label label-success">Por
																				Disputar</span></td>
																		<td class="text-right">
																			<div class="btn-group">
																				<button class="btn btn-info" data-toggle="modal"
																					data-target="#modalVer">Ver</button>
																				<button class="btn btn-warning" data-toggle="modal"
																					data-target="#modalEditar">Editar</button>
																				<button class="btn btn-large btn-primary btn-danger"
																					data-toggle="confirmation" data-btn-ok-label="SI"
																					data-btn-ok-class="btn-success"
																					data-btn-ok-icon-class="material-icons"
																					data-btn-ok-icon-content="check"
																					data-btn-cancel-label="NO"
																					data-btn-cancel-class="btn-danger"
																					data-btn-cancel-icon-class="material-icons"
																					data-btn-cancel-icon-content="close"
																					data-title="¿Esta Seguro?"
																					data-content="Estos resultados no podran ser cambiados"
																					data-placement="top">Eliminar</button>
																			</div>
																		</td>
																	</tr>
																	<tr>
																		<td>003</td>
																		<td>Corea del Sur</td>
																		<td>0</td>
																		<td>México</td>
																		<td>0</td>
																		<td><span class="label label-success">Por
																				Disputar</span></td>
																		<td class="text-right">
																			<div class="btn-group">
																				<button class="btn btn-info" data-toggle="modal"
																					data-target="#modalVer">Ver</button>
																				<button class="btn btn-warning" data-toggle="modal"
																					data-target="#modalEditar">Editar</button>
																				<button class="btn btn-large btn-primary btn-danger"
																					data-toggle="confirmation" data-btn-ok-label="SI"
																					data-btn-ok-class="btn-success"
																					data-btn-ok-icon-class="material-icons"
																					data-btn-ok-icon-content="check"
																					data-btn-cancel-label="NO"
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
																		<td colspan="2">
																			<ul class="pagination pull-right"></ul>
																		</td>
																		<td colspan="8"><input type="button"
																			class="btn pull-right btn-primary"
																			value="Completar creación"></td>

																	</tr>

																</tfoot>
															</table>

														</div>
													</div>
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
