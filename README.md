WAVE 1

Problem 1: Minimum Number of Platforms Required for a Railway/Bus Station

Given arrival and departure times of all trains that reach a railway station, find the minimum number of platforms required for the railway station so that no train waits.
We are given two arrays which represent arrival and departure times of trains that stop

Examples:

Input:  arr[]  = {9:00,  9:40, 9:50,  11:00, 15:00, 18:00}
        dep[]  = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
Output: 3
There are at-most three trains at a time (time between 11:00 to 11:20)

We need to find the maximum number of trains that are there on the given railway station at a time. A Simple Solution is to take every interval one by one and find the number of intervals that overlap with it. Keep track of maximum number of intervals that overlap with an interval. Finally return the maximum value. Time Complexity of this solution is O(n2).

We can solve the above problem in O(nLogn) time. The idea is to consider all evens in sorted order. Once we have all events in sorted order, we can trace the number of trains at any time keeping track of trains that have arrived, but not departed.

For example consider the above example.

    arr[]  = {9:00,  9:40, 9:50,  11:00, 15:00, 18:00}
    dep[]  = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}

All events sorted by time.
Total platforms at any time can be obtained by subtracting total 
departures from total arrivals by that time.
 Time     Event Type     Total Platforms Needed at this Time 
 9:00       Arrival                  1
 9:10       Departure                0
 9:40       Arrival                  1
 9:50       Arrival                  2
 11:00      Arrival                  3 
 11:20      Departure                2
 11:30      Departure                1
 12:00      Departure                0
 15:00      Arrival                  1
 18:00      Arrival                  2 
 19:00      Departure                1
 20:00      Departure                0

Minimum Platforms needed on railway station = Maximum platforms 
                                              needed at any time 
                                           = 3  


Problem 2: Given a number N. print in how many ways it can be represented as N = a+b+c+d , 1< =a< =b< =c< = d; 1<=N< = 5000

Solution 2) We need to find Prime numbers in range [L,R]. and need to find a highest occuring digit and if frequency is same, the highest number is answer.
What can we do for this program is to divide this prog in 3 parts.
1 ) Find prime numbers and store them in Array.
2 ) Create new array from this array with all just digits
ex : prime’s array = [2, 3, 5, 7, 11, 13, 17]
so new Array will be = [2, 3, 5, 7, 1, 1, 1, 3, 1, 7]
3) Find occurrence of each digit like [0,3,1,2,0,1,0,2] (0 comes 0 time, 1 comes 3 times, and so one…)
Now get the highest digit, return its index, if such numbers are more than one, return the highest index.
Coding Soultion :
for Step 1) Use sieve-of-eratosthenes’s code available at http://www.geeksforgeeks.org/sieve-of-eratosthenes/

Sieve of Eratosthenes
Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number.
For example, if n is 10, the output should be “2, 3, 5, 7″. If n is 20, the output should be “2, 3, 5, 7, 11, 13, 17, 19″.

The sieve of Eratosthenes is one of the most efficient ways to find all primes smaller than n when n is smaller than 10 million or so (Ref Wiki).

Following is the algorithm to find all the prime numbers less than or equal to a given integer n by Eratosthenes’ method:

Create a list of consecutive integers from 2 to n: (2, 3, 4, …, n).
Initially, let p equal 2, the first prime number.
Starting from p, count up in increments of p and mark each of these numbers greater than p itself in the list. These numbers will be 2p, 3p, 4p, etc.; note that some of them may have already been marked.
Find the first number greater than p in the list that is not marked. If there was no such number, stop. Otherwise, let p now equal this number (which is the next prime), and repeat from step 3.
When the algorithm terminates, all the numbers in the list that are not marked are prime.

Explanation with Example:
Let us take an example when n = 50. So we need to print all print numbers smaller than or equal to 50.

We create a list of all numbers from 2 to 50.
Sieve1

According to the algorithm we will mark all the numbers which are divisible by 2.
sieve2

Now we move to our next unmarked number 3 and mark all the numbers which are multiples of 3.
sieve3

We move to our next unmarked number 5 and mark all multiples of 5.
Sieve4

We continue this process and our final table will look like below:
Sieve5

So the prime numbers are the unmarked ones: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47.

for Step 2) its simple Array formation, traverse array, % and /  each number by 10 and get digits :)
Have happy coding  amigos


