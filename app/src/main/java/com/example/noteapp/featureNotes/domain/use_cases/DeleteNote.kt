package manu.notes.featureNotes.domain.use_cases

import com.example.noteapp.featureNotes.domain.model.Note
import com.example.noteapp.featureNotes.domain.repository.NoteRepository

class DeleteNote(
        private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}