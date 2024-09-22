package com.dabellan.primerprojectfinal

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dabellan.primerprojectfinal.databinding.FragmentGunsBinding
import com.dabellan.primerprojectfinal.databinding.FragmentMarcasBinding

class GunsFragment : Fragment(),OnClickListener {
    private  var _binding: FragmentGunsBinding? = null
    private val binding get() = _binding!!

    private  lateinit var replicaAdapter: ReplicaAdapter
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGunsBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_guns, container, false)

        val view = binding.root
        replicaAdapter = ReplicaAdapter(getReplicas(), this)
        linearLayoutManager = LinearLayoutManager(requireContext())

        binding.recyclerView2.apply {
            layoutManager = linearLayoutManager
            adapter = replicaAdapter
        }

        return view
    }

    override fun onDestroyView(){
        super.onDestroyView()
        _binding = null
    }

    private fun getReplicas(): MutableList<Replica> {
        val replicas = mutableListOf<Replica>()

        val r1 = Replica(1, "Glock 17 Gen 4", "Umarex", "203€", "https://cdn.webshopapp.com/shops/201476/files/383691291/umarex-glock-17-gen-5-t4e-ram-cal-43-bk.jpg", "Espectacular Glock 17 de 4ª Generación fabricada por Vega Force para Umarex que es el propietario de las licencias originales de Glock. Fiel al modelo original cuenta con el cuerpo de polímero de alta resistencia y la corredera metálica. Dispone de los marcajes reales y un tacto y peso prácticamente calcados al modelo real.\n" +
                "\n" +
                "A nivel técnico cuenta con la calidad de VFC, por lo que su rendimiento es excelente y tiene una alta durabilidad. Dispara realmente bien de serie y no requiere de modificaciones o ajustes para mejorar su rendimiento. Es un modelo con muy pocas holguras y muestra unos estupendos acabados con holguras mínimas. Sin duda es un modelo que recomendamos desde Hobby Expert tanto para coleccionismo como para jugadores que busquen una réplica de pistola con mucha calidad, buen disparo y fiabilidad. ", "Tipo réplica: pistola CO2\n" +
                "\n" +
                "Serie réplica: Glock 17 Gen 4\n" +
                "\n" +
                "Material cuerpo: polímero reforzado\n" +
                "\n" +
                "Material corredera: metal\n" +
                "\n" +
                "Raíles: si, 1u de Picatinny bajo el cañón\n" +
                "\n" +
                "Blowback: si\n" +
                "\n" +
                "Recoil: si\n" +
                "\n" +
                "FPS: ~345 con bombona de CO2 a 26ºC (1.1 julios aprox)\n" +
                "\n" +
                "Longitud: 202mm\n" +
                "\n" +
                "Peso: 659gr\n" +
                "\n" +
                "Hop-up ajustable (quitando la corredera se accede a la regulación)\n" +
                "\n" +
                "Color: negro\n" +
                "\n" +
                "Capacidad del cargador: 23 BBS de 6mm\n" +
                "\n" +
                "Incluye un cargador de CO2 (bombonas no incluidas)\n" +
                "\n" +
                "Dispone de número de serie único grabado en la fábrica\n" +
                "\n" +
                "Cargador suplementario de GAS: GLOCK 17 GEN4")


        val r2 = Replica(2, "Raider 2.0", "G&G", "179.95€", "https://b282c5de4f50ed30d5ce-25e9f6b52714e6c3d4dbb7e330152014.ssl.cf3.rackcdn.com/uploaded_thumb_medium/a0150598627ad0cafdf615928bdd49e6/image-cHJvZHVjdA==--prod1506670888.png", "La CM16 es una de las réplicas de airsoft mas famosas y extendidas por el mundo. Desde hace años se trata de una gama de réplicas de airsoft con una relación calidad-precio espectacular. Sus acabados en polímero y/o metal, calidades, peso y maniobrabilidad la hacen ideal para jugadores noveles que están empezando o para jugadores más veteranos que buscan una segunda réplica mas casual. \n" +
                "\n" +
                "La versión 2.0 incorpora como cambios principales un guardamanos tipo M-LOK, gearbox reforzado y lineas mas agresivas en el cuerpo. Su solidez y ligereza la hacen una opción muy interesante con una relación calidad/precio fantástica. \n" +
                "\n" +
                "Con miles de unidades vendidas en todo el mundo, podemos tener la seguridad de adquirir una réplica fiable y con facilidad para encontrar repuestos y mecánicos que puedan repararlas sin complicaciones. Al tener acabados en polímero su ligereza es notable y no perjudica la rigidez del conjunto, siendo un punto a favor a tener en cuenta. Habitualmente en réplicas con acabados completos de cuerpo y cañón de polímero, podemos encontrar faltas de rigidez u holguras con el paso del tiempo. Esto es algo normal y habitual pero G&G ha sabido encontrar un gran equilibrio y nos encontramos ante una de las mejores elecciones a la hora de adquirir una réplica con acabados de polímero, sobre todo para jugadores noveles.", "Referencia fabricante: EGC-16P-R20-BNB-NCM\n" +
                "· Tipo: AEG\n" +
                "· Cuerpo: Plástico\n" +
                "· Longitud total: 715mm\n" +
                "· Peso: 2330g\n" +
                "· Cojinetes: 8mm\n" +
                "· Motor: 18000rpm\n" +
                "· Cañón interno: 275mm (diametro 6.04mm)\n" +
                "· Cámara de Hop Up: Plástico tipo rotatorio\n" +
                "· Cargador: 450R\n" +
                "· Velocidad: 100m/s\n" +
                "· Blowback: No\n" +
                "· Cableado: 18 AWG\n" +
                "· Cilindro: Aluminio\n" +
                "· Cabeza cilindro: Plástico\n" +
                "· Cabeza pistón: Plástico\n" +
                "· Gatillo Electrónico: No\n" +
                "· MOSFET: No\n" +
                "· Guía de muelle: Metal")

        val r3 = Replica(3, "ARP 9", "G&G", "250€", "https://disthavoc.com/wp-content/uploads/2019/09/46974a_1.jpg", "G&G ha realizado un trabajo excepcional durante años con su gama CM16, pero en este caso se han superado consiguiendo una réplica realmente corta pero que sorprende nada más sacarla de la caja. Su robustez contrasta con el bajo peso y cuando la probamos observamos una gran precisión y alcance, donde acertar a blancos pequeños a 40-50m es realmente sencillo y cómodo. Sin duda es una réplica de Airsoft idónea para jugadores noveles que buscan algo cómodo y compacto y para jugadores experimentados que buscan un complemento a sus fusiles de asalto mas largos. Esta G&G ARP9 es una de las mejores elecciones actuales tanto para juego de tipo CQB como para distancias medias.", "Tipo réplica: fusil de asalto corto\n" +
                "\n" +
                "Serie réplica: M4\n" +
                "\n" +
                "Material cuerpo: polímero reforzado de alto rendimiento\n" +
                "\n" +
                "Material guardamanos: aluminio anodizado en negro y mecanizado en CNC\n" +
                "\n" +
                "Culata: ajustable\n" +
                "\n" +
                "Raíles: picatinny\n" +
                "\n" +
                "Tipo batería recomendada: Lipo de 11.1V\n" +
                "\n" +
                "Modelos recomendados de batería: OPCIÓN 1\n" +
                "\n" +
                "Blowback: no\n" +
                "\n" +
                "Recoil: no\n" +
                "\n" +
                "Mosfet: si\n" +
                "\n" +
                "Gatillo electrónico: si\n" +
                "\n" +
                "Rodamientos: 8mm\n" +
                "\n" +
                "FPS aprox: 315 (comprobamos cada unidad y le cambiamos el muelle si es necesario para conseguir un valor correcto en julios y FPS. Algunas unidades al tener un cañón tan corto y venir con un muelle duro de fábrica, se pasan de 350 FPS y 1.14J. En Hobby Expert solucionamos esto gratuitamente)\n" +
                "\n" +
                "Cañón: 6.08mm diámetro y 128mm longitud\n" +
                "\n" +
                "Guía de muelle metálica\n" +
                "\n" +
                "Cableado: 18AWG\n" +
                "\n" +
                "Longitud: 497mm\n" +
                "\n" +
                "Peso: 2000gr\n" +
                "\n" +
                "Color: negro\n" +
                "\n" +
                "Usa cargadores de subfusil de 9mm\n" +
                "\n" +
                "incluye cargador Hi-Cap de polímero, varilla desatascadora y manual")

        val r4 = Replica(4, "CM16 Raider", "G&G", "167.99€", "https://www.armasairsoft.es/wp-content/uploads/2020/04/raidercn.jpg", "La CM16 es una de las réplicas de airsoft mas famosas y extendidas por el mundo. Desde hace años se trata de una gama de réplicas de airsoft con una relación calidad-precio espectacular. Sus acabados en polímero y/o metal, calidades, peso y maniobrabilidad la hacen ideal para jugadores noveles que están empezando o para jugadores más veteranos que buscan una segunda réplica mas casual. \n" +
                "\n" +
                "Con miles de unidades vendidas en todo el mundo, podemos tener la seguridad de adquirir una réplica fiable y con facilidad para encontrar repuestos y mecánicos que puedan repararlas sin complicaciones. Al tener acabados en polímero su ligereza es notable y no perjudica la rigidez del conjunto, siendo un punto a favor a tener en cuenta. Habitualmente en réplicas con acabados completos de cuerpo y cañón de polímero, podemos encontrar faltas de rigidez u holguras con el paso del tiempo. Esto es algo normal y habitual pero G&G ha sabido encontrar un gran equilibrio y nos encontramos ante una de las mejores elecciones a la hora de adquirir una réplica con acabados de polímero, sobre todo para jugadores noveles.\n" +
                "\n" +
                "Su culata es ajustable y con espacio suficiente para diversos tipos de baterías, siendo recomendable usar las de tipo \"nunchuck\" o \"lápiz\" en configuración doble.", "Part number: EGC-16P-RDS-BNB-NCM\n" +
                "\n" +
                "Tipo réplica: fusil de asalto\n" +
                "\n" +
                "Serie réplica: M4\n" +
                "\n" +
                "Material cuerpo: polímero reforzado de alto rendimiento\n" +
                "\n" +
                "Material guardamanos: polímero reforzado\n" +
                "\n" +
                "Culata: ajustable\n" +
                "\n" +
                "Raíles: picatinny\n" +
                "\n" +
                "Tipo batería recomendada: Lipo de 11.1V\n" +
                "\n" +
                "Modelos recomendados de batería: OPCIÓN 1, OPCIÓN 2, OPCIÓN 3\n" +
                "\n" +
                "Blowback: no\n" +
                "\n" +
                "Recoil: no\n" +
                "\n" +
                "Mosfet: no (se recomienda la instalación de un mosfet con freno activo para proteger el switch con el uso y poder usar baterías de 11.1V sin ningún problema de funcionamiento y lograr mejor tacto en el gatillo a la hora de disparar)\n" +
                "\n" +
                "Gatillo electrónico: no\n" +
                "\n" +
                "Rodamientos: 8mm\n" +
                "\n" +
                "Muelle: M100\n" +
                "\n" +
                "FPS aprox: 330-350fps (dependiendo de la remesa varían ligeramente entre este rango)\n" +
                "\n" +
                "Cañón: 6.04mm diámetro y 233mm longitud\n" +
                "\n" +
                "Longitud: 662mm\n" +
                "\n" +
                "Peso: 2300gr\n" +
                "\n" +
                "Color: negra\n" +
                "\n" +
                "Incluye cargador Hi-Cap metálico, bolsa de 1000 BBS 0.20G, varilla desatascadora, alzas y manual\n" +
                "\n" +
                "No se incluye batería ni cargador de baterías")

        val r5=Replica(5, "RK-74", "G&G", "479.99€", "https://www.hobbyexpert.es/media/catalog/product/cache/2ef69e4688be0a9f6c9a941df119cc0c/R/E/REPLICA_AEG_AK74_GYG_RK74T_NEGRA_01_3.jpeg", "Esta fantástica réplica de airsoft G&G RK74T (modelo largo de la gama RK74) es una de las más modernas e interesantes adaptaciones tácticas de los conocidos rifles AK. En este caso el fabricante taiwanés G&G nos presenta una réplica AEG construida en full metal, sin holguras y con detalles técnicos fantásticos como un gatillo electrónico programable (ETU), rodamientos de 8mm o un motor speed de 18.000rpm. Sin duda es una de las réplicas más interesantes y con mejor relación calidad precio de su categoría, por lo que es apta para jugadores noveles y para los más experimentados que quieren algo diferente y moderno. \n" +
                "\n" +
                "Además incorpora una bocacha de tipo amplificadora de sonido que consigue un ruido característico en cada disparo y no pasaremos en absoluto desapercibidos con el resto de réplicas a nuestro alrededor. Con esto conseguimos tener una réplica de airsoft diferente que se separa de los ya vistos \"M4\" tradicionales y con unas calidades excepcionales. \n" +
                "\n", "Part number: GRK-74T-ETU-BNB-NCM\n" +
                "\n" +
                "Tipo réplica: fusil de asalto corto\n" +
                "\n" +
                "Serie réplica: AK\n" +
                "\n" +
                "Material cuerpo: metal\n" +
                "\n" +
                "Material guardamanos: aluminio anodizado en negro y mecanizado en CNC\n" +
                "\n" +
                "Culata: ajustable\n" +
                "\n" +
                "Raíles: picatinny\n" +
                "\n" +
                "Tipo batería recomendada: Lipo de 11.1V (la batería se aloja en el guardamanos y dispone de 3 espacios donde caben las 3 celdas de una batería tipo nunchuk triple)\n" +
                "\n" +
                "Modelo recomendado de batería: OPCIÓN 1, OPCIÓN 2\n" +
                "\n" +
                "Blowback: no\n" +
                "\n" +
                "Recoil: no\n" +
                "\n" +
                "Mosfet: si\n" +
                "\n" +
                "Gatillo electrónico: si (permite programar modos de disparo semi-auto o semi-ráfaga de 3 tiros)\n" +
                "\n" +
                "Rodamientos: 8mm\n" +
                "\n" +
                "Muelle: M100\n" +
                "\n" +
                "FPS aprox (comprobado en tienda): 345 con el hopup al mínimo y bolas de 0.20gr\n" +
                "\n" +
                "Guía de muelle metálica con rodamiento axial\n" +
                "\n" +
                "Pistón reforzado con dientes metálicos\n" +
                "\n" +
                "Cabeza de pistón de aluminio\n" +
                "\n" +
                "Cañón: 6.03mm diámetro y 463mm longitud\n" +
                "\n" +
                "Motor: speed de 18000rpm\n" +
                "\n" +
                "Longitud: 940mm (culata desplegada)\n" +
                "\n" +
                "Peso: 3320gr\n" +
                "\n" +
                "Color: negro\n" +
                "\n" +
                "Incluye cargador de bolas de tipo varilla, cargador Mid-Cap de polímero y varilla desatascadora")


        replicas.add(r1)
        replicas.add(r2)
        replicas.add(r3)
        replicas.add(r4)
        replicas.add(r5)

        return replicas


    }

    override fun onClickReplica(replica: Replica){
        super.onClickReplica(replica)
        Toast.makeText(requireContext(), "${replica.nombre}", Toast.LENGTH_SHORT).show()
        val intent = Intent(requireContext(), ReplicaDetallesActivity::class.java)
        intent.putExtra("Nombre réplica", replica.nombre)
        intent.putExtra("Marca", replica.marca)
        intent.putExtra("Precio", replica.precio)
        intent.putExtra("Imagen", replica.img)
        intent.putExtra("Descripción", replica.desc)
        intent.putExtra("Detalles", replica.caracteris)
        startActivity(intent)
    }

}