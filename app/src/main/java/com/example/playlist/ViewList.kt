package com.example.playlist

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ViewList : AppCompatActivity() {
    private lateinit var txtTotalSongs: TextView
    private lateinit var txtAvgRating: TextView
    private lateinit var lvRecordedEntries: ListView
    private lateinit var btnBack: Button
    private lateinit var btnExit: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_view_list)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txtTotalSongs = findViewById(R.id.txtTotalSongs)
        txtAvgRating= findViewById(R.id.txtAvgRatings)
        lvRecordedEntries = findViewById(R.id.lvRecordedEntries)
        btnBack = findViewById(R.id.btnBack)
        btnExit = findViewById(R.id.btnExit)

        txtTotalSongs.text = "Total Songs: ${PlaylistManager.getEntryCount()}"

        txtAvgRating.text = "Avgerage Rating: ${PlaylistManager.calcAvgRating()}"



        // Use ArrayAdapter to link inventory data to ListView
        val entriesAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, PlaylistManager.getRecordedEntries())
        lvRecordedEntries.adapter = entriesAdapter


        // Return to Home Page
        btnBack.setOnClickListener {
            finish()
            PlaylistManager.showToast(this, "Playlist can only be cleared in the home page")
            // makes user of the only option to clear data
        }

        // Click to exit app
        btnExit.setOnClickListener { finishAffinity() }
    }

}
