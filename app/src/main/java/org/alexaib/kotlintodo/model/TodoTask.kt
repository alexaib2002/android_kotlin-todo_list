package org.alexaib.kotlintodo.model

data class TodoTask(
    val id: Int,
    val content: String,
    val completed: Boolean
)
