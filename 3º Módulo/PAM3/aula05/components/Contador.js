import * as React from 'react';
import { StatusBar } from 'expo-status-bar';
import { Text, Button, View, StyleSheet } from 'react-native';


export default class Contador extends React.Component {
    constructor() {
        super();
        this.state = {
            contador: 0,
            titulo: "Meu primeiro contador:"
        };

    //o método "super" no construtor classifica uma "variável mãe/global", e para criar uma variável utiliza-se o "this.state" e todas as variáveis são criadas aqui
    //todos os atributos do projeto ficam salvo no "state"
    } 

    Decrementar() {
        this.setState ({
            contador: this.state.contador -1
        });
        
    //o "setState" faz a alteração do estado
    }

    Incrementar() {
        this.setState ({
            contador: this.state.contador +1
        });

    //o "setState" faz a alteração do estado
    }

    render() {
        return (
            <View style={styles.container}>
                <View style={styles.texto}>
                    <Text style={{ color: '#fff' }}>{this.state.titulo}</Text>
                    <Text style={{ color: '#fff' }}>{this.state.contador}</Text>
                    <StatusBar style="auto"/>
                </View>
            <View style={styles.botoes}>
                <Button
                    style={styles.botao1}
                    title="Aumenta"
                    onPress={this.Incrementar.bind(this)}
                />
                <Button
                    style={styles.botao2}
                    onPress={this.Decrementar.bind(this)}
                    title="Diminui"
                />
            </View>
        </View>
        );
    }
}
    const styles = StyleSheet.create({
        botoes: {
            display: 'flex',
            flexDirection: 'row',
            alignSelf: 'center',
            top: 300,
            height: 45,
            borderRadius: 10,
        },
        texto: {
            alignItems: 'center',
            top: 200,
        },
        container: {
            flex: 1,
            backgroundColor: '#6FA8DC',
            alignItems: 'center',
            justifyContent: 'center',
        }
    });