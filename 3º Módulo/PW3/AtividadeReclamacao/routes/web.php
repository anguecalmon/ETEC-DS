<?php

Route::get('/', function () {
    return view('welcome');
});

Route::get('/reclamacao','ReclamacaoController@index');

Route::post('/reclamacao','ReclamacaoController@store');

Route::get('/reclamacao/excluir/{idRec, idLab}','ReclamacaoController@destroy');