### 2.2-1
Consider sorting n numbers stored in array A by first finding the smallest element
of A and exchanging it with the element in AOE1. Then find the second smallest
element of A, and exchange it with A[2]. Continue in this manner for the first n1
elements of A. Write pseudocode for this algorithm, which is known as selection
sort. 

#### What loop invariant does this algorithm maintain? 
while i = 0, i < A.length

#### Why does it need to run for only the first n - 1 elements, rather than for all n elements? 

Because when the i equals to A.length, meaning the last of the element, is the largest element, hence no comparision is needed.

#### Give the best-case and worst-case running times of selection sort in Θ-notation.

The best-case is every elements are in ascending order which is Θ(n). 
The worst-case is every elements are in descending order which is Θ(n*logn).
