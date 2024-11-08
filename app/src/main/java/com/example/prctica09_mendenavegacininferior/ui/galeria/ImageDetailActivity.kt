package com.example.prctica09_mendenavegacininferior.ui.galeria

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.example.prctica09_mendenavegacininferior.R

class ImageDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val imageView: ImageView = findViewById(R.id.imageView)
        val nameTextView: TextView = findViewById(R.id.textView_name)
        val descriptionTextView: TextView = findViewById(R.id.textView_description)

        val imageResource = intent.getIntExtra("imageResource", 0)
        val imageName = intent.getStringExtra("imageName") ?: "Nombre no disponible"
        val imageDescription = intent.getStringExtra("imageDescription") ?: "Descripción no disponible"

        if (imageResource != 0) {
            imageView.setImageResource(imageResource)
        } else {
            imageView.setImageResource(R.drawable.default_image)
        }

        nameTextView.text = imageName
        descriptionTextView.text = imageDescription
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}