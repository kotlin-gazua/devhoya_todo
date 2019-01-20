package com.haganzi.todo

import com.fasterxml.jackson.annotation.JsonCreator
import java.time.Instant

data class Todo(
        val id: String,
        val content: String,
        val priority: Int,
        val created: Instant
)

data class NewTodo @JsonCreator constructor(
        val id: String,
        val content: String,
        val priority: Int
)
