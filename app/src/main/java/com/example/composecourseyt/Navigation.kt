package com.example.composecourseyt

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.*
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) { //화면을 MainScreen에서 시작
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController = navController) //MainScreen을 대체하여 보여질 것
        }
        composable(
            route = Screen.DetailScreen.route + "/{name}", // inyoeng이라는 name을 navigation으로 argument로서 DetailScreen에 전달, multiple argument를 원하면 슬래시와 함께 추가. ?name={name} 형식으로 optinal argument로 표현할 수도 있음.
            arguments = listOf(
                navArgument("name"){
                    type = NavType.StringType
                    defaultValue = "inyeong"
                    nullable = true
    }
        )
        ){ entry ->
            DetailScreen(name = entry.arguments?.getString("name"))
        }
    }
}


@Composable
fun MainScreen(navController: NavController) { //버튼과 상세 스크린을 포함하는 NavController를 인스턴스로 가져야함
    var text by remember {
        mutableStateOf("") //빈 String으로 시작. getValue와 setValue를 import 설정
    }
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp)
    ) {
        TextField(value = text,
            onValueChange = {
            text = it //값이 바뀌면 test를 새로운 String으로 업데이트
        },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {
                         navController.navigate(Screen.DetailScreen.withArgs(text))
                         }, // onClick 함수가 작동하면 DetailScreen으로 navigae함
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "To DetailScreen")

        }

    }

}

@Composable
fun DetailScreen(name: String?) { //DetailScreen은 name이 nullable되도록 하는 argument를 가짐
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = "Hello, $name")
    }

}