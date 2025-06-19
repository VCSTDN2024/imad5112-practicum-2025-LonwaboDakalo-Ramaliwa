package com.example.playlist

import android.content.Context
import android.widget.Toast

object PlaylistManager {
    private val songName = mutableListOf<String>()
    private val songArtist = mutableListOf<String>()
    private val songComment = mutableListOf<String>()
    private val songRating = mutableListOf<Int>()

    private var entryCount = 0 // keeps track of the input inserted
    private const val MAX_ENTRIES = 4 // max number of entries allowed (Constant)

    fun addEntry(song: String, artist: String, comment: String, rating: Int): Boolean {
        if (entryCount < MAX_ENTRIES) {
            songName.add(song)
            songArtist.add(artist)
            songComment.add(comment)
            songRating.add(rating)
            entryCount++
            return true
        }
        return false
    }
//clear all input and output
    fun clearAllEntries() {
        songName.clear()
        songArtist.clear()
        songComment.clear()
        songRating.clear()
        entryCount = 0
    }

    fun getEntryCount(): Int {
        return entryCount
    }

    fun calcAvgRating(): Double {
        return songRating.average()
    }



    fun getRecordedEntries(): List<String> {
        return songRating.mapIndexed {index, song ->"Song: $songName | Artist: ${songArtist[index]} | Rating: ${songRating[index]} | Comment: ${songComment[index]}"
        } // all song names are displayed in each index
    }


    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}
