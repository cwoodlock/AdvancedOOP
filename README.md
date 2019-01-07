# AdvancedOOP
This is a repository for my Advanced Object Oriented Project. Student Number G00341460
Github: https://github.com/cwoodlock/AdvancedOOP
The project skeleton was adapted from source code provided by lecturer.

**NOTE** Most current version on github does not run however the previous commit does

In regards to the project were were asked to implement some design patterns into the project. I used a Factory design patter when making different levels 
which each used the singleton design pattern. I also attempted to make a sprite factory and sprite classes these would be used to load the different sprites.
Finally from the GameView class I abstracted various things from it as it was acting as a god class and breaking single responsibility. First I removed the 
the loadImages method and implemented ti as a class and also gave it an interface. Similarly I did the same with the isometric related methods and the painting method.

## Additional features
Initially I wanted to create a game where the player would collect chests to complete the level and load the next one. However I misread the submit time and 
didn't have this functionality. Instead I just have a way to load different levels by changing the code and I hardcoded in some values to
prevent the player from walking outside the game level that is painted.
