package com.example.kotlintasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlintasks.ui.theme.KotlinTasksTheme

@Composable
fun ContactCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "Имя: Евгений")
        Text(text = "Отчество: Андреевич")
        Text(text = "Фамилия: Лукашин")
        Text(text = "Мобильный телефон: +7 495 495 95 95")
        Text(text = "Адрес: г. Москва, 3-я улица Строителей, д. 25, кв. 12")
    }
}

@Composable
fun ContactListScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Имя: Евгений")
            Text(text = "Отчество: Андреевич")
            Text(text = "Фамилия: Лукашин")
            Text(text = "Мобильный телефон: +7 495 495 95 95")
            Text(text = "Адрес: г. Москва, 3-я улица Строителей, д. 25, кв. 12")
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Имя: Василий")
            Text(text = "Отчество: Егорович")
            Text(text = "Фамилия: Кузякин")
            Text(text = "Мобильный телефон: ---")
            Text(text = "Адрес: Ивановская область, дер. Крутово, д. 4")
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Имя: Людмила")
            Text(text = "Отчество: Прокофьевна")
            Text(text = "Фамилия: Калугина")
            Text(text = "Мобильный телефон: +7 495 788 78 78")
            Text(text = "Адрес: Москва, Большая Никитская, д. 43, кв. 290")
        }
    }
}
@Composable
fun ContactRowScreen() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Имя: Евгений")
            Text(text = "Отчество: Андреевич")
            Text(text = "Фамилия: Лукашин")
            Text(text = "Мобильный телефон: +7 495 495 95 95")
            Text(text = "Адрес: г. Москва, 3-я улица Строителей, д. 25, кв. 12")
        }

        Image(
            painter = painterResource(id = android.R.drawable.star_on),
            contentDescription = "Избранное",
            modifier = Modifier.size(32.dp)
        )
    }
}

@Preview(showSystemUi = true, name = "ContactColumnPreview")
@Composable
fun Task7ColumnPreview() {
    KotlinTasksTheme {
        ContactCard()
    }
}

@Preview(showSystemUi = true, name = "ListPreview")
@Composable
fun Task7ListPreview() {
    KotlinTasksTheme {
        ContactListScreen()
    }
}

@Preview(showSystemUi = true, name = "ContactRowPreview")
@Composable
fun Task7RowPreview() {
    KotlinTasksTheme {
        ContactRowScreen()
    }
}