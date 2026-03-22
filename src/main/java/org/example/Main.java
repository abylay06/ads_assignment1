import java.util.Scanner;
Scanner sc = new Scanner(System.in);

// Task 1. Print digits of a number.

public int printDigit(int n) {
    if (n<10) {
        System.out.println(n);
        return n;
    }
    printDigit(n/10);
    System.out.println(n%10);
    return n;
}

// Task 2. Average of elements.

public float averageOfElements(int number_of_elements){
    if (number_of_elements==0) {
        return 0;
    }
    return sc.nextInt() + averageOfElements(number_of_elements - 1);

}


// task 3. Prime Number Check.
public boolean checkPrime(int number, int divisor){
    if (number <= 1) return false;
    if (number % divisor == 0 && number != divisor) return false;
    if (number == divisor) return true;
    return checkPrime(number, divisor + 1);


}

// task 4. Factorial.

public int factorial(int number) {
    if (number <= 1) return 1;
    return number * factorial(number - 1);
}

// Task 5. Fibonacci Number.

public int fibonacci(int number) {
    if (number == 1) return 0;
    if (number == 2) return 1;
    return fibonacci(number-1) + fibonacci(number-2);
}

// Task 6. Power Function

public int power(int number, int power) {
    if (power == 1) return number;
    if (power == 0) return 1;
    return number * power(number, power - 1);
}

// Task 7. Reverse output.

public void reverse(int numberOfNumbers) {
    int number = sc.nextInt();
    if (numberOfNumbers <= 1) {
        System.out.println(number);
        return;
    }
    reverse(numberOfNumbers-1);
    System.out.println(number);
}

// Task 8. Check Digits in String.

public String isOnlyDigits(String word, int length) {
    if (length == 0){
        if (Character.isDigit(word.charAt(length))) return "Yes";
        else return "No";
    }
    if (!Character.isDigit(word.charAt(length))) return "No";
    return isOnlyDigits(word, length - 1);
}

// Task 9. Count Characters in String.

public int stringLength(String word, int index) {
    try {
        char ch = word.charAt(index);
        return 1 + stringLength(word, index + 1);
    }
    catch (IndexOutOfBoundsException e) { return 0;}

}

// Task 10. Greatest Common Divisor.

public int  gcd(int num1, int num2) {
    if (num1 == num2) return num1;
    if (num1 > num2) {
        if (num1 % num2 == 0) return num2;
        else return gcd(num2, num1 - num2);
    }
    if (num1 < num2) {
        if (num2 % num1 == 0) return num1;
        else return gcd(num1, num2-num1);
    }
    return 1;
}

void main() {
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.println(gcd(num1, num2));
}

