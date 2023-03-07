package com.example.noteapp.featureNotes.presentation.add_edit_note

import androidx.compose.ui.focus.FocusState
import com.example.noteapp.featureNotes.presentation.add_edit_note.AddEditNoteEvent

sealed class AddEditNote{
    data class EnteredTitle(val value: String): AddEditNoteEvent()
    data class ChangeTitleFocus(val focusState: FocusState): AddEditNoteEvent()
    data class EnteredContent(val value: String): AddEditNoteEvent()
    data class ChangeContentFocus(val focusState: FocusState): AddEditNoteEvent()
    data class ChangeColor(val color: Int): AddEditNoteEvent()
    object SaveNote: AddEditNoteEvent()
}
