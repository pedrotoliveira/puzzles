/* 
 * Main application for all solved problems for arrays puzzles
 * File:   main.c
 * Author: Pedro T. Oliveira <pedro.oliveira20@gmail.com>
 *
 * Created on September 24, 2012, 2:44 AM
 */

#include <stdio.h>
#include <stdlib.h>

void bubble_sort(int toSort[], int lenght);

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

static int getLenght(int array[]) {
	return sizeof(array);
}

/*
 * Main
 */
int main(int argc, char** argv) {
	
	int array_a[] = { 18, 39, 1, 3, 49, 109, 488, 12, 45, 67, 90 };
	
	printf("Trying bubble sort array \n ");
	printf("Before - ");
	print_array(array_a, getLenght(array_a));
	bubble_sort(array_a, getLenght(array_a));
	printf("After - ");
	print_array(array_a, getLenght(array_a));
	
	return (EXIT_SUCCESS);
}
