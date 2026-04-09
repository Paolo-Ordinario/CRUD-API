<!DOCTYPE html>
<html>
<head>
    <title>Pokemon List</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-4">
    <h1 class="mb-4">All Pokemon</h1>
    <a href="/view/pokemons/new" class="btn btn-primary mb-4">+ Create New Pokemon</a>

    <div class="row">
        <#list pokemonList as pokemon>
        <div class="col-md-4 mb-3">
            <div class="card h-100">
                <div class="card-body">
                    <h5 class="card-title">${pokemon.name}</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Type: ${pokemon.type}</h6>
                    <p class="card-text">Pokedex #: ${pokemon.pokedexNumber}</p>
                    <a href="/view/pokemons/${pokemon.characterId}" class="btn btn-outline-primary btn-sm">View Details</a>
                </div>
            </div>
        </div>
        </#list>
    </div>
</body>
</html>