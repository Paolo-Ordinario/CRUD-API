<!DOCTYPE html>
<html>
<head>
    <title>${pokemon.name}</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-4">
    <div class="card" style="max-width: 500px;">
        <div class="card-body">
            <h1 class="card-title">${pokemon.name}</h1>
            <p><strong>Type:</strong> ${pokemon.type} required</p>
            <p><strong>Description:</strong> ${pokemon.description} required</p>
            <p><strong>Pokedex #:</strong> ${pokemon.pokedexNumber} required</p>

            <a href="/view/pokemons/${pokemon.characterId}/edit" class="btn btn-warning btn-sm">Edit</a>
            <a href="/view/pokemons/${pokemon.characterId}/delete" class="btn btn-danger btn-sm">Delete</a>
            <a href="/view/pokemons" class="btn btn-secondary btn-sm">Back to List</a>
        </div>
    </div>
</body>
</html>