<!DOCTYPE html>
<html>
<head>
    <title>Create Pokemon</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-4">
    <h1 class="mb-4">Create New Pokemon</h1>
    <form action="/view/pokemons" method="post" style="max-width: 400px;">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" name="name" class="form-control" required/>
        </div>
        <div class="mb-3">
            <label class="form-label">Type</label>
            <input type="text" name="type" class="form-control" required/>
        </div>
        <div class="mb-3">
            <label class="form-label">Description</label>
            <input type="text" name="description" class="form-control" required/>
        </div>
        <div class="mb-3">
            <label class="form-label">Pokedex #</label>
            <input type="number" name="pokedexNumber" class="form-control" required min="1"/>
        </div>
        <button type="submit" class="btn btn-primary">Save</button>
        <a href="/view/pokemons" class="btn btn-secondary">Cancel</a>
    </form>
</body>
</html>