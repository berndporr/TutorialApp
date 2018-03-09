# Android tutorial app
App which shows basic functionality of Android

## Exercises

### Start the app

1. Plug your mobile via USB into your computer
2. Enable debugging on your phone
3. You might need to enable debugging on your computer
4. Start Android studio
5. Open the project
6. Click on `Run`

### Add draw commands

In this section you add some drawin commands to the canvas.

1. Open the class `GraphicsView` which establishes a canvas where you can draw anything on it.
2. Check out the two commands which draw lines and text
3. Add more drawing commands. Use loops to make some line art.
4. Plot a sine wave with the line commands and a for loop.

Generally everything what is placed on the screen is a View. The Graphics
view is the most generic one. You can also install Views which
plot you data straight away: [Androidplot](http://androidplot.com/).

### User interaction

Your task is to react to user input: when the user presses OK something
awesome is drawn on the canvas.

Android works event driven. Pressing a button calls a function. In JAVA
speak that's called an "event listener". In this case an onClickListener.

1. Open the class `TutorialActivity` which runs 1st when the app starts. It contains functions which are called when the app starts, stops, re-starts etc.
2. Go to `onCreate`: this function is called when the app is created.
3. The buttons have been defined in the layout file `activity_tutorial.xml` which is in res/layout. Every button, view etc has an ID which you use to connect an event listener to it!
4. In tutorial activity the ID for the OK button is retrieved and then the event listener for OK is installed which is called "onClick()". Just now
this just replaints the GraphicsView.
5. Add to the Graphics view a flag which paints more on the screen when it's one.
6. Change the flag in "onClick()" to one so that when the user clicks on OK then the additional content is painted.

You see that in general the idea is to associate a "listener" to a button which is nothing else than a function which is called.

### Further topics

1. Timers: you can install a timer class and associate again a "listener" which then calls the callback function at defined timer intervals. In this way you can animate stuff.
2. Layout: in general in Android layouts are defined by XML files as boxes within boxes. For example you say that all elements are ordered in a vertical box. Then in that vertical box you can have horizontal boxes and then inside views, buttons, etc. They are in res/layout. You can specify different leayouts for landscape and portrait.
3. Menus: instead of buttons you can add menus which again are served by an event listener. Google examples.
4. Pre defined dialogues: for file entry and other default actions Android offers default dialogues.
5. Intents: if you want to have more than one activity you can switch from one activity to another with the help of intents. It's a bit of having multiple apps in one. If you press the back button you'd back then
