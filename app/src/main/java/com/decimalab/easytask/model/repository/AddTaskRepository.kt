package com.decimalab.easytask.model.repository

import com.decimalab.easytask.model.remote.NetworkService
import com.decimalab.easytask.model.remote.request.task.AddTaskRequest


class AddTaskRepository(private val networkService: NetworkService) {

    suspend fun addTask(token: String, addTaskRequest: AddTaskRequest) =
        networkService.addTask(token, addTaskRequest)
}
