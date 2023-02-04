package com.example.noteapp.featureNotes.domain.model

import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.noteapp.ui.theme.BabyBlue
import com.example.noteapp.ui.theme.RedOrange
import com.example.noteapp.ui.theme.RedPink

@Entity
data class Note(
        val title: String,
        val content: String,
        val timestamp: Long,
        val color: Int,
        @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, Color.White, Color.Cyan, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)