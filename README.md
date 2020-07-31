# FinalProject
Android Mobile Application

REQUIREMENTS

The purpose of this mobile application is to provide users with a daily positive experience through various forms of media, such as news, music and images. This app is intended for people who want to start their day off in a happy mood, hence the app name Happyness (NOTE: not a typo). 

ARCHITECTURE

There are multiple user interfaces on this app that are responsible for the various actions of the user. The details are as follows:

* About UI

  The About UI provides the user with instructions on how to use the app. This is advisably the first place that users should go in order to understand what the purpose of the app is and how to use it. There is a drop down  menu on the page with the different UIs listed as options (Music, News, Quote and Feedback). Once the user selects one of them, a small description of the UI will be displayed. Any changes or improvements that need to be made should be made in the HelpPage.java class. 

* News UI
  
  The News UI provides the user with links to positive news websites or sections in news websites that only feature positive news. Any changes or improvements that need to be made should be made in the NewsPage.java class. 

* Quote UI
  
  The Quotes UI provides the user with a random positive quote (in the form of an image, an image of a quote) everyday in hopes of increasing positive feelings. There are two classes responsible for this UI. The Quotes library is where all the images are stored (so any new images will be added here). The QuotePage.java class is responsible for randomizing and displaying the image (any modifications to the output/functionality of the UI should be made here). 

* Feedback UI

  The Feedback Page allows the user to send the developers possible improvements or simply comments about the app. The user must enter their name, email address and the comments that they have. If they choose to send the feedback, they may press the send feedback button or if they wish to cancel feedback they may click the cancel button. Any changes or improvements that need to be made should be made in the FeedbackPage.java class. 

* Music UI
  
  The Music Page is where users can listen to a list of 5 recommended songs that have an upbeat, positive message. There are three classes responsible for this UI. The MusicPlayer.java class is the main class that has the list of songs that will be played. If you are to add a song to the list, this is where you would do it. The CustomMusicAdapter.java class is responsible for the functioning of the music player interface, It is responsible for the display of the title and artist, and the functioning of the play, pause and stop button. The Music.java class is responsible for the getter and setter methods (get song name, set song ne etc). If developers want to add a certain variable (ex: song duration), then the setter and getter methods of song duration would be added here.


CLASS DIAGRAM: The class diagram for the application is as follows: 

![image](https://user-images.githubusercontent.com/67130384/88986388-cc281280-d2a0-11ea-8dde-5257433ec568.png)

BUILD INSTRUCTIONS: Running the Application

This application was designed using android studio. The best way to run this app for optimal usage is to download the files onto the Android Studio Software as run it from there. Instructions are as follows

1. Download/Install Android Studio (https://developer.android.com/studio)
2. Open the AppProject file on Android Studio.
3. Next, there are two ways you can visualize your the application as a user
   
   A. Using an external device
   
   1. Plug in your device to your computer/laptop using an USB connector.
   2. Select the devices tab on the top bar of the screen
   ![image](https://user-images.githubusercontent.com/67130384/88987181-25914100-d2a3-11ea-86ff-70901bf6d5c1.png)
   
   3. When the device has been identified, click next
   ![image](https://user-images.githubusercontent.com/67130384/88987208-36da4d80-d2a3-11ea-9fcd-280620cd075e.png)
   
   4. It will then prompt you to turn on developer mode on your phone (follow the instructions noted as everyone might be different)
   ![image](https://user-images.githubusercontent.com/67130384/88987306-80c33380-d2a3-11ea-9ea1-9024db1ba1f0.png)
   
   5. After you have turned on developer mode, click next and finish on the device setup page
   ![image](https://user-images.githubusercontent.com/67130384/88987334-946e9a00-d2a3-11ea-8033-778c3541f373.png)
   
   6. After you have completed all that, slect your device on the top bar of the screen. Then click on the hammer icon to 
   compile the program. Finally, click the green triangle icon to run the application. IMPORTANT: Make sure you select the correct 
   device to compile to
   ![image](https://user-images.githubusercontent.com/67130384/88987488-1363d280-d2a4-11ea-8977-46ad4c9a1042.png)
   
   B. Using an android emulator
   
   1. Click on AVD Manager on the top right of the Android Studio window (as shown in the following image).
   ![image](https://user-images.githubusercontent.com/67130384/88986889-41e0ae00-d2a2-11ea-8cba-3650e0a81f7c.png)
   
   2. Then in the opened window, click on create Virtual Device.
   ![image](https://user-images.githubusercontent.com/67130384/88986962-6e94c580-d2a2-11ea-8105-664ac813f430.png)
   
   3. Choose one of the options provided for you and click next. (recommended that you pick a basic model) 
   ![image](https://user-images.githubusercontent.com/67130384/88987026-9b48dd00-d2a2-11ea-91f4-1b99eaf7132b.png)
   
   4. Finally, choose your API level, a name for your AVD and hit Finish
   ![image](https://user-images.githubusercontent.com/67130384/88987046-aef44380-d2a2-11ea-811f-908a533f88aa.png)
   ![image](https://user-images.githubusercontent.com/67130384/88987092-ce8b6c00-d2a2-11ea-988e-1b530ace368a.png)
   
   5. After you have completed all that, slect your device on the top bar of the screen. Then click on the hammer icon to 
   compile the program. Finally, click the green triangle icon to run the application. IMPORTANT: Make sure you select the correct 
   device to compile to
   ![image](https://user-images.githubusercontent.com/67130384/88987476-034bf300-d2a4-11ea-9b13-021189947c13.png)


Possible Improvements that could be made to the app

1. The user isn't able to play a new song without clicking the stop button on the old song first (user must click stop on current song before playing new one)
2. Allow the user to download the song onto their phone
3. Song list must be updated manually (possible ways to improve this/ make it automatic)
4. A way to get the news stories onto the app (i.e. not just the link to the pages)



