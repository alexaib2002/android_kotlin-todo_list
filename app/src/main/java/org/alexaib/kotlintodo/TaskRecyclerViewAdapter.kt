package org.alexaib.kotlintodo

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView

import org.alexaib.kotlintodo.placeholder.PlaceholderContent.PlaceholderItem
import org.alexaib.kotlintodo.databinding.FragmentItemBinding
import org.alexaib.kotlintodo.model.TodoTask

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class TaskRecyclerViewAdapter(
    private val values: ArrayList<TodoTask>
) : RecyclerView.Adapter<TaskRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.taskContent.text = item.content
        holder.taskCompletionStatus.isChecked = item.completed
    }

    override fun getItemCount(): Int = values.size


    fun addItem(item: TodoTask) {
        values.add(item)
    }

    inner class ViewHolder(binding: FragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val taskContent: TextView = binding.taskContent
        val taskCompletionStatus: CheckBox = binding.taskCompletedCheckBox

        override fun toString(): String {
            return super.toString() + " '" + taskContent.text + "'"
        }
    }

}