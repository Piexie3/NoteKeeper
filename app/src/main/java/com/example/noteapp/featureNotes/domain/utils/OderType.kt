package manu.notes.featureNotes.domain.utils

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}