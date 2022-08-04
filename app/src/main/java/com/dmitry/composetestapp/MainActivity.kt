package com.dmitry.composetestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dmitry.composetestapp.repository.UsersRepository
import com.dmitry.composetestapp.ui.theme.ComposeTestAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeTestAppTheme {
                val usersRepository = UsersRepository()
                val getAllData = usersRepository.getAllData()

                LazyColumn(){
                    items(items = getAllData){ user ->
                        CustomItem(user = user)
                    }
                }
            }
        }


    }
}

@Preview
@Composable
fun DiceRollerApp() {
    DiceWithButtonAndImage(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}

@Preview(showBackground = true)
@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
    var result by remember {
        mutableStateOf(1)
    }
    val imageResource = when(result) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    Column (
       modifier = modifier,
       horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(painter = painterResource(id = imageResource),
            contentDescription = result.toString()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { result = (1..6).random() }) {
            Text(stringResource(id = R.string.roll))
        }
    }
}

@Preview
@Composable
fun TestApp(){
    TestView(text = "hello", modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.BottomCenter))
}

@Composable
fun TestView(text: String, modifier: Modifier = Modifier){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = text)
        Text(text = text)
        Text(text = text)
        Text(text = text)
    }
}

@Composable
fun PlaneText(text: String) {
    Text(text = text)
}

@Composable
fun AutoCompleteText(text: String, suggestions: List<String>) {

}

@Composable
fun ButtonRequest(text: String, formAction: String) {
    Button(onClick = { /*TODO*/ }) {
        Text(text = text)
    }
}

@Composable
fun MainColumn() {
    PlaneText(text = "Текст из ливдаты")
    AutoCompleteText(text = "caption", suggestions = listOf("suggestions1", "suggestions2", "suggestions3"))
    ButtonRequest(text = "caption", formAction = "endPoint")
}

