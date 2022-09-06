/* 
    quando clicar no pokemon da listagem temos que esconder o cartão do pokemon aberto e mostrar o cartaão do pokemon correspondente ao que foi selecionado na lisatagem. 
    E para isso vamos precisar trabalhar com dois elementos:

    1 - listagem
    2 - cartão do pokemon

    então precisamos criar duas variáveis no JS para trabalhar com os elementos da tela.

    vamos precisar trabalhar com um evento de clique feito pelo usuário
    na listagem de pokemons

    - remover a classe "aberto" só do cartão que está aberto
    - ao clicar em um pokemon da listagem pegamos o id desse pokemon para saber qual cartão mostrar
    - remover a classe "ativo" que marca o pokemon selecionado na listagem
    - adicionar a classe "ativo" no item da lista selecionado
*/

// precisamos criar duas variáveis no JS para trabalhar com os elementos da tela:

const listaSelecaoPokemons = document.querySelectorAll('.pokemon')
const pokemonsCartao = document.querySelectorAll('.cartao-pokemon')

listaSelecaoPokemons.forEach(pokemon =>{
    // vamos precisar trabalhar com um evento de clique feito pelo usuário
    // na listagem de pokemons

    pokemon.addEventListener('click', () => {
        // remover a classe "aberto" só do cartão que está aberto
        const cartaoPokemonAberto = document.querySelector('.aberto')
        cartaoPokemonAberto.classList.remove('aberto')

        // ao clicar em um pokemon da listagem pegamos o id desse pokemon para saber qual cartão mostrar
        const idPokemonSelecionado = pokemon.attributes.id.value

        const cartaoPokemonParaAbrir = document.getElementById('cartao-' + idPokemonSelecionado)
        cartaoPokemonParaAbrir.classList.add('aberto')

        // remover a classe "ativo" que marca o pokemon selecionado na listagem
        const pokemonsAtivoNaListagem = document.querySelector('.ativo')
        pokemonsAtivoNaListagem.classList.remove('ativo')

        // adicionar a classe "ativo" no item da lista selecionado
        const pokemonSelecionadoNaListagem = document.getElementById(idPokemonSelecionado)
        pokemonSelecionadoNaListagem.classList.add('ativo')
    })
})

