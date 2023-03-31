<?php

Route::get('/', function () {
    return view('welcome');
});

Route::get('/Laboratorio', "LaboratorioController@index");


Route::get('/Reclamacao', "ReclamacaoController@index");


Route::get('/contato','ContatoController@index');

Route::post('/contato','ContatoController@store');

Route::get('/contato/excluir/{idContato}','ContatoController@destroy');