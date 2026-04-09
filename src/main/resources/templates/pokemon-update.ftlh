<!DOCTYPE html>
<html>
<head>
    <title>Edit ${pokemon.name}</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-4">
    <h1 class="mb-4">Edit ${pokemon.name}</h1>
    <form action="/view/pokemons/${pokemon.characterId}/update" method="post" style="max-width: 400px;">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" name="name" value="${pokemon.name}" class="form-control"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Type</label>
            <input type="text" name="type" value="${pokemon.type}" class="form-control"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Description</label>
            <input type="text" name="description" value="${pokemon.description}" class="form-control"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Pokedex #</label>
            <input type="number" name="pokedexNumber" value="${pokemon.pokedexNumber}" class="form-control"/>
        </div>
        <button type="submit" class="btn btn-warning">Update</button>
        <a href="/view/pokemons/${pokemon.characterId}" class="btn btn-secondary">Cancel</a>
    </form>
</body>
</html>