#include <stdio.h>
#include <stdlib.h>
#include "header.h"

/** prototypes */
void swap_position(int toSort[], int pos);
void siftDown(int *toSort, int start, int end);
void heapify(int *toSort, int count);

void print_array(int *toPrint, int length) {
	printf("{");
	int index;
	for (index  = 0; index < length; index++)  {
		printf("%d", toPrint[index]);
		if (index != length -1) {
			printf(", ");
		}
	}
	printf("}\n");
}

/**
 * The bubble sort works by iterating down an array to be sorted from the first element to the last,
 * comparing each pair of elements and switching their positions if necessary.
 *
 * Notice that this will always loop n times from 0 to n, so the order of this algorithm is O(n^2).
 * This is both the best and worst case scenario because the code contains no way of determining
 * if the array is already in order.
 *
 * @param toSort the arry to sort
 * @param lenght lenght of array
 * @return 0 to success
 */
void bubble_sort(int toSort[], int length) {
	int i, j;

	for (i = 0; i < length; i++) {

		for (j = 0; j < length - 1; j++) {
			if (toSort[j] > toSort[j + 1]) {
				swap_position(toSort, j);
			}
		}
	}
}

void swap_position(int toSort[], int pos) {
	int aux = toSort[pos + 1];
	toSort[pos + 1] = toSort[pos];
	toSort[pos] = aux;
}

/**
 * Heapsort is an in-place sorting algorithm with worst case and average complexity of O(n logn).
 * The basic idea is to turn the array into a binary heap structure, which has the property that it allows
 * efficient retrieval and removal of the maximal element. We repeatedly "remove" the maximal element from the heap,
 * thus building the sorted list from back to front.
 *
 * Heapsort requires random access, so can only be used on an array-like data structure.
 *
 * @param toSort
 * @param lenght
 * @return
 */
void heap_sort(int *toSort, int count) {
	heapify(toSort, count);
	print_array(toSort, count);
	int end = count - 1;
	while (end > 0) {
		printf("trocando: %d por %d \n", toSort[end], toSort[0]);
		int aux = toSort[end];
		toSort[end] = toSort[0];
		toSort[0] = aux;
		end--;
		printf("end: %d\n", end);
		siftDown(toSort, 0, end);
		print_array(toSort, count);
	}
}

void heapify(int *toSort, int count) {
	int start = (count - 2) / 2;
	while (start >= 0) {
		siftDown(toSort, start, count - 1);
		start--;
	}
}

void siftDown(int *toSort, int start, int end) {
	int root = start;

	while (root * 2 + 1 <= end) {
		int child = 2 * root + 1;
		int swap = root;

		if (toSort[swap] < toSort[child]) {
			swap = child;
		}

		if ((child + 1 <= end) && (toSort[swap] < toSort[child + 1])) {
			swap = child + 1;
		}

		if (swap != root) {
			printf("swap: %d to %d \n", toSort[root], toSort[child]);
			int pos = toSort[root];
			toSort[root] = toSort[child];
			toSort[child] = pos;
			root = swap;
		} else {
			return;
		}
	}
}