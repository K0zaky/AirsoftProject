package com.dabellan.primerprojectfinal

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dabellan.primerprojectfinal.databinding.FragmentMarcasBinding

class MarcasFragment : Fragment(),OnClickListener {
    private  var _binding: FragmentMarcasBinding? = null
    private val binding get() = _binding!!

    private  lateinit var marcaAdapter: MarcaAdapter
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMarcasBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_marcas, container, false)

        val view = binding.root
        marcaAdapter = MarcaAdapter(getMarcas(), this)
        linearLayoutManager = LinearLayoutManager(requireContext())

        binding.recyclerView.apply {
            layoutManager = linearLayoutManager
            adapter = marcaAdapter
        }

        return view

    }

    override fun onDestroyView(){
        super.onDestroyView()
        _binding = null
    }


    private fun getMarcas(): MutableList<Marca> {
        val marcas = mutableListOf<Marca>()
        val gg = Marca(1, "G&G", "https://airsoftyequipacionprofesional.com/img/m/226-large_default.jpg", "https://www.guay2.com/es/product")
        val marui = Marca(2, "Tokyo Marui", "https://media.coronel-airsoft.com/brand/tokyo-marui-300x300_GlfnDBo.jpg", "https://madtactical.es/11_tokyo-marui")
        val vega = Marca(3, "Vega Force", "https://i.ebayimg.com/images/g/rzQAAOSwHLFa6fYI/s-l1600.jpg", "https://www.vegaforce.com/site/about?lang=en")
        val lct = Marca(4, "LCT Airsoft", "https://airsoftdefence.com/wp-content/uploads/2023/02/LCT_Logo.jpg", "https://www.lctairsoft.com/")
        val el = Marca(5, "E&L Airsoft", "https://catalogo.combatzone.es/img/m/6.jpg", "https://el-airsoft.com/")
        val umarex = Marca(6, "Umarex Airsoft", "https://findvectorlogo.com/wp-content/uploads/2018/10/umarex-airsoft-vector-logo.png", "https://www.umarex.com/")
        val ares = Marca(7, "Ares", "https://dismatacterrassa.com/img/m/3.jpg", "http://www.aresairsoft.com/")
        val dboys = Marca(8, "D|Boys", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/D-Boys_logo.svg/1280px-D-Boys_logo.svg.png", "https://dboysguns.com/")


        marcas.add(gg)
        marcas.add(marui)
        marcas.add(vega)
        marcas.add(lct)
        marcas.add(el)
        marcas.add(umarex)
        marcas.add(ares)
        marcas.add(dboys)

        return marcas
    }

    override fun onClickMarca(marca: Marca) {

        val uria = Uri.parse(marca.url)
        val intent = Intent(Intent.ACTION_VIEW, uria)
        startActivity(intent)
    }



}
