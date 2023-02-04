package com.example.noteapp.featureNotes.presentation.notes

import com.example.noteapp.featureNotes.domain.model.Note
import manu.notes.featureNotes.domain.utils.NoteOrder
import manu.notes.featureNotes.domain.utils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)