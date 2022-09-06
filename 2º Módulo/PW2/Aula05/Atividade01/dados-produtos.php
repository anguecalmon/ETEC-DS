<?php

    $produto = $_POST["txtProduto"];

    $valor = $_POST["txtValor"];

    $categoria = $_POST["txtCategoria"];

    echo nl2br("$produto \n $valor \n $categoria");
    
?>