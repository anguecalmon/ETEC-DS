<?php require("templates/head.php"); ?>

<section>
    <h1> Contact </h1>
</section>

<section class="formulario">

    <form action="dados-contatos.php" method = "post">

        <div>
            <input type="text" placeholder="Nome" name="txtNome">
        </div>

        <div>
            <input type="email" placeholder="E-mail" name="txtEmail">
        </div>

        <div>
            <input type="text" placeholder="Assunto" name="txtAssunto">
        </div>

        <div>
            <textarea name ="txtMensagem" cols="30" rows="10" placeholder="Sua Mensagem" ></textarea>
        </div>

        <div>
            <input type="submit" value="Enviar" />
        </div>

    </form>

</section>

<?php require("templates/footer.php"); ?>