package com.example.noteapp.featureNotes.presentation.add_edit_note.composables

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)