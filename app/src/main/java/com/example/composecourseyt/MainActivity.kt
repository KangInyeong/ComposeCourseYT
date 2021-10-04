package com.example.composecourseyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import com.example.composecourseyt.ui.theme.ComposeCourseYTTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //10차시 - Side Effect와 Effect Handlers

        setContent {
            val scaffoldState = rememberScaffoldState()
            val scope = rememberCoroutineScope()

            Scaffold(scaffoldState = scaffoldState) {
//                var counter by remember {
//                    mutableStateOf(0)
//                }
                var counter = produceState(initialValue = 0) {
                    delay(3000L) // 3초가 지나면
                    value = 4 // 값이 4로 바뀜.
                }
                if(counter.value % 5 == 0 && counter.value > 0){
//                    scope.launch {
//                        scaffoldState.snackbarHostState.showSnackbar("Hello") //showSnackbar를 위해서 코루틴 사용해야 함. -> scope 만들고 넣어줌.
//                    }

                    LaunchedEffect(key1 = scaffoldState.snackbarHostState){
                        scaffoldState.snackbarHostState.showSnackbar("Hello") //5로 나누어떨어지는 경우에만 스낵바 보임. 나머지에서는 사라져.
                    }
                }

//                Button(onClick = {counter++}) {
//                    Text("Click me: $counter")
//                }
                Button(onClick = {}) {
                    Text("Click me: ${counter.value}")
                }

            }
        }
    }
}

//var i = 0
//
//@Composable
//fun MyComposable(backPressedDispatcher: OnBackPressedDispatcher) {
////    SideEffect {
////        i++
////    }
//
//    val callback = remember {
//        object : OnBackPressedCallback(true){
//            override fun handleOnBackPressed() {
//                // Do something
//            }
//        }
//    }
//
//    DisposableEffect(key1 = backPressedDispatcher){
//        backPressedDispatcher.addCallback(callback)
//        onDispose {
//            callback.remove()
//        }
//    }
//
//    Button(onClick = { }){
//        Text(text = "Click me")
//    }
//}
