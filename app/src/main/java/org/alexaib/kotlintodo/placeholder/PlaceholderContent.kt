package org.alexaib.kotlintodo.placeholder

import org.alexaib.kotlintodo.model.TodoTask
import java.util.HashMap
import java.util.Random
import kotlin.collections.ArrayList

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    val ITEMS: ArrayList<TodoTask> = ArrayList()

    /**
     * A map of sample (placeholder) items, by ID.
     */
    val ITEM_MAP: MutableMap<Int, TodoTask> = HashMap()

    private val COUNT = 15

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createPlaceholderItem(i))
        }
    }

    private fun addItem(item: TodoTask) {
        ITEMS.add(item)
        ITEM_MAP[item.id] = item
    }

    private fun createPlaceholderItem(position: Int): TodoTask {
        return TodoTask(position, "Item " + position, generateCompletionStatus())
    }

    private fun generateCompletionStatus(): Boolean = Random().nextBoolean()

    /**
     * A placeholder item representing a piece of content.
     */
    data class PlaceholderItem(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }
}