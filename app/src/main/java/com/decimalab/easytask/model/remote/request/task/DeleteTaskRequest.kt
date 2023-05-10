package com.decimalab.easytask.model.remote.request.task

import com.google.gson.annotations.SerializedName

data class DeleteTaskRequest(
    @SerializedName("id")
    val id: String,
    @SerializedName("user_id")
    val user_id: String
) {
}
