package com.example.playlist

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var txtSong: EditText
    private lateinit var txtArtist: EditText
    private lateinit var txtComment: EditText
    private lateinit var rdoGroupRating: RadioGroup
    private lateinit var rdoRating1: RadioButton
    private lateinit var rdoRating2: RadioButton
    private lateinit var rdoRating3: RadioButton
    private lateinit var rdoRating4: RadioButton
    private lateinit var rdoRating5: RadioButton

    private lateinit var btnAdd: Button
    private lateinit var btnClear: Button
    private lateinit var btnList: Button
    private lateinit var btnExit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtSong = findViewById(R.id.txtSong)
        txtArtist = findViewById(R.id.txtArtist)
        txtComment = findViewById(R.id.txtComment)
        rdoGroupRating = findViewById(R.id.radioGroupRating)
        rdoRating1 = findViewById(R.id.rdoRating1)
        rdoRating2 = findViewById(R.id.rdoRating2)
        rdoRating3 = findViewById(R.id.rdoRating3)
        rdoRating4 = findViewById(R.id.rdoRating4)
        rdoRating5 = findViewById(R.id.rdoRating5)

        btnAdd = findViewById(R.id.btnAdd)
        btnClear = findViewById(R.id.btnClear)
        btnList = findViewById(R.id.btnList)
        btnExit = findViewById(R.id.btnExit)


        btnAdd.setOnClickListener{ addEntry() }
        btnClear.setOnClickListener{ clearInputs() }
        btnExit.setOnClickListener { finishAffinity() }
        btnList.setOnClickListener{
            try {
                startActivity(Intent(this, ViewList::class.java)) // Takes you to the playlist Page
            } catch (e: Exception) {
                PlaylistManager.showToast(this, "Error navigating to details: ${e.message}")
            }
            PlaylistManager.showToast(this, "Playlist can only be cleared in the home page")
            // makes user of the only option to clear data
        }
    }

    private fun addEntry() {
        val song = txtSong.text.toString()
        val artist = txtArtist.text.toString()
        val comment = txtComment.text.toString()

        // var selectedRating = 0
        val selectedRating = when {
            rdoRating1.isChecked -> 1 // if (rdoRating1.isChecked) selectedRating = 1
            rdoRating2.isChecked -> 2 // if (rdoRating2.isChecked) selectedRating = 2
            rdoRating3.isChecked -> 3 // if (rdoRating3.isChecked) selectedRating = 3
            rdoRating4.isChecked -> 4 // if (rdoRating4.isChecked) selectedRating = 4
            rdoRating5.isChecked -> 5 // if (rdoRating5.isChecked) selectedRating = 5
            else -> 0
        }

        // views the current entry count in the output ---
        println("Entries count before adding: ${PlaylistManager.getEntryCount()}")

        // Error Handling and Validation
        if (song.isEmpty() || artist.isEmpty() || comment.isEmpty() || selectedRating == 0) {
            PlaylistManager.showToast(this, "Please fill in all fields.")
            return
        }


        try {
            //  Error Handling
            if (selectedRating !in 1..5) { // Ensures rating is between 1 and 5
                PlaylistManager.showToast(this, "Rating must be between 1 and 5.")
                return
            }
        } catch (e: NumberFormatException) {
            PlaylistManager.showToast(this, "Invalid Rating. Please select a rating.")
            return
        }

        // Checks if max entries reached
        if (PlaylistManager.getEntryCount() >= 4) {
            PlaylistManager.showToast(this, "Maximum of 4 entries reached. Please view details or clear entries.")
            return
        }

        // Adding in an entry using the custom class/object companion file
        try {
            val added = PlaylistManager.addEntry(song, artist, comment, selectedRating)
            if (!added) {
                throw Exception("Could not add entry. Max entries reached")
            } else {
                PlaylistManager.showToast(this, "Entry added successfully!")
                txtSong.setText("")
                txtArtist.setText("")
                txtComment.setText("")
                rdoGroupRating.clearCheck()
            }
        } catch (e: Exception) {
            PlaylistManager.showToast(this, "Unexpected error: ${e.message}")
        }
    }

    private fun clearInputs() {
        PlaylistManager.clearAllEntries()
        println("Form cleared: ${txtSong.text}, ${txtArtist.text}, ${txtComment.text}")
        PlaylistManager.showToast(this, "Input fields & Arrays cleared.") //all data is cleared
    }


    }
