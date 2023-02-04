package manu.notes.featureNotes.data.repository

import kotlinx.coroutines.flow.Flow
import com.example.noteapp.featureNotes.data.dataSource.NoteDao
import com.example.noteapp.featureNotes.domain.model.Note
import com.example.noteapp.featureNotes.domain.repository.NoteRepository


class NoteRepositoryImpl(
        private val dao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}