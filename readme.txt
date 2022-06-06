Team Info:
-----------
1- Fayza Ahmed Sayed Ahmed    20190376  fayzaa586@gmail.com
2- Yomna Mahmoud Abd EL-Wahab 20190625  yomnaali152@gmail.com 
3- Asmaa Refat Abd Elmabood   20190101  asmaarefat071@gmail.com
4- Nada Omar Fathi AbdelSalam 20190581  nadaomar122001@gmail.com

---------------------------------------------------------------------

Programming Language: Java

Requirements to Build the Project:
1- Import library (javafx).
2- SDK (Java 8 or Java 1.8).

How to run the project:
1- Choose the difficulty level (enter 1 for Easy, 2 for Medium, 3 for Hard).

-> Initially the computer starts the game then the human turn begins.
-> When it is your turn enter the indices of the marble you want to move then choose from the available options that show up. 

2- Enter an integer that represents the number of rows for this marble and then enter another integer that represents the number of columns.

3- Enter two integers from the list of options, rows then columns (respectively). 
 
---------------------------------------------------------------------

Heuristic Explanation:
----------------------

We consider that the vertex of the triangle is the goal for all marbles.
The utility is going to be the total distances of all marbles and the goal. 
The less the distance, the better the utility is going to be.
When any marble enter the opposite triangle, its distance becomes Zero.

---------------------------------------------------------------------



