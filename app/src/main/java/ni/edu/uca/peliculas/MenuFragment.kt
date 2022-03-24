package ni.edu.uca.peliculas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ni.edu.uca.peliculas.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {
    lateinit var  fBinding : FragmentMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        fBinding = FragmentMenuBinding.inflate(layoutInflater)
        return fBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(fBinding){

            btnClasificacion.setOnClickListener {
                it.findNavController().navigate(R.id.irAClasificacion)
            }

            btnGenero.setOnClickListener {
                it.findNavController().navigate(R.id.irAGenero)
            }

            btnIdioma.setOnClickListener {
                it.findNavController().navigate(R.id.irAIdioma)
            }

            btnNacionalidad.setOnClickListener {
                it.findNavController().navigate(R.id.irANacionalidad)
            }

            btnPelicula.setOnClickListener {
                it.findNavController().navigate(R.id.irAPelicula)
            }

        }
    }
}