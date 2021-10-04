# ComposeCourseYT
I study Kotlin with Jetpack Compse by watching  Philipp Lackner's Jetpack Compose (https://youtube.com/playlist?list=PLQkwcJG4YTCSpJ2NLhDTHhi6XBNfk9WiC)

## Part4 - Creating an Image Card
![Untitled (1)](https://user-images.githubusercontent.com/52899340/135005754-bbded908-0c04-4fd6-ac30-924dd177aa27.png)

## Part 5 - Styling Text
![image](https://user-images.githubusercontent.com/52899340/135008281-2b9d3986-8b56-413a-a0ea-ccb783af26fd.png)
- When you want to apply font, you have to create font directory to __res -> New -> Android Resource Directory -> Resource type : font -> copy font's ttf file and paste them on directory__
- Font's file name has to be just small letter and - can't be used on name.
- Download font file from [Google Fonts](https://fonts.google.com/)

## Part 6 - State
- **State** - remember & mutableStateOf
![image](https://user-images.githubusercontent.com/52899340/135186612-36c8a650-5138-4d5f-9698-ce29f7eb9937.png)
If I click upper part of the screen, under part's background color is changed randomly.

## Part 7 - Textfields, Buttons, and Showing Snackbars
![image](https://user-images.githubusercontent.com/52899340/135391747-158783a7-9000-4f35-8666-5edbaf7228c5.png)
By using **Scaffold** and **Coroutine** , I can easily create snackbar which pops up after entering text in TextField and clicking Button.

## Part 8 - Lists
![image](https://user-images.githubusercontent.com/52899340/135551136-5debdd94-3412-423d-9433-82221549baf5.png)
In first way, I can use **"Column"**. If I want to scroll the list, I have to use modifier with **"verticalScroll"** and **"scrollState"** with **"for"** loop. <br>
In second way, I can use **"LazyColumn"** with **"items"** instead of loop statement. <br>
In third way, I can use **"itemsIndexed"** to show each string in list as item with **"listOf"** which has string contents .

## Part 9 - ConstraintLayout
![Untitled (1)](https://user-images.githubusercontent.com/52899340/135755204-6870a63f-0cfd-42bf-ae9f-9b21d1b8d3b2.png)


