package org.alexaib.kotlintodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import org.alexaib.kotlintodo.model.TodoTask
import org.alexaib.kotlintodo.placeholder.PlaceholderContent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todoTaskList: RecyclerView = findViewById(R.id.todo_task_list)
//        val doneTaskList: RecyclerView = findViewById(R.id.done_task_list)
        val recyclerView = TaskRecyclerViewAdapter(PlaceholderContent.ITEMS)
        todoTaskList.adapter = recyclerView
        recyclerView.addItem(TodoTask(1, "asdf", true))

//        doneTaskList.adapter = TaskRecyclerViewAdapter(PlaceholderContent.ITEMS)
    }
}