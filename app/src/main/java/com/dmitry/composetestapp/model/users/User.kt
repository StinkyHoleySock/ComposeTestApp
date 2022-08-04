package com.dmitry.composetestapp.model.users

data class User(
    val fullName: String,
    val position: String,
    val workHoursInMonth: Int,
    val workedOutHours: Int
)