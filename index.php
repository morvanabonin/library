
<?php
$libsFrontEnd = "http://" . $_SERVER['SERVER_NAME']."/library/public/";
?>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Mate Library</title>
        <link rel="stylesheet" href="<?php echo $libsFrontEnd;?>libs/bootstrap/css/bootstrap.css">
    </head>
    <body>
        <header class="navbar navbar-light navbar-static-top bd-navbar" role="banner">
            <div class="clearfix">
                <button class="navbar-toggler pull-right hidden-sm-up" type="button" data-toggle="collapse" data-target="#bd-main-nav">
                  ☰
                </button>
                <a class="navbar-brand hidden-sm-up" href="library/">
                  Matelibrary
                </a>
                </div>
                <div class="collapse navbar-toggleable-xs" id="bd-main-nav">
                <nav class="nav navbar-nav">
                  <a class="nav-item nav-link active" href="#">MateLibrary</a>
                  <a class="nav-item nav-link" href="">Usuário</a>
                </nav>
            </div>
        </header>
        <section>
        <?php
            if (isset($_GET['key'])) {
                $_GET['key'] = $_GET['key'];
                $separator = explode('/', $_GET['key']);
                $controller = ucfirst($separator[0]);
                $action = (!empty($separator[1]) ? $separator[1] :'index').'Action';

                /**
                 * Function autoload
                 */
                function __autoload( $file ) {
                    require_once('app/models/'.$file.'php');
                }

                require_once('framework/Controller.php');
                require_once('app/controllers/'.$controller.'Controller.php');
                $app = new $controller();
                $app->$action();
            }
        ?>
        </section>
        <script type="text/javascript" src="<?php echo $libsFrontEnd;?>libs/js/jquery-2.1.4.min.js"></script>
        <script type="text/javascript" src="<?php echo $libsFrontEnd;?>libs/bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>

