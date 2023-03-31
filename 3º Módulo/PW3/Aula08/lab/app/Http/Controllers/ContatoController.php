<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

use App\Contato;

class ContatoController extends Controller
{
    public function index()
    {
        $contatos = Contato::all();
        return view('contato',compact('contatos'));
    }

    public function store(Request $request)
    {
        $contato = new Contato();

        $contato ->nome = $request->txNome;        
        $contato ->email = $request->txEmail;
        $contato ->assunto = $request->txAssunto;
        $contato ->mensagem = $request->txMensagem;

        $contato->save();

        return redirect('/contato');
    }

    public function destroy($idContato)
    {
        $contato = new Contato();
        $contato->where('idContato','=',$idContato)->delete();
        return redirect('/contato');
    }
}
