package pedrotoliveira.puzzles.hackerrank.algorithm.warmup;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * Problem Statement
 *
 * You are given an array of integers of size N. You need to print the sum of
 * the elements in the array, keeping in mind that some of those integers may be
 * quite large.
 *
 * Input
 *
 * The first line of the input consists of an integer N. The next line contains
 * N space-separated integers contained in the array.
 *
 * Constraints 1≤N≤10 0≤A[i]≤1010
 *
 * Sample Input 5 1000000001 1000000002 1000000003 1000000004 1000000005
 *
 * Output Print a single value equal to the sum of the elements in the array. In
 * the above sample, you would print 5000000015.
 *
 * Note: The range of the 32-bit integer is (−231) to (231−1) or
 * [−2147483648,2147483647]. When we add several integer values, the resulting
 * sum might exceed the above range. You might need to use long long int in
 * C/C++ or long data type in Java to store such sums.
 *
 * @author pedrotoliveira
 */
public class AVeryBigSum {

    private final int size;
    private final List<Long> bigNumbers;

    public AVeryBigSum(int size, List<Long> bigNumbers) {
        this.size = size;
        this.bigNumbers = bigNumbers;
    }

    public Long doSum() {
        return bigNumbers.stream().limit((long) size).mapToLong(Long::longValue).sum();
    }
}