1. Basic Information
________________________________________
Music Playlist Manager
•	Lonwabo Dakalo Nicholas Ramaliwa
•	ST10470338
•	1
•	IIE Higher Certificate in Mobile Application and Web Development
•	IMAD5112
•	Practicum

Link
•	GitHub Repository: VCSTDN2024/imad5112-practicum-2025-LonwaboDakalo-Ramaliwa: imad5112-practicum-2025-LonwaboDakalo-Ramaliwa created by GitHub Classroom 
________________________________________

Table of Figures

Figure 1: Home Screen 1	8
Figure 2: Home Screen 2	8
Figure 3: Home Screen 3	9
Figure 4: Secondary Screen 1	9
Figure 5: Secondary Screen 2	10
Figure 6: Manager 1	10
Figure 7: Manager 2	11
Figure 8: Empty	12
Figure 9: Input	13
Figure 10: Input in Array	14
Figure 11: Array Data Cleared	15
Figure 12: Blank Playlist	16
Figure 13: Data being displayed from second page	17

 
Purpose
This app is designed to allow users to enter song names, the artist of the song, a rating of the song and personal comment regarding the song. This input will then be added to a playlist and will list all the information together according to its number in the index.
Users will be able to view their input and clear all of it, in the event they want to restart and add different songs or remove their input of the app.
 
Features of the App
Background
The App has two screens available one is the home screen, where the user can enter input about a song, artist, rating and their own personal comment. The second screen is the playlist screen where the user will be able to view the information they have inserted in the home screen. The home screen is primarily for input and the playlist screen is primarily for output, such as displaying input previously inserted the first screen.
The app opens on the main screen since it needs input to be inserted to display your input on the second screen 

Feature 1: The ratings values and range are already displayed to users and all the users must do is pick a button within the range from 1 to 5.
Feature 2: The playlist display uses a List View, this makes it easier to display all the input together and according to their index number.
Feature 3: The app uses the toast function to provide users with guidance in the event they struggle to use the app due to confusion through instructions or incorrect data inserted.
Feature 4: The app has Error Handling functions to help give more clear instructions to users if incorrect action is committed and helps prevent the chances of the app crashing due to actions it was not programmed to complete.
Feature 5: The app can display the average rating for your playlist 
Feature 6: The second screen can display how many songs are in the playlist
 

Examples of Error handling
•	On the Playlist Screen when the user presses on the “Go to Home Page” button it will take the user back to the main screen and display a toast that will inform the user that they can only clear the playlist on the second screen by clicking on the clear button on the main screen. This message is also displayed when you press the “View Playlist” button on the home screen. This toast is here to display the only way to clear your input in the app besides exiting the app.

•	Not leave empty. This function is here to ensure that users do not leave any input empty / blank because all input needs to be entered for the playlist to functionally work. This will force users to enter all input before they can press the “Add to Playlist” button.

•	1>= .. =<5. This is here in the event the user manages to find a way to insert another number above 5 and less than 0 this will stop the app from accepting that value and will display an appropriate message to the user.

•	Max entries. The user is only allowed a max of 4 slots in the playlist before the app displays a message informing the user. 

 
Screenshots
Planning
 
This was the planning of my app and the direction I wanted for my app. The only difference in the planning and my app is that I have buttons for each rating instead of requiring the user to input data for ratings also.
Source Code
Main Screen
The main screen is where the user will input data into the app where all input will be sent into an array and that array will be sent to the second screen so the information can be displayed for the user to see all their input organised and together according to their index number
 ![Home Screen1](https://github.com/user-attachments/assets/63fd4206-4750-4be3-bb3f-8077e4c836ba)

Figure 1: Home Screen 1
 ![Home Screen 2](https://github.com/user-attachments/assets/8be6d65d-16f4-4ce3-be10-8f9fa46b9308)
Figure 2: Home Screen 2
 ![Home Screen 3](https://github.com/user-attachments/assets/5aa0cc69-1a6e-4850-a502-71380e159396)

Figure 3: Home Screen 3
Second Screen
This is the playlist screen it is designed to display all the input that was inserted into the main screen. All equations were sent into a new kt file just to simplify the process and help maintain order
 ![Playlist 1](https://github.com/user-attachments/assets/31728341-d174-4cb1-8155-3db7ffa48a03)

Figure 4: Secondary Screen 1
 ![Playlist 2](https://github.com/user-attachments/assets/c69b6ddf-af55-4313-a2ae-0c466e2c6d9a)

Figure 5: Secondary Screen 2
KT Class File
The Kt file is here to do the calculations and simply the actions needed to get the app to function properly. All calculations are in this file and other functions are still in their original kt files so it is easier to manage and keep track of errors since all  Booleans are in the original kt and all formulas / equations are in this kt file.
 ![Manager 1](https://github.com/user-attachments/assets/141331c8-c62a-42f5-906b-aa75d0c90b90)

Figure 6: Manager 1
 ![Manager 2](https://github.com/user-attachments/assets/1ea12747-2d00-4929-bbe5-700cf4bfa356)

Figure 7: Manager 2

App Screenshots (Emulator)
Main Screen 
The following screenshots will show the following:
![Empty](https://github.com/user-attachments/assets/0a3a5777-2ae4-438a-915e-fa98ebd9a23e)

Figure 8: The is not empty function and its toast (Error handling)
![All input inserted](https://github.com/user-attachments/assets/eb3964ff-38a6-4e86-ae47-f7bca28c13b8)

Figure 9: Input being entered into app
![Added into Array](https://github.com/user-attachments/assets/47702fbd-befd-46ef-bc29-814c6adc621c)

Figure 10: Input being transferred into Array
![Clear Button](https://github.com/user-attachments/assets/3e21a335-7d47-4ff4-b048-fa9f73284a96)

Figure 11: Data in Array being Cleared

 
Second Screen
The following screenshots for the second page include the following:
Figure 12: A blank second screen, no input has been inserted yet and a toast providing users with app directions
Figure 13: An index being displayed, including the display of total songs in the array and the average rating.
 ![Blank Playlist](https://github.com/user-attachments/assets/ee57070e-8e0e-4aef-9e7f-996eb0531cb3)

Figure 12: Blank Playlist
 ![Playlist Table after input](https://github.com/user-attachments/assets/6ca2c7e9-e554-47fe-9173-4eba95249147)

Figure 13: Data being displayed from second page
 

References
________________________________________
________________________________________
Code Snippet
•	Sookha, J., 2025. IMAD Trial Exam. [19 June 2025].
•	Sookha, J., 2025. Inventory Manager [Accessed 19 June 2025].
YouTube
•	Zahra bulbulia, 2024. GitHub Android Studio. Available at: [Accessed 19 June 2025].
