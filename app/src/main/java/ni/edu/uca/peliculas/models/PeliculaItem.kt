package ni.edu.uca.peliculas.models

data class PeliculaItem(
    val clasificacion: String,
    val duracion: String,
    val idPelicula: Int,
    val nacionalidad: String,
    val sinopsis: String,
    val tipoMetraje: String,
    val titulo: String
)