<!DOCTYPE html>
<html>
<head>
    <title>Exercício 05</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    
    <?php
        $imagem_pais = array();
        $nome_pais = array();
        $continente = array();

        $imagem_pais[0] = "img/brasil.png";
        $nome_pais[0] = "Brasil";
        $continente[0] = "América do Sul";

        $imagem_pais[1] = "img/africa_do_sul.png";
        $nome_pais[1] = "África do Sul";
        $continente[1] = "África";

        $imagem_pais[2] = "img/franca.png";
        $nome_pais[2] = "França";
        $continente[2] = "Europa";

        $imagem_pais[3] = "img/japao.png";
        $nome_pais[3] = "Japão";
        $continente[3] = "Ásia";

        // $i = índice do array

        for($i = 0;$i<count($nome_pais);$i++) {
            echo "<div class='container'>";
                echo "<img src='$imagem_pais[$i]'>";
                echo "<h2> $nome_pais[$i] </h2>";
                echo "<p> $continente[$i] </p>";
                echo "<a href='paises.php?x=$nome_pais[$i]&y=$continente[$i]&z=$imagem_pais[$i]'> Saiba mais </a>";
            echo "</div>";
        }        
    ?>

</body>
</html>