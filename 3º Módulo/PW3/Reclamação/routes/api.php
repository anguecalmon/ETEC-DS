<?php

use Illuminate\Http\Request;

Route::get('/contato', 'ContatoController@allContacts');

Route::middleware('auth:api')->get('/user', function (Request $request) {
    return $request->user();
});
