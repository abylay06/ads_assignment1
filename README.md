Student: Abylay Altynbassov

Group: SE2514

Part 1. Recursion with numbers

Task 1.
For the first task I first reduced the number to its 1st digit by dividing until the number is less than 10 (so 1 digit) then I started printing remainder after modulus 10 for 1st digit, then first 2 digits until the whole number. This allowed me to print first to last digits in order.
<img width="1919" height="1079" alt="Screenshot 2026-03-21 231826" src="https://github.com/user-attachments/assets/9bdf6c9b-2672-4165-97ff-ebc794ee56c5" />

Task 2.
First I used scnaner to input the nubmer of numbers then put that into recursion. Base case was when number of numbers is 0, before that I just recursively added numbers that I input by reducing recursion input by 1 each time, then the returned sum was divided by the number of numbers to find the average.
<img width="1914" height="1079" alt="Screenshot 2026-03-22 184824" src="https://github.com/user-attachments/assets/91e898ac-8eaa-47a1-9f0b-4f95982911ce" />

Task 3.
I created a function that returns boolean and takes in number and divisor. I defined 3 base cases and divisor converges up to the number unless there is one factor between 2 and number, returning true. Otherwise, it is false. Also, numbers less than or equal to 1 are defined as prime in of the base cases and automatically return false. The divisor is always 2 and number is input by the user.
<img width="1919" height="988" alt="Screenshot 2026-03-22 191133" src="https://github.com/user-attachments/assets/17f01078-a7cb-4343-b974-f56814a2be16" />
<img width="1919" height="1079" alt="Screenshot 2026-03-22 191109" src="https://github.com/user-attachments/assets/3099895a-2927-442a-93c0-f9e941917671" />

Task 4.
For factorial, I used scanner ot input one number and its passed into the function factorial. Base case is for n<=1, where it returns 1. For n > 1, it returns n * factorial(n-1) which returns factorial for that n.
<img width="1918" height="1079" alt="Screenshot 2026-03-22 191604" src="https://github.com/user-attachments/assets/75f53ebc-5172-4466-9348-f91ebfc93977" />

Part 2. Recursion with sequences.

Task 5.
For fibonacii, I inputted one number and defined base cases as 0 and 1 where it returns 0 and 1. But for other cases it returns fibonacci(n-1) + fibonacci(n-2) which can go to many functions on the stack for the first call then for the next call.
<img width="1919" height="1079" alt="Screenshot 2026-03-22 224231" src="https://github.com/user-attachments/assets/3833190f-0ab7-4400-b21e-745ce45d2a98" />
<img width="1919" height="1079" alt="Screenshot 2026-03-22 224216" src="https://github.com/user-attachments/assets/52b913dd-0741-40f8-9c82-bc6782570f15" />

Task 6.
This was easy. I just inputted number and power, then power 1 and 0 were base cases that returned the nubmer and 1. for other cases, I returned number * power(number, power - 1 ).
<img width="1919" height="1029" alt="Screenshot 2026-03-22 192957" src="https://github.com/user-attachments/assets/62a30de5-ebb2-43fe-a71a-d3e15d137039" />

Task 7.
For reverse, it was tricky because I had to know exactly when what line runs and what value of n each function on the stack stores. I first took number of numbers as input then passed to the function reverse, then I took number as input inside the function. Base case was n <= 1 which immediately printed the number. This is the most important moment. for n > 1, I printed under the reverse recursion so that the numbers were printed in the reverse order while stack functions were finishing and getting out of the stack.
<img width="1919" height="1079" alt="Screenshot 2026-03-22 193914" src="https://github.com/user-attachments/assets/00a3c5fb-c96a-479d-b428-46f520075ede" />

Part 3. Recursion with strings.

Task 8.
Here I had to look up some functions such as charAt and Character.isDigit(). I inputted the text using scanner then base cases wehre when length of the string was 1. I just checked if it is digit then returned Yes and if not returned No. Second base case was if the current index (I used word length) had not a number, then it will say No because character that is not a digit exists. Finally, I recursively called the function with length - 1 to converge to base case.
<img width="1919" height="1079" alt="Screenshot 2026-03-22 200256" src="https://github.com/user-attachments/assets/033507ae-7ace-4903-aed8-5ced8f83d7fd" />
<img width="1919" height="1079" alt="Screenshot 2026-03-22 200242" src="https://github.com/user-attachments/assets/10c307c5-c836-475f-a75e-9f879c5b8e2f" />

Task 9.
Here I took strange appraoch with try and catch. I took string and index for the function and if there was index out of bound exception I returned 0 but it returned it to another function before on the stack which had line returned 1 + the function with word and index + 1.
<img width="1919" height="1079" alt="Screenshot 2026-03-22 201615" src="https://github.com/user-attachments/assets/006a72be-39a2-41d3-b280-ba9de4f61d62" />
<img width="1919" height="1079" alt="Screenshot 2026-03-22 201704" src="https://github.com/user-attachments/assets/f17a4c7a-21b6-4cf2-9fbc-9b882e0b73cb" />

Task 10.
For gcd, I took 2 numbers as input and base case was if they were equal gcd is just one of those. And if one is greater, there are 2 cases, base case is if no remainders then the smaller one is the gcd, and if no then recursively called the function with the smaller number and the difference between the numbers passed into the function.
<img width="1919" height="1079" alt="Screenshot 2026-03-22 202628" src="https://github.com/user-attachments/assets/38d6e315-f261-47eb-adc3-68fa3cc03a4f" />
<img width="1915" height="1079" alt="Screenshot 2026-03-22 202641" src="https://github.com/user-attachments/assets/8573696f-bd1a-49c0-8414-9d6517c26aa9" />

