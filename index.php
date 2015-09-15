
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Mate Library</title>

        <style type="text/css" href="public/libs/bootstrap/css/bootstrap.min.css"></style>
        <style type="text/css" href=""></style>
    </head>
<?php
    $_GET['key'] = (isset($_GET['key']) ? $_GET['key'] : 'index/index');
    $separator = explode('/', $_GET['key']);
    $controller = ucfirst($separator[0]);
    $action = $separator[1].'Action';

    require_once('app/controllers/'.$controller.'Controller.php');
    $app = new $controller();
    $app->$action();
?>

    <body>
        <script type="text/javascript" src="public/libs/js/jquery-2.1.4.min.js"></script>
        <script type="text/javascript" src="public/libs/bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>

