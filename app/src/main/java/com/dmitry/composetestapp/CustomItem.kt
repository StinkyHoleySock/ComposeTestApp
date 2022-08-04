package com.dmitry.composetestapp

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dmitry.composetestapp.model.users.User

@Composable
fun CustomItem(user: User) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        Text(
            text = user.fullName,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = user.position,
            color = Color.Black,
        )
        Text(
            text = user.workHoursInMonth.toString(),
            color = Color.Black,
        )
        Text(
            text = user.workedOutHours.toString(),
            color = Color.Black,
        )

    }
}


@Composable
@Preview
fun CustomItemPreview() {
    CustomItem(
        user = User(
            fullName = "Иванов Иван Иванович",
            position = "Программист" ,
            workHoursInMonth = 12,
            workedOutHours = 20
        )
    )
}
