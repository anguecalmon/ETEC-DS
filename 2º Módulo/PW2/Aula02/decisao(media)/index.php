<!DOCTYPE html>
<html>
<head>
    <title>Média PHP</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    
    <?php
        $nota1 = 9;
        $nota2 = 8;
        $nota3 = 5;
        $nota4 = 8;
        $media = ($nota1 + $nota2 + $nota3 + $nota4) / 4;

        if($media >= 6){
            //se media maior ou igual que 6 = aprovado
            echo "<h1 class='aprovado'> Aprovado! <span> Nota: $media</span> </h1>";
            echo "<p>Sua 1ª nota foi: $nota1</p>";
            echo "<p>Sua 2ª nota foi: $nota2</p>";
            echo "<p>Sua 3ª nota foi: $nota3</p>";
            echo "<p>Sua 4ª nota foi: $nota4</p>";
        }
        else{
            //se media menor que 6 = reprovado
            echo "<h1 class='reprovado'> Reprovado :( <span> Nota: $media</span> </h1>";
        }
    ?>


</body>
</html>