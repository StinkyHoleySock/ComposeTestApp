package com.dmitry.composetestapp.repository

import com.dmitry.composetestapp.model.users.User

class UsersRepository {
    fun getAllData(): List<User> {
        return listOf(
            User(
                fullName = "Иванов Иван Иванович",
                position = "Программист" ,
                workHoursInMonth = 12,
                workedOutHours = 20
            ),
            User(
                fullName = "Петров Пётр Петрович",
                position = "Наладчик" ,
                workHoursInMonth = 1,
                workedOutHours = 2
            ),
            User(
                fullName = "Сидоров Сидор Сидорович",
                position = "Фармацевт" ,
                workHoursInMonth = 100,
                workedOutHours = 22
            ),
            User(
                fullName = "Пирогов Андрей Викторович",
                position = "Тимлид" ,
                workHoursInMonth = 300,
                workedOutHours = 200
            ),
            User(
                fullName = "Константинопольский Константин Константинович",
                position = "Фрезеровщик" ,
                workHoursInMonth = 45,
                workedOutHours = 2
            ),
            User(
                fullName = "Иванов Иван Иванович",
                position = "Программист" ,
                workHoursInMonth = 12,
                workedOutHours = 20
            ),
            User(
                fullName = "Петров Пётр Петрович",
                position = "Наладчик" ,
                workHoursInMonth = 1,
                workedOutHours = 2
            ),
            User(
                fullName = "Сидоров Сидор Сидорович",
                position = "Фармацевт" ,
                workHoursInMonth = 100,
                workedOutHours = 22
            ),
            User(
                fullName = "Пирогов Андрей Викторович",
                position = "Тимлид" ,
                workHoursInMonth = 300,
                workedOutHours = 200
            ),
            User(
                fullName = "Константинопольский Константин Константинович",
                position = "Фрезеровщик" ,
                workHoursInMonth = 45,
                workedOutHours = 2
            )
        )
    }
}