package com.example.composecourseyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecourseyt.ui.theme.ComposeCourseYTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContent {
////            Greeting(name = "Kang")
//
////            Column {
////                Text("Hello")
////                Text("World")
////            } -> 위에서 아래로 쌓기
//
////            Row {
////                Text("Hello")
////                Text("World")
////            } -> 왼쪽에서 오른쪽으로 쌓기
//
////            Column(modifier = Modifier
////                .fillMaxSize() //꽉 채우기
////                .background(Color.Green), //배경 넣기
////                horizontalAlignment = Alignment.CenterHorizontally,
////                verticalArrangement = Arrangement.Bottom // 맨 아래로 내리기 (SpaceBetween : 맨 위, 아래에 붙고 나머지 여백 / SpaceEvenly : 맨 위, 아래 공간 떼고 여백 / SpaceAround : 같은 크기의 공간으로 나눠줌.)
////            ) {
////                Text("Hello")
////                Text("World")
////            }
//
//            Row(modifier = Modifier
////                .fillMaxSize(0.5f)
//                .width(300.dp)
////                .height(300.dp)
//                .fillMaxHeight(0.7f)
//                .background(Color.Green), //배경 넣기
//                horizontalArrangement = Arrangement.SpaceAround, // Row와 Column에 다라서 arrangment와 alignment가 반대임.
//                verticalAlignment = Alignment.CenterVertically // 맨 아래로 내리기 (SpaceBetween : 맨 위, 아래에 붙고 나머지 여백 / SpaceEvenly : 맨 위, 아래 공간 떼고 여백 / SpaceAround : 같은 크기의 공간으로 나눠줌.)
//            ) {
//                Text("Hello")
//                Text("Android")
//                Text("World")
//            } -> 1차시 & 2차시

        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
//                    .width(300.dp)
                    .fillMaxWidth()
//                    .padding(16.dp) // 여백 생성 / top = 50.dp라고 넣어주면 위에만 여백이 생기도록 설정 가능
                    .border(5.dp, Color.Magenta) // padding을 그냥 둔 상태로 실행하면 border도 50 아래부터 생성됨.
                    .padding(5.dp)
                    .border(5.dp, Color.Blue)
                    .padding(5.dp)
                    .border(10.dp, Color.Red)
                    .padding(10.dp) //padding과 border가 순차적으로 적용된다.
//                    .requiredWidth(300.dp)
            ) {
                Text("Hello", modifier = Modifier.clickable{

                } //Hello글씨 클릭효과를 제공.
//                   .offset(50.dp, 20.dp)) // 왼쪽 상단 모서리부터 이동시킨다고 생각 ex) 오른쪽 50, 하단 20 / 50을 0으로 바꾸면 왼쪽으로 다시 붙어서 글자가 겹쳐짐.

//                    .border(5.dp, Color.Yellow)
//                    .padding(5.dp)
//                    .offset(20.dp, 20.dp)
//                    .border(10.dp, Color.Black)
//                    .padding(10.dp)// 노란테두리 검은테두리 탄생.
                )
                Spacer(modifier = Modifier.height(50.dp)) // 50dp만큼 아래로 내려감.
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