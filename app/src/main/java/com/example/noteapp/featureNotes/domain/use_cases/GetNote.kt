package com.example.noteapp.featureNotes.domain.use_cases

import com.example.noteapp.featureNotes.domain.model.Note
import com.example.noteapp.featureNotes.domain.repository.NoteRepository

class GetNote(
        private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}