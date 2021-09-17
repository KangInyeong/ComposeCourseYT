package com.example.composecourseyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecourseyt.ui.theme.ComposeCourseYTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //4차시
        setContent {
            val painter = painterResource(id = R.drawable.disney)
            val description = "This is the disney castle"
            val title = "Disney is the real"

            Box(modifier = Modifier
                .fillMaxWidth(0.5f) // 카드의 크기가 화면 절반만 채우기
                .padding(16.dp)
            ) {
                ImageCard(
                    painter = painter,
                    contentDescription = description,
                    title = title
                )
            }
        }
    }
}

@Composable
fun ImageCard(
    painter : Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier= Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp), //둥근 모서리
        elevation = 5.dp // 그림자 만들기
    ) {
        // 이미지 용도 박스
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter, contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )

            Box(modifier = Modifier
                .fillMaxSize(0.5f)) {
                    Brush.verticalGradient( //위아래로 변하는 그라데이션
                    colors = listOf(
                        Color.Transparent,
                        Color.Black
                    //아래는 어둡고 위는 투명하게 설정
                    ),
                    startY =  300f
                )
            }
            // 이미지 위에 텍스트를 가지는 용도 박스
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart //텍스트를 맨 아래에
            ) {
                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }

        }
    }
}
