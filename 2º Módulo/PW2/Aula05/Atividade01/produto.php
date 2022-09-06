<?php include("templates/header.php"); ?> 

<!DOCTYPE html>
<html>
<head>
    <title>Produto</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

    <form action="dados-produtos.php" method = "post">

    <div>
        <input type="text" placeholder="Produto" name="txtProduto">
    </div>

    <div>
        <input type="text" placeholder="Valor (R$)" name="txtValor">
    </div>

    <div>
        <input type="text" placeholder="Categoria" name="txtCategoria">
    </div>

    <div>
        <input type="submit" value="Enviar" />
    </div>

    </form>
    
</body>
</html>

<?php include("templates/footer.php"); ?>