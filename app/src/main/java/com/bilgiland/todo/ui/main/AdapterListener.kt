package com.bilgiland.todo.ui.main

import com.bilgiland.todo.data.model.TodoModel

/**
 * listener for dialog
 */
interface AdapterListener{

    /**
     * job deleted
     */
    fun onDeleteClicked(todoModel: TodoModel)

    /**
     * job done
     */
    fun onDoneClicked(todoModel: Int, done: Int)
}