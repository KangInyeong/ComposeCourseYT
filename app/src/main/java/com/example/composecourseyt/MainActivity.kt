package com.example.composecourseyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecourseyt.ui.theme.ComposeCourseYTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Greeting(name = "Kang")

//            Column {
//                Text("Hello")
//                Text("World")
//            } -> 위에서 아래로 쌓기

//            Row {
//                Text("Hello")
//                Text("World")
//            } -> 왼쪽에서 오른쪽으로 쌓기

//            Column(modifier = Modifier
//                .fillMaxSize() //꽉 채우기
//                .background(Color.Green), //배경 넣기
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Bottom // 맨 아래로 내리기 (SpaceBetween : 맨 위, 아래에 붙고 나머지 여백 / SpaceEvenly : 맨 위, 아래 공간 떼고 여백 / SpaceAround : 같은 크기의 공간으로 나눠줌.)
//            ) {
//                Text("Hello")
//                Text("World")
//            }

            Row(modifier = Modifier
//                .fillMaxSize(0.5f)
                .width(300.dp)
//                .height(300.dp)
                .fillMaxHeight(0.7f)
                .background(Color.Green), //배경 넣기
                horizontalArrangement = Arrangement.SpaceAround, // Row와 Column에 다라서 arrangment와 alignment가 반대임.
                verticalAlignment = Alignment.CenterVertically // 맨 아래로 내리기 (SpaceBetween : 맨 위, 아래에 붙고 나머지 여백 / SpaceEvenly : 맨 위, 아래 공간 떼고 여백 / SpaceAround : 같은 크기의 공간으로 나눠줌.)
            ) {
                Text("Hello")
                Text("Android")
                Text("World")
            }

        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeCourseYTTheme {
        Greeting("Kang")
    }
}