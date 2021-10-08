package com.example.composecourseyt

sealed class Screen(val route: String){
    object MainScreen : Screen("main_screen")
    object DetailScreen : Screen("detail_screen")

    fun withArgs(vararg args: String): String{ //String으로 받아서 resulting route의 String으로 리턴
        return buildString {
            append(route) //현재 screen의 route를 append
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}


