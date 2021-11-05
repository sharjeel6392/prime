/**
*       Prime.java
*
*       @version:       $Id: Prime.java, 08/28/2019 22:05:10
        Title:          ASSIGNMENT 1.1


        Author:         Sharjeel Sahar Ansari

*/


/**
 *      To determine whether the given number has 2 prime factors or not
        If yes, calculate and print the sum of the two prime factors.

*/

class Prime{

   /*
        *       isPrime method
        *
        *       @param: an intger to check whether it is a prime or not
        *
        */

        public static byte isPrime(int number){
                int index;
                for (index = 2; index <= number/2; index ++){
                        if (number % index == 0){
                                return -1;
                        }
                }
                return 1;
        }

   /*
        *       The main program
        *
        *       @params:        args command line arguments (ignored)
        */

        public static void main(String args[]){
                int number = 20;
                int index = 2;
                int numberOfPrimes = 0;
                int tmp = number;       // copy of actual number to modify
                int sum = 0;            // to calculate the sum of prime factors

                if (number < 2){

                        /*
                         *      If the number is less than 2
                         *      No prime factors. Terminate
                         */

                        System.out.println("No prime factors detected. Exiting...");
                        System.exit(0);
                }

                /*
                 *      for all digits from 2 to the input (number)
                 *      check if the digit divides the number
                 *      then check if the digit is prime.
                 *      If yes, increment numberOfPrimes by one and add the digit to "sum"
                 *      Check if numberOfPrimes > 2. If yes, terminate the program.
                 *      Else, display the sum of the two Primes.
                 */

                for (index = 2; index <= number; index ++){
                        if (tmp % index == 0){
                                while (tmp > 1 && tmp % index == 0){
                                        numberOfPrimes += 1;
                                        if (numberOfPrimes > 2){
                                                System.out.println("Factors more than 2. Exiting...");
                                                System.exit(0);
                                        }
                                        sum += index;
                                        tmp /= index;

                                }
                        }
                }
        if (numberOfPrimes == 1){
                System.out.println("Insufficient prime factors. Exiting...");
                System.exit(0);
        }
        System.out.printf("Total sum of 2 prime factors is: %d.%n", sum);
        }
}
