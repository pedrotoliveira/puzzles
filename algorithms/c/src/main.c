/*
 * Main application for all solved problems for arrays puzzles
 * File:   main.c
 * Author: Pedro T. Oliveira <pedro.oliveira20@gmail.com>
 *
 * Created on September 24, 2012, 2:44 AM
 */

#include <stdio.h>
#include <stdlib.h>

#define getLenght(x)  (sizeof(x) / sizeof(x[0]))

void bubble_sort(int toSort[], int lenght);
void heap_sort(int toSort[], int length);

static void print_array(int toPrint[], int lenght) {
	printf("{");
	int index;
	for (index  = 0; index < lenght; index++)  {
		printf("%d", toPrint[index]);
		if (index != lenght -1) {
			printf(", ");
		}
	}
	printf("}\n");
}

/*
 * Main
 */
int main(int argc, char** argv) {

	int array_a[] = { 18, 39, 1, 3, 49, 109, 488, 12, 45, 67, 90 };

	printf("sizeof of array: %lu\n", sizeof(array_a));
	printf("Length of array: %lu\n", sizeof(array_a) / sizeof(array_a[0]));

	printf("Trying bubble sort array \n ");
	printf("Before - ");
	print_array(array_a, getLenght(array_a));
	bubble_sort(array_a, getLenght(array_a));
	printf("After - ");
	print_array(array_a, getLenght(array_a));

	int array_b[] = { 25, 528, 15, 89, 84, 21, 9, 64, 5218, 1, 87 };

	printf("sizeof of array: %lu\n", sizeof(array_b));
	printf("Length of array: %lu\n", sizeof(array_b) / sizeof(array_b[0]));

	printf("Trying heap sort array \n ");
	printf("Before - ");
	print_array(array_b, getLenght(array_b));
	heap_sort(array_b, getLenght(array_b));
	printf("After - ");
	print_array(array_b, getLenght(array_b));

	return (EXIT_SUCCESS);
}
