package com.example.prctica09_mendenavegacininferior.ui.galeria

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.prctica09_mendenavegacininferior.R

class ImageAdapter(
    private val images: List<Int>,
    private val names: List<String>,
    private val descriptions: List<String>,
    private val onClick: (Int, String, String) -> Unit
) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_image, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(images[position], names[position], descriptions[position])
    }

    override fun getItemCount() = images.size

    inner class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imageView: ImageView = view.findViewById(R.id.imageView)

        fun bind(imageRes: Int, name: String, description: String) {
            imageView.setImageResource(imageRes)
            imageView.setOnClickListener { onClick(imageRes, name, description) }
        }
    }
}