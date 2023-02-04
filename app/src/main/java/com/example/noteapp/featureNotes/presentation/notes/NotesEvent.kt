package com.example.noteapp.featureNotes.presentation.notes

import com.example.noteapp.featureNotes.domain.model.Note
import manu.notes.featureNotes.domain.utils.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}