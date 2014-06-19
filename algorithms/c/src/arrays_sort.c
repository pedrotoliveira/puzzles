#include <stdlib.h>

/** prototypes */
void swap_position(int toSort[], int pos);
void siftDown(int *toSort, int begin, int length);
void heapify(int *toSort, int length);

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
int bubble_sort(int toSort[], int length) {
	int i, j;

	for (i = 0; i < length; i++) {

		for (j = 0; j < length - 1; j++) {
			if (toSort[j] > toSort[j + 1]) {
				swap_position(toSort, j);
			}
		}
	}
	return EXIT_SUCCESS;
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
int heap_sort(int toSort[], int length) {
	heapify(toSort, length);

	int end = length - 1;
	while (end > 0) {
		int pos = toSort[end];
		toSort[end] = toSort[0];
		toSort[0] = pos;
		siftDown(toSort, 0, end - 1);
		end--;
	}
	return EXIT_SUCCESS;
}

void heapify(int *toSort, int length) {
	int begin = (length - 2) / 2;
	while (begin >= 0) {
		siftDown(toSort, begin, length);
		begin--;
	}
}

void siftDown(int *toSort, int begin, int length) {
	int parent = begin * 2 + 1;

	while (parent <= length) {
		int child = 2 * parent + 1;

		if ((child + 1 <= length) && (toSort[child] < toSort[child + 1])) {
			child += 1;
		}

		if (toSort[parent] < toSort[child]) {
			int pos = toSort[parent];
			toSort[parent] = toSort[child];
			toSort[child] = pos;
			parent = child;
		} else {
			return;
		}
	}
}