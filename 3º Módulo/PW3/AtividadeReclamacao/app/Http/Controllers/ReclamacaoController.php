<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

use App\Reclamacao;

class ReclamacaoController extends Controller
{
    public function index()
    {
        $reclamacao = Reclamacao::all();
        return view('reclamacao',compact('reclamacoes'));
    }

    public function store(Request $request)
    {
        $reclamacao = new Reclamacao();

        $reclamacao ->pc = $request->pc;        
        $reclamacao ->titulo = $request->txTitulo;
        $reclamacao ->descricao = $request->txDescricao;
        $reclamacao ->dtCriacao = $request->txDtReclamacao;

        $reclamacao->save();

        return redirect('/reclamacao');
    }

    public function destroy($idRec)
    {
        $reclamacao = new Reclamacao();
        $reclamacao->where('idRec','=',$idRec)->delete();
        return redirect('/reclamacao');
    }
}
