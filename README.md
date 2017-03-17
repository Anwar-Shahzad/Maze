Project: Display Certain Mazes in GUIs and Provide Solution

Author: Shahzad Anwar

Summary: This project currently contains files for two mazes (FirstMaze.java and SecondMaze.java). Use the class MazeRun to display a maze (i.e. run the command "MazeRun FirstMaze" or "MazeRun SecondMaze"). These two mazes are composed of grids of buttons, each of which displays a number. This number dictates the exact distance (in terms of buttons) which the user can travel in any direction. The current button the user resides on is denoted with a green circle. The purpose of each maze is to reach the button marked "GOAL". The "SecondMaze" class follows the same rules, except no U-turns are allowed; that is, at each step, the user cannot return in the direction from which they came. 

Click the button marked "Click for Solution" to display a solution path from the starting button to the goal. The solution is produced using an implicit implementation of a modified Breadth First Search on a directed graph. 


This is a work in progress (as shown by the commented out code), and many improvements can be made.

Known Issues: 
-After clicking the Solution button, the program will solve the maze and display the correct path if the user mouses over the buttons. Will try to fix this so that the solution is shown in real time.

-The solution assumes the user is at the starting button. Will try to fix this so that a solution will be generated for the current button, not the starting button.

-Resizing the maze window may cause some additional buttons to be generated in the SecondMaze.

