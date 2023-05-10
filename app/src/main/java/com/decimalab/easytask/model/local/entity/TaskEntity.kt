package com.decimalab.easytask.model.local.entity

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity(tableName = "task_entity")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,

    @ColumnInfo(name = "userId")
    val userId: Int, // 1

    @ColumnInfo(name = "taskId")
    val taskId: Int,

    @ColumnInfo(name = "title")
    val title: String, // Task 1

    @ColumnInfo(name = "body")
    val body: String, // Body 1

    @ColumnInfo(name = "status")
    val status: String, // PENDING

    @ColumnInfo(name = "createdAt")
    val createdAt: String,

    @ColumnInfo(name = "updatedAt")
    val updatedAt: String,

    @ColumnInfo(name = "bg_color")
    var bg_color: Int = 0

) {

    /*
    later
     */
    companion object {

        @JvmStatic
        @BindingAdapter("viewBackground")
        fun TextView.setBgColor(color: Int?) {
            if (color != null) {
                this.setBackgroundResource(color)
            }
        }
    }

}
