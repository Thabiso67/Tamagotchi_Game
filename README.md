Tamagotchi Game

Inspired by the well-known kid’s video game Tamagotchi, I have created a video game which almost replicates the kids themed video game. Tamagotchi is a game where a player is tasked with taking care of a randomly generated character until it grows into an adult. It was first released in the year 1996 in Japan, then in the United States in the year 1997. The device was shaped like a small egg which made it easy for children or adults to carry around. This game that I have is supposed to serve a similar purpose. Unfortunately, there were some issues that I had faced while making the app. In this report I will be detailing and breaking down the work that was done and what issues were faced in the production of this game.

In this game the user has a virtual pet dog to take care of. When opening the game, the user will first be greeted with a welcome screen with the picture of the dog and button prompting the player to start the game. The objective is to take care of the dog making sure that it is clean, it well fed and play with it. When pressing a certain button, a picture will display that will match with the certain action icon. Below is a screenshot which shows what will display when the player presses the ‘Feed’ button and the ‘Welcome page’.

![Screenshot 2024-05-05 113530](https://github.com/Thabiso67/Tamagotchi_Game/assets/160724052/73fe5193-8a02-4736-bd14-38cb764444c0)



![Screenshot 2024-05-05 113356](https://github.com/Thabiso67/Tamagotchi_Game/assets/160724052/ffc51a15-5cb2-4dd3-ad83-1ed8b092ea75)








One of the first issues that I faced was getting the pictures to have live animation. For the welcome page, I had drawn a simple picture of the dog wagging its tail using an app call ‘FlipaClip’. However, the game would either not run or the animation would not show at all. Below is a screenshot of what the animation of the dog looks like:


![20240501_132346](https://github.com/Thabiso67/Tamagotchi_Game/assets/160724052/6e941dd5-7351-4817-b35d-adc5ad36f5d9)



As a result, I have had to stick with just using normal pictures for the welcome page and for the rest of the action buttons when they are pressed. The second issue was getting the dog’s status value to change based on the action taken by the player. After researching different similar video games, most the codes used for them would not work. Some of the codes would cause the game not to run or crash. So as a result, my game will not show status value changes no matter what button the player presses.

The development process of this game was started designing the User Interface with the goal of making easy to navigate. As previously mentioned, I drew the pictures using FlipaClip and I inserted them in the app. Since the target audience of the game is primarily for young kids, I have used bright green for the background of and bright red colour for the buttons. The goal was to also make the as simplistic as possible. Next for the coding part for the I started by adding a second ‘Activity’ and linking it with the original one and then instructing the Start button to switch to the second Activity. For the button to do that I had declare and then activate the button using ‘setOnClickListener’ in the first Activity and then link it in the second Activity. Below are two screenshots to show how this was done. 

![Screenshot 2024-05-05 142603](https://github.com/Thabiso67/Tamagotchi_Game/assets/160724052/5b509e56-25e2-491e-b3ea-060c70d26e6a)

![Snipet activty 2](https://github.com/Thabiso67/Tamagotchi_Game/assets/160724052/88e5cb04-b56a-42d6-9658-508c2e522665)


Next for the second Activity, I had to activate the three action buttons for the matching pictures to appear. To do that first I had to add my drawn pictures to the games’ drawable folder and to make the names of the pictures were in small letters in for the buttons to be able to be activated. Once that was done, I had to declare the three buttons and then just like in the first Activity, activate them using ‘setOnClickListener’ and then I linked the buttons with the pictures. The screenshot below shows how this was done.
After finishing with the development of the game it was time to test it its functionality provided that not all the required features were implemented. After running and testing the game restarting it multiple times, apart from it having minor freezes the game ran well. All the buttons were working as they should the pictures were displaying as intended. The only issues which were previously mentioned were the status values of the dog not being functional at all. 
I can say that so far, this was the most difficult project I have done as I have never made a mobile video game before. In a way it has help me learn a lot more about other features of Android Studio that I wish I knew before. Overall, I can’t say I am too satisfied with results the game. I know there are areas where they could be improvement such the status values of the dog and having living animations as it is a video game.

In conclusion, the development processes this game did came with a lot of challenges and obstacles. Despite the hard work that was put in, there is still room for improvement for this game. I will use the learning experience of this to show improvement in other possible mobile game projects.

Bibliography
•	Dreamstime. [Online].  Available at: https://www.dreamstime.com/illustration/stick-figure-dog.html [Accessed 30 April 2024]

•	J Meson. M Meson. T Meson. 2012. FlipaClip. Version 3.9.0. [App]. Available from Google Play. (Accessed 30 April 2024)

•	how to change image on button click in android studio. 2022. YouTube video, added by MaskedProgrammer. [Online]. Available at: https://www.youtube.com/watch?v=_2HmTXCJBDM&list=LL&index=7 [Accessed 01 May 2024]

•	Kotlin - Open a New Activity with a Button Click in Android Studio | Kotlin | 2021 | #2. 2021. YouTube video, added by Foxandroid. [Online]. Available at: https://www.youtube.com/watch?v=2gljhNFKimk&t=271 [Accessed 26 April 2024]

