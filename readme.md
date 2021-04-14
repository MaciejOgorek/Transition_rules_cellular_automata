Program shows rules of transition for 1-D cellular automata.
If we take a cell and its two neighbors we can see that there are 256 rules of transition for one dimensional automatas.
Example:

 Rule 90
 
 ![cellular state](https://user-images.githubusercontent.com/61821034/114729951-b8dea980-9d40-11eb-9885-b49d57b14f40.PNG)

We can see that the 8 possible combinations of values in a cell and its neighbors in t row give 8 values in t+1 row. If we take these numbers as a binary number we get the rule number. It also works the other way if you have a rule number you can calculate values in t+1 row by calculating a binary number from an integer.

Program allows to visualize all 256 rules of transition with different boundary conditions either there are cells with value 1 or the boundary conditions are periodical.

