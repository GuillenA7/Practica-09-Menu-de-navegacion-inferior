package com.example.prctica09_mendenavegacininferior.ui.galeria

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.prctica09_mendenavegacininferior.R

class GaleriaFragment : Fragment() {

    private val imageList = listOf(
        R.drawable.image1, R.drawable.image2, R.drawable.image3,
        R.drawable.image4, R.drawable.image5, R.drawable.image6
    )

    private val imageNames = listOf("Consola Xbox Series X de 1 TB", "Consola Playstation de 1 TB edición estándar", "Consola Nintendo Switch OLED de 64 GB + Accesorios", "Silla gamer Titano", "Computadora Gamer Xtreme PC Gaming XTBRR716GBRENOIR AMD Ryzen 7 16 GB RAM 3 TB HDD 240 GB SSD", "Audífono gamer over ear Xtech edicion Spider-Man Miles Morales alámbrica")
    private val imageDescriptions = listOf(
        "La consola Xbox Series X .Es la más rápida y potente de la historia, juega miles de títulos de cuatro generaciones de consolas; todos los juegos se ven mejor y se juegan mejor en Xbox Series X", "La consola Playstation 5 disco edition slim ps5ds es la consola de videojuegos más potente del mercado. Con una definición de video de 4k uhd, esta consola te ofrece una experiencia de juego inigualable. La edición estándar de esta consola viene con un disco duro de 1 tb, que te permite almacenar una gran cantidad de juegos. Además, esta consola es compatible con wi-fi y ethernet, lo que te permite conectarte a internet y jugar en línea. También cuenta con un lector integrado de blu ray, para que puedas ver tus películas favoritas en alta definición. La consola Playstation 5 disco edition slim ps5ds es la consola perfecta para los jugadores que buscan la mejor experiencia de juego posible.", "Con tu consola Switch tendrás entretenimiento asegurado todos los días. Su tecnología fue creada para poner nuevos retos tanto a jugadores principiantes como expertos. Switch se convirtió en una de las consolas más versátiles del mercado gracias a su uso portátil y de sobremesa. Nintendo desarrolló este modelo con el objetivo de tener todas las comodidades de la tecnología de elite en un aparato portátil con el que podrás jugar y disfrutar de diverso contenido online. Los Joy-con cuentan con botones especiales para realizar print de pantalla. Además, posee una cámara infrarroja que puede leer la distancia respecto a los objetos e incluso detectar formas. Guarda tus apps, fotos, videos y mucho más en el disco duro, que cuenta con una capacidad de 64 GB. Incluye: 1 consola, 1 kit accesorios, 1 cargador, 1 manual de usuario",
        "Mejore su experiencia de juego con la mejor combinación de comodidad y estilo. La silla Gamer Titano está meticulosamente diseñada para jugadores que exigen siempre lo mejor. Su diseño ergonómico garantiza horas de juego inmersivo sin interrupciones. Sumérgete en su lujoso acolchado y en el soporte lumbar ajustable, manteniendo una postura perfecta mientras dominas el mundo virtual. El diseño elegante y futurista complementa cualquier configuración de juego, haciendo una declaración tanto en estética como en funcionalidad, disfruta de la increíble tecnología Led para destacar en cualquier momento del juego. Libere su potencial con la silla Gamer Titano, donde la comodidad se une a la victoria. Mejora tu trono hoy y conquista con confianza TITANO", "Gráficos AMD Radeon Graphics con frecuencia de 2000 MHz y 8 núcleos lo que proporciona un rendimiento rápido. AMD Ryzen 7 5700G con 8 núcleos y 16 hilos 3.8 GHz de velocidad y 4.6 velocidad turbo con 16MB L3 en Cache. Memoria RAM 16GB DDR4 frecuencia de 3200MHz. Unidad de estado sólido SSD 240GB. Disco duro mecánico 3TB. Fuente de poder 600W. Tarjeta Madre CHIPSET AMD B450. Adaptador WIFI. Sistema operativo: Windows 10 Versión para evaluación de componentes", "Los audífonos XTECH SPIDER-MAN Miles Morales - están diseñados para ofrecer una experiencia de audio de alta calidad. Su diseño supraaural y estilo de diadema aseguran un ajuste cómodo durante su uso prolongado. El micrófono tipo boom proporciona una calidad de captura de voz clara, con una impedancia de salida de 2.2 Ohmios y una sensibilidad de -43 dB. La tecnología de conectividad es alámbrica, con un conector de 3.5 mm que asegura compatibilidad con diversos dispositivos."
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_galeria, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val adapter = ImageAdapter(imageList, imageNames, imageDescriptions) { imageRes, name, description ->
            val intent = Intent(requireContext(), ImageDetailActivity::class.java)
            intent.putExtra("imageResource", imageRes)
            intent.putExtra("imageName", name)
            intent.putExtra("imageDescription", description)
            startActivity(intent)
        }
        recyclerView.adapter = adapter

        return view
    }
}