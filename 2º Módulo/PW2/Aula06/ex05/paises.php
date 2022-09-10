<!DOCTYPE html>
<html>
<head>
    <title>Países</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

    <?php
        $pais = $_GET['x'];
        echo $pais;

        $continente = $_GET['y'];
        echo "<br>";
        echo $continente;

        $imagem_pais = $_GET['z'];
        echo "<br>";
        echo "<img src='$imagem_pais' />";
    ?>
    
</body>
</html>

