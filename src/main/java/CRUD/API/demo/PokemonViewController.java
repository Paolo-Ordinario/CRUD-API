package CRUD.API.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PokemonViewController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/view/pokemons")
    public String getAllPokemons(Model model) {
        model.addAttribute("pokemonList", pokemonService.getAllPokemon());
        return "pokemon-list";
    }

    @GetMapping("/view/pokemons/new")
    public String showCreateForm() {
        return "pokemon-create";
    }

    @GetMapping("/view/pokemons/{id}")
    public String getPokemonById(@PathVariable Long id, Model model) {
        Pokemon pokemon = pokemonService.getPokemonById(id)
                            .orElseThrow(() -> new RuntimeException("Pokemon not found"));
        model.addAttribute("pokemon", pokemon);
        return "pokemon-details";
    }

    @PostMapping("/view/pokemons")
    public String createPokemon(Pokemon pokemon) {
        pokemonService.addPokemon(pokemon);
        return "redirect:/view/pokemons";
    }

    @GetMapping("/view/pokemons/{id}/edit")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Pokemon pokemon = pokemonService.getPokemonById(id)
                            .orElseThrow(() -> new RuntimeException("Pokemon not found"));
        model.addAttribute("pokemon", pokemon);
        return "pokemon-update";
    }

    @PostMapping("/view/pokemons/{id}/update")
    public String updatePokemon(@PathVariable Long id, Pokemon pokemon) {
        pokemonService.updatePokemon(id, pokemon);
        return "redirect:/view/pokemons/" + id;
    }

    @GetMapping("/view/pokemons/{id}/delete")
    public String deletePokemon(@PathVariable Long id) {
        pokemonService.deletePokemon(id);
        return "redirect:/view/pokemons";
    }
}