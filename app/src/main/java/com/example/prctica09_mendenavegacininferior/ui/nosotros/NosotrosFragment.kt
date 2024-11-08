package com.example.prctica09_mendenavegacininferior.ui.nosotros

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import com.example.prctica09_mendenavegacininferior.R

class NosotrosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_nosotros, container, false)

        // Configurar el VideoView
        val videoView = view.findViewById<VideoView>(R.id.videoView)
        val uri = Uri.parse("android.resource://" + requireActivity().packageName + "/" + R.raw.promotional_video)
        videoView.setVideoURI(uri)
        videoView.setOnPreparedListener { videoView.start() }

        // Configurar el botón de página oficial
        val button = view.findViewById<Button>(R.id.button_official_page)
        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.suburbia.com.mx/tienda/home"))
            startActivity(intent)
        }

        return view
    }
}