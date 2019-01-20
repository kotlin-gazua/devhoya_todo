package com.haganzi.todo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.time.Instant

@RestController
class TodoController {

    @GetMapping("/todo")
    fun selectTodo():Todo {
       val todo = Todo (
                id = "dev1",
               content = "kotlin study",
               priority = 1,
               created = Instant.now()
       )

        return todo
    }

    @PostMapping("/todo")
    fun createTodo(@RequestBody newTodo: NewTodo): Todo {
        val todo = Todo(
                id = newTodo.id,
                content = newTodo.content,
                priority = newTodo.priority,
                created = Instant.now()
        )

        return todo
    }
}