package CRUD.API.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;

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
public ResponseEntity<?> getPokemonById(@PathVariable Long id) {
    Optional<Pokemon> pokemon = pokemonService.getPokemonById(id);
    if (pokemon.isPresent()) {
        return ResponseEntity.ok(pokemon.get());
    } else {
        return ResponseEntity.status(404).body("Pokemon with ID " + id + " not found");
    }
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