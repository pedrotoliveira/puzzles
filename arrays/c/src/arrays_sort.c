
#include <stdlib.h>

static void swap_position(int toSort[], int pos) {
	int aux = toSort[pos + 1];
	toSort[pos + 1] = toSort[pos];
	toSort[pos] = aux;
}

/**
 * The bubble sort works by iterating down an array to be sorted from the first element to the last, 
 * comparing each pair of elements and switching their positions if necessary.
 * 
 * Notice that this will always loop n times from 0 to n, so the order of this algorithm is O(n^2). 
 * This is both the best and worst case scenario because the code contains no way of determining 
 * if the array is already in order. 
 * 
 * @param toSort
 * @param lenght
 * @return 
 */
int bubble_sort(int toSort[], int lenght) {
	int i, j;

	for (i = 0; i < lenght; i++) {

		for (j = 0; j < lenght - 1; j++) {

			if (toSort[j] > toSort[j + 1]) {
				swap_position(toSort, j);
			}
		}
	}
	return EXIT_SUCCESS;
}

/**
 * 
 * 
 * @param toSort
 * @param lenght
 * @return 
 */
int heap_sort(int toSort[], int lenght) {

	int i = lenght / 2;
	int pai, filho, element;

	while (1) {
		if (i > 0) {
			i--;
			element = toSort[i];
		} else {
			lenght--;
			if (lenght == 0) return;
			element = toSort[lenght];
			toSort[lenght] = toSort[0];
		}

		pai = i;
		filho = i * 2 + 1;

		while (filho < n) {
			if ((filho + 1 < n) && (a[filho + 1] > a[filho]))
				filho++;
			if (a[filho] > t) {
				a[pai] = a[filho];
				pai = filho;
				filho = pai * 2 + 1;
			} else {
				break;
			}
		}
		a[pai] = t;
	}
	return EXIT_SUCCESS;
}