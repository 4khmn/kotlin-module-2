package com.example.kotlintasks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlintasks.ui.theme.KotlinTasksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinTasksTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Task3Screen()
                }
            }
        }
    }
}

@Composable
fun Hello(name: String?) {
    val displayText = if (name != null) {
        "Привет, $name!"
    } else {
        "Имя не задано"
    }

    Text(
        text = displayText,
        modifier = Modifier.padding(16.dp)
    )
}



@Preview(
    name = "1. Portrait",
    showSystemUi = true,
    device = "spec:width=411dp,height=891dp,orientation=portrait"
)
@Composable
fun HelloPreviewPortrait() {
    KotlinTasksTheme {
        Hello(name = "Денис")
    }
}

@Preview(
    name = "2. Landscape",
    showSystemUi = true,
    device = "spec:width=411dp,height=891dp,orientation=landscape"
)
@Composable
fun HelloPreviewLandscape() {
    KotlinTasksTheme {
        Hello(name = "Денис")
    }
}

@Preview(
    name = "3. Round",
    widthDp = 200,
    heightDp = 200
)
@Composable
fun HelloPreviewRound() {
    KotlinTasksTheme {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .background(Color.Yellow),
            contentAlignment = Alignment.Center
        ) {
            Hello(name = "Денис")
        }
    }
}


@Composable
fun Task3Screen() {
    Column(modifier = Modifier.padding(16.dp)) {

        // 1
        Text(
            text = stringResource(id = R.string.compose_description),
            color = Color.Green,
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // 2
        Text(
            text = stringResource(id = R.string.compose_description),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // 3
        Text(
            text = stringResource(id = R.string.compose_description),
            style = TextStyle(
                fontSize = 24.sp,
                color = Color.Black,
                textDecoration = TextDecoration.Underline,
                textIndent = TextIndent(firstLine = 48.sp)
            ),
            modifier = Modifier.background(Color.Green)
        )
    }
}
