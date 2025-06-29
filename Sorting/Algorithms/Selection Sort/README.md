# Intuition
The selection sort algorithm sorts an array by repeatedly finding the minimum element from the unsorted part and putting it at the beginning. The largest element will end up at the last index of the array.

# Approach
- We need two nested loops: one to track the beginning of the unsorted section, and one to find the minimum element in that section.
- After finding the minimum, we swap it with the first element of the unsorted part.
- Note: Here we are tracking the beginning of the unsorted section because after each iteration of the inner loop,


### Code: [Java](Solution.java)
