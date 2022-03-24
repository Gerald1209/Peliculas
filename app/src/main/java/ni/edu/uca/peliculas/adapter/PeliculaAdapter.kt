package ni.edu.uca.peliculas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ni.edu.uca.peliculas.databinding.ItemNacionalidadBinding
import ni.edu.uca.peliculas.databinding.ItemPeliculaBinding
import ni.edu.uca.peliculas.models.NacionalidadItem
import ni.edu.uca.peliculas.models.PeliculaItem

class PeliculaAdapter (val peliculaLista: List<PeliculaItem>): RecyclerView.Adapter<PeliculaAdapter.PeliculaHolder>()
{
    inner class  PeliculaHolder(val binding: ItemPeliculaBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(pelicula: PeliculaItem){
            with(binding){
                TxtId.text = pelicula.idPelicula.toString()
                TxtTitulo.text = pelicula.titulo
                TxtTipoMetraje.text = pelicula.tipoMetraje
                TxtNacionalidad.text = pelicula.nacionalidad
                TxtClasificacion.text = pelicula.clasificacion
                TxtDuracion.text = pelicula.duracion
                TxtSinopsis.text = pelicula.sinopsis
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaHolder {
        val binding = ItemPeliculaBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PeliculaHolder(binding)
    }

    override fun onBindViewHolder(holder: PeliculaHolder, position: Int) {
        holder.bind(peliculaLista[position])
    }

    override fun getItemCount(): Int =peliculaLista.size
}