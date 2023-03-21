import * as React from 'react';
import { Text, View, StyleSheet } from 'react-native'; //importa componentes do react native, view = div
import Contador from './components/Contador';

//tudo no javascript é uma função

//o "export default" expõe uma função, globalmente, exportando ele para todo o resto do projeto, ou seja, a função padrão do arquivo é a função app

//sempre declarar o nome dos arquivos e das funções igual, sendo a primeira letra maíscula

export default function App() {
  return (
    <View>
      <Contador/>
    </View>
  );

}