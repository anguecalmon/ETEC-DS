<?php include("templates/header.php"); ?> 

<!DOCTYPE html>
<html>
<head>
    <title>Quem somos</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

    <br><br><br><br><br><br><br><br><br><br><br><br>

    <p>Nome: André Calmon Silva</p>
    
    <?php 
    echo  "<spam>Idade: </spam>" .($idade = 17). "<spam> anos</spam>";
    ?>

    <?php
        if($idade >= 18){
            //se o aluno tiver 18 anos ou mais = maior de idade.
            echo "<p>O aluno é maior de idade: $idade anos</p>";
        }
        else{
            //se o aluno tiver menos de 18 anos = menor de idade.
            echo "<p>O aluno é menor de idade: $idade anos</p>";
        }
    ?>

    <p>E-mail: calmon.principal@gmail.com</p>

    <br><br><br><br><br><br>

    <p>Nome: Vinícius Kazuo Takeuchi</p>

    <?php 
    echo  "<spam>Idade: </spam>" .($idade = 19). "<spam> anos</spam>";
    ?>

    <?php
        if($idade >= 18){
            //se o aluno tiver 18 anos ou mais = maior de idade.
            echo "<p>O aluno é maior de idade: $idade anos</p>";
        }
        else{
            //se o aluno tiver menos de 18 anos = menor de idade.
            echo "<p>O aluno é menor de idade: $idade anos</p>";
        }
    ?>

    <p>E-mail: viniciustakeuchi1@gmail.com</p>
    
    <br><br><br><br><br><br><br><br><br><br><br><br>

    
    
</body>
</html>

<?php include("templates/footer.php"); ?>