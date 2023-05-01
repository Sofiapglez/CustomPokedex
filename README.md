# CustomPokedex
Práctica 1 - Control de versiones
CustomPokedex es un programa Java que permite a los usuarios llevar un registro personalizado de los Pokémon que han avistado y capturado. Cuenta con un menú interactivo que permite:

-Añadir un Pokemon avistado: el usuario tiene que añadir el nombre y tipo del pokemon
-Añadir un avistamiento legendario: añadir el nombre, tipo y localización del pokemon.
-Pasar Pokémon de la lista de avistados a la lista de capturados: el usuario puede capturar uno de los pokemons avistados, introduciendo el nombre del avistado. Al pasar a capturados tiene que ingresar el peso, la altura y descripción del pokemon.
-Mostrar lista de Pokémon avistados: enseña toda la información de los pokemons avistados.
-Mostrar lista de Pokémon capturados: enseña toda la información de los pokemons capturados
-Cerrar la Pokédex

Para este proyecto se han creado las siguientes clases:
-Pokemon: clase padre, en donde se almacena los atributos y métodos del objeto Pokemon.
-PokemonLegendario: clase hija de Pokemon, en donde se almacena los atributos y sus métodos.
-ListaPokemon: en esta clase se encuentran los siguientes métodos:
    -agregarPokemon: añade una unidad a la lista de pokemons.
    -eliminarPokemon: elimina una unidad a la lista.
    -mostrarLista: muestra la lista de pokemons.
    -obtenerPokemon: indica la posicion de un pokemon en la lista
    -buscarPokemon: busca el nombre del pokemon en la lista.

Todas estas se ejecutan en la clase Main.
