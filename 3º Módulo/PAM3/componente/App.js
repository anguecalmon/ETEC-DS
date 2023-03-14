import React from "react";
import { StyleSheet, View, Text, Image, ScrollView, TextInput } from 'react-native';

const Pokemon = () => {
  return (
    <ScrollView>
      <View>
        <Text
          style={{
            fontSize: 50,
            textAlign: "center",
            color: "orange",

          }}
        >
          Charizardão
        </Text>
        <Image
          source={require('./assets/charizard.png')}
          style={{ width: 300, height: 210, alignSelf: "center" }}
        />
      </View>
      <TextInput
        style={{
          height: 40,
          borderColor: 'gray',
          borderWidth: 1,
          padding: 5,
          margin: 15,
        }}
        defaultValue="Digite aquiii!"
      />
    </ScrollView>
  );
}

export default Pokemon;