<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title> Quinielas | Registro</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

</head>

<body class="gray-bg">

    <div class="middle-box text-center loginscreen   animated fadeInDown">
        <div>
            <div>

				<!--  el logo <h1 class="logo-name"></h1>  -->

			</div>
            <h3> Registrarse en Quiniela Express</h3>

            <form class="m-t" role="form" action="/">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Nombre" required="">
                </div>
                <div class="form-group">
                    <input type="email" class="form-control" placeholder="Correo" required="">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="Contraseña" required="">
                </div>
                <div class="form-group">
                        <div class="checkbox i-checks"><label> <input type="checkbox"><i></i> Acepto los terminos y condiciones</label></div>
                </div>
                <button type="submit" class="btn btn-success block full-width m-b">Registrarse</button>

                <p class="text-muted text-center"><small>¿Ya tienes una cuenta?</small></p>
                <a class="btn btn-sm btn-white btn-block" href="/login">Loguearse</a>
            </form>
            <p class="m-t"> 	<small>Quiniela Express 2018</small> </p>
        </div>
    </div>

    <!-- Mainly scripts -->
    <script src="js/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <!-- iCheck -->
    <script src="js/plugins/iCheck/icheck.min.js"></script>
    <script>
        $(document).ready(function(){
            $('.i-checks').iCheck({
                checkboxClass: 'icheckbox_square-green',
                radioClass: 'iradio_square-green',
            });
        });
    </script>
</body>

</html>
