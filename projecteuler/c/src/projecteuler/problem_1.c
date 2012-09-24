#include <stdio.h>
#include "header.h"

/**
 * 
 * @param number
 * @return 
 */
static int isThreeMutiple(int number) {
	return (number % 3) ? FALSE : TRUE;
}

/**
 * 
 * @param number
 * @return 
 */
static int isFiveMutiple(int number) {
	return (number % 5) ? FALSE : TRUE;
}

/**
 * 
 * @return 
 */
int sumAllMutiples3Or5Below1000() {
	int number, sum = 0;
	for (number = 3; number < 1000; number++) {
		if (isThreeMutiple(number) || isFiveMutiple(number)) {
			sum +=number;
		}
	}
	return sum;
}

/**
 * Problem 1:
 *  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
void problem1() {
	response("Sum of all the multiples of 3 or 5 below 1000", sumAllMutiples3Or5Below1000());
}