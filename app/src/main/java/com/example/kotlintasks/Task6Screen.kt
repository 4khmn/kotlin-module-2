package com.example.kotlintasks


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlintasks.ui.theme.KotlinTasksTheme

@Composable
fun Task6Part1() {
    Box(
        modifier = Modifier
            .size(width = 240.dp, height = 120.dp)
            .background(Color.Black),
        contentAlignment = Alignment.TopEnd
    ) {
        Image(
            painter = painterResource(id = R.drawable.circle),
            contentDescription = "Оранжевый круг",
            contentScale = ContentScale.None
        )
    }
}

@Composable
fun Task6Part2() {
    Box(
        modifier = Modifier
            .size(width = 240.dp, height = 120.dp)
            .background(Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.circle),
            contentDescription = "Фиолетовый круг",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds,
            colorFilter = ColorFilter.tint(Color(0xFF8A2BE2))
        )
    }
}


@Preview(showSystemUi = true, name = "Task6Part1 Preview")
@Composable
fun Task6Part1Preview() {
    KotlinTasksTheme {
        Task6Part1()
    }
}

@Preview(showSystemUi = true, name = "Task6 Preview")
@Composable
fun Task6Part2Preview() {
    KotlinTasksTheme {
        Task6Part2()
    }
}