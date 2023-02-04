package com.example.noteapp.featureNotes.domain.repository

import kotlinx.coroutines.flow.Flow
import com.example.noteapp.featureNotes.domain.model.Note

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}

