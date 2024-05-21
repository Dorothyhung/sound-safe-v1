package com.hfad.soundsavev1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {
    private lateinit var volumeTextview: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = getString(R.string.app_name)

        volumeTextview = findViewById(R.id.volume_textview)

        val startButton: Button = findViewById(R.id.start_button)
        startButton.setOnClickListener {

            Toast.makeText(this, "Recording!", Toast.LENGTH_SHORT).show()

            displayStatus("Volume Value")

        }
    }

    private fun displayStatus(message: String) {
        // Set status message
        volumeTextview.text = message
        // Make status TextView visible
        volumeTextview.visibility = View.VISIBLE

    }
}