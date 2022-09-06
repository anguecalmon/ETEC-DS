<?php

    $nome = $_POST["txtNome"];

    $email = $_POST["txtEmail"];

    $assunto = $_POST["txtAssunto"];

    $mensagem = $_POST["txtMensagem"];

    echo nl2br("$nome \n $email \n $assunto \n $mensagem");

?>