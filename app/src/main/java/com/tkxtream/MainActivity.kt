package com.tkxtream

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the "Live TV" button from the XML we created earlier
        val btnLiveTv = findViewById<CardView>(R.id.btnLiveTv)

        // Set what happens when you click or press "Select" on the remote
        btnLiveTv.setOnClickListener {
            Toast.makeText(this, "Opening Live TV...", Toast.LENGTH_SHORT).show()
            // In the next step, we will trigger the ExoPlayer here
        }
        
        // Ensure the button is highlighted when using a TV Remote
        btnLiveTv.requestFocus()
    }
}
