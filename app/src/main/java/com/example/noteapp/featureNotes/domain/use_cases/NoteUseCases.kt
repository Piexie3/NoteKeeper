package manu.notes.featureNotes.domain.use_cases

import com.example.noteapp.featureNotes.domain.use_cases.AddNote
import com.example.noteapp.featureNotes.domain.use_cases.GetNote

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)