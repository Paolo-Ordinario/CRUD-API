package CRUD.API.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    public List<Pokemon> getAllPokemon() {
        return pokemonRepository.findAll();
    }

    public Optional<Pokemon> getPokemonById(Long id) {
        return pokemonRepository.findById(id);
    }

    public Pokemon addPokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public Pokemon updatePokemon(Long id, Pokemon pokemon) {
        pokemon.setCharacterId(id);
        return pokemonRepository.save(pokemon);
    }

    public void deletePokemon(Long id) {
        pokemonRepository.deleteById(id);
    }

    public List<Pokemon> getPokemonByType(String type) {
        return pokemonRepository.findByType(type);
    }

    public List<Pokemon> getPokemonByName(String name) {
        return pokemonRepository.findByNameContaining(name);
    }
}