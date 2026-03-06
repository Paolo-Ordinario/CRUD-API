package CRUD.API.demo;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import javax.annotation.processing.Generated;

@RestController
@RequestMapping("/characters")

public class PokemonController {
    @Autowired
    PokemonService pokemonService;

    @GetMapping
    public List<Pokemon> getAllPokemon() {
        return pokemonService.getAllPokemon();
    }

    @GetMapping("/{id}")
    public Optional<Pokemon> getPokemonById(@PathVariable Long id) {
        return pokemonService.getPokemonById(id);
    }

    @PostMapping
    public Pokemon addPokemon(@RequestBody Pokemon pokemon) {
        return pokemonService.addPokemon(pokemon);
    }

    @PutMapping("/{id}")
    public Pokemon updatePokemon(@PathVariable Long id, @RequestBody Pokemon pokemon) {
        return pokemonService.updatePokemon(id, pokemon);
    }

    @DeleteMapping("/{id}")
    public void deletePokemon(@PathVariable Long id) {
        pokemonService.deletePokemon(id);
    }

    @GetMapping("/category/{type}")
    public List<Pokemon> getPokemonByType(@PathVariable String type) {
        return pokemonService.getPokemonByType(type);
    }

    @GetMapping("/search")
    public List<Pokemon> getPokemonByName(@RequestParam String name) {
        return pokemonService.getPokemonByName(name);
    }

}