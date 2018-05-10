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
                    <div class="ibox">
                        <div class="ibox-content">

                            <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="15">
                                <thead>
                                <tr>

                                    <th>Usuario</th>
                                    <th data-hide="phone">Solicitud</th>
                                    <th data-hide="phone">Descripcion</th>
                                    <th data-hide="phone">Fecha de creacion</th>
                                    <th data-hide="phone">Estatus</th>
                                    <th class="text-right">Accion</th>

                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>
                                    Juan Perez
                                    </td>
                                    <td>
                                       Administrador de quinielas
                                    </td>
                                    <td>
                                        Hola quiero ser administrador de quinielas
                                    </td>
                                    <td>
                                 03/05/2018
                                    </td>
                               
                                    <td>
                                        <span class="label label-primary">Aceptada</span>
                                    </td>
                                    <td class="text-right">
                                        <div class="btn-group">
                                            <button class="btn-white btn btn-xs">Ver</button>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                     Marco Saenz
                                    </td>
                                    <td>
            
                                        Quiniela Privada
                                    </td>
                                    <td>
                                        Quisiera participar en tu quiniela privada
                                    </td>
                                    <td>
                                       04/05/2018
                                    </td>
                               
                                    <td>
                                        <span class="label label-danger">Rechazada</span>
                                    </td>
                                    <td class="text-right">
                                        <div class="btn-group">
                                            <button class="btn-white btn btn-xs">Ver</button>
                                            
                                        </div>
                                    </td>
                                </tr>
                                      <tr>
                                    <td>
                                     Marco Padua
                                    </td>
                                    <td>
                                Quiniela Privada
                                    </td>
                                    <td>
                                        Hola quiero participar en tu quiniela
                                    </td>
                                    <td>
                                       04/05/2018
                                    </td>
                               
                                    <td>
                                        <span class="label label-warning">Pendiente</span>
                                    </td>
                                    <td class="text-right">
                                        <div class="btn-group">   
                                            <button class="btn-primary btn btn-xs">Aceptar</button>
                                            <button class="btn-danger btn btn-xs">Rechazar</button>
                                        </div>
                                    </td>
                                </tr>


                                </tbody>
                                <tfoot>
                                <tr>
                                    <td colspan="7">
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


    <!-- Data picker -->
    <script src="js/plugins/datapicker/bootstrap-datepicker.js"></script>

    <!-- FooTable -->
    <script src="js/plugins/footable/footable.all.min.js"></script>

    <!-- Page-Level Scripts -->
    <script>
        $(document).ready(function() {

            $('.footable').footable();

            $('#date_added').datepicker({
                todayBtn: "linked",
                keyboardNavigation: false,
                forceParse: false,
                calendarWeeks: true,
                autoclose: true
            });

            $('#date_modified').datepicker({
                todayBtn: "linked",
                keyboardNavigation: false,
                forceParse: false,
                calendarWeeks: true,
                autoclose: true
            });

        });

    </script>
</body>

</html>
