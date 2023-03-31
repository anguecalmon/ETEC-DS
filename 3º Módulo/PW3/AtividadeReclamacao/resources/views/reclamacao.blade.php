<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reclamação</title>    
</head>
<body>

    <form action="/reclamacao" method="post">        
        {{csrf_field()}}        
        <input type="text" name="pc" placeholder="Pc"/>
        <input type="text" name="txTitulo" placeholder="Título" />
        <input type="text" name="txDescricao" placeholder="Descrição" />
        <input type="text" name="txDtReclamacao" placeholder="Data da reclamação" />
        <input type="submit" value="Salvar" />
    </form>

    @foreach($reclamacao as $r)        
        <p>
        {{$r->idRec}}
        {{$r->idLab}}
        {{$r->pc}}
        {{$r->titulo}}
        {{$r->descricao}}
        {{$r->dtReclamacao}}
        <a href="/reclamacao/excluir/{{$r->idRec}}"> Excluir </a>
        </p>
    @endforeach
    
</body> 
</html>

