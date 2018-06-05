### 2.1-3
Consider the problem of adding two n-bit binary integers, stored in two n-element
arrays A and B. The sum of the two integers should be stored in binary form in 
your loop invariant fulfills the three necessary properties.an .n C 1/-element array C.
 State the problem formally and write pseudocode for adding the two integers.

``` 
for i = 0 ; i < A.length; i++ 
    sum = A[i] + B[i] + C[i]
    C[i] = sum % 2
    C[i + 1] = sum / 2
```