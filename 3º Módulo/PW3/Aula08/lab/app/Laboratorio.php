<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Laboratorio extends Model 
{
    public $timestamps=false;

    protected $table="tbLaboratorio";

    //campos da minha tabela
    protected $fillable = ['idContato','nome','email','assunto','mensagem'];

}