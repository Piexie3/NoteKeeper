package com.example.noteapp.featureNotes.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.example.noteapp.featureNotes.data.dataSource.NoteDatabase
import manu.notes.featureNotes.data.repository.NoteRepositoryImpl
import com.example.noteapp.featureNotes.domain.repository.NoteRepository
import com.example.noteapp.featureNotes.domain.use_cases.AddNote
import com.example.noteapp.featureNotes.domain.use_cases.GetNote
import manu.notes.featureNotes.domain.use_cases.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NoteModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
                app,
                NoteDatabase::class.java,
                NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
                getNotes = GetNotes(repository),
                deleteNote = DeleteNote(repository),
                addNote = AddNote(repository),
                getNote = GetNote(repository)
        )
    }
}