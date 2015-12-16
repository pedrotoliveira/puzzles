/*
 * Main application for all solved problems for arrays puzzles
 * File:   main.c
 * Author: Pedro T. Oliveira <pedro.oliveira20@gmail.com>
 *
 * Created on September 24, 2012, 2:44 AM
 */

#include <stdio.h>
#include <stdlib.h>
#include "header.h"

void bubble_sort(int toSort[], int lenght);
void heap_sort(int toSort[], int length);
void print_array(int toPrint[], int length);

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

	int heap[] = { 6, 5, 3, 1, 8, 7, 2, 4 };

	printf("sizeof of array: %lu\n", sizeof(heap));
	printf("Length of array: %lu\n", sizeof(heap) / sizeof(heap[0]));

	printf("Trying heap sort array \n ");
	printf("Before - ");
	print_array(heap, getLenght(heap));
	heap_sort(heap, getLenght(heap));
	printf("After - ");
	print_array(heap, getLenght(heap));

	return (EXIT_SUCCESS);
}
