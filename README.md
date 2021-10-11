# ComposeCourseYT
I study Kotlin with Jetpack Compse by watching  Philipp Lackner's Jetpack Compose (https://youtube.com/playlist?list=PLQkwcJG4YTCSpJ2NLhDTHhi6XBNfk9WiC)
<br>

## Part4 - Creating an Image Card
![Untitled (1)](https://user-images.githubusercontent.com/52899340/135005754-bbded908-0c04-4fd6-ac30-924dd177aa27.png)
<br>

## Part 5 - Styling Text
![image](https://user-images.githubusercontent.com/52899340/135008281-2b9d3986-8b56-413a-a0ea-ccb783af26fd.png)
- When you want to apply font, you have to create font directory to __res -> New -> Android Resource Directory -> Resource type : font -> copy font's ttf file and paste them on directory__
- Font's file name has to be just small letter and - can't be used on name.
- Download font file from [Google Fonts](https://fonts.google.com/)
<br>

## Part 6 - State
- **State** - remember & mutableStateOf
![image](https://user-images.githubusercontent.com/52899340/135186612-36c8a650-5138-4d5f-9698-ce29f7eb9937.png)
If I click upper part of the screen, under part's background color is changed randomly.
<br>

## Part 7 - Textfields, Buttons, and Showing Snackbars
![image](https://user-images.githubusercontent.com/52899340/135391747-158783a7-9000-4f35-8666-5edbaf7228c5.png)
By using **Scaffold** and **Coroutine** , I can easily create snackbar which pops up after entering text in TextField and clicking Button.
<br>

## Part 8 - Lists
![image](https://user-images.githubusercontent.com/52899340/135551136-5debdd94-3412-423d-9433-82221549baf5.png)
In first way, I can use **"Column"**. If I want to scroll the list, I have to use modifier with **"verticalScroll"** and **"scrollState"** with **"for"** loop. <br>
In second way, I can use **"LazyColumn"** with **"items"** instead of loop statement. <br>
In third way, I can use **"itemsIndexed"** to show each string in list as item with **"listOf"** which has string contents.
<br>

## Part 9 - ConstraintLayout
![Untitled (1)](https://user-images.githubusercontent.com/52899340/135755204-6870a63f-0cfd-42bf-ae9f-9b21d1b8d3b2.png)
I have to use **linkTo** which express the relationship with another component for put the components with using constrain.
<br>

## Part 10 - Side Effects & Effect Handlers
![image](https://user-images.githubusercontent.com/52899340/136043667-986b4aff-52c7-42d8-9455-196a85b4ebbb.png)
<br>

## Part 11 - Simple Animations
![image](https://user-images.githubusercontent.com/52899340/136043699-0f6504f1-b83d-4a9f-ae65-ce097b47602c.png)
I could give animation to the box by using **animateDpAsState** with using **tween**, **spring**, and **keyframes**.  
+) Blog post : https://velog.io/@kiyoog02/Jetpack-Compose%EC%99%80-Animation
<br>

## Animated Circular Progress Bar
![Untitled](https://user-images.githubusercontent.com/52899340/136124713-7fdbaa42-5c93-4c09-b11d-a3299b484aac.png)
<br>

## Navigation
![image](https://user-images.githubusercontent.com/52899340/136579638-6a5d7d4e-4f4d-4c4f-a8f0-d925061db400.png)
I made Kotlin File as Navigation which has Navigation, MainScreen, and DetailScreen composable function to show each UI.
Also, I made Sealed Class as Screen which has main and detail screen in the form of object.

## BottomNavigation with Badges
![image](https://user-images.githubusercontent.com/52899340/136818759-610bfae7-eebc-4811-8e66-f9aa417a6075.png)
By using Scaffold, I made bottomBar to put BottomNavigation with its items which are "Home", "Chat", "Settings".
When I chlick the badges(items), I can go each screen.

