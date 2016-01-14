package pedrotoliveira.puzzles.hackerrank.algorithm.graph;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/bfsshortreach
 * 
 * @author pedrotoliveira
 */
public class ShortestReach {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        for (int t = 0; t < testCases; t++) {
            int nodes = in.nextInt();
            int edges = in.nextInt();
            Graph g = new Graph(nodes, edges);
            for (int i = 1; i <= nodes; i++) {
                g.addVertice(i);
            }
            for (int i = 0; i < edges; i++) {
                int v1 = in.nextInt();
                int v2 = in.nextInt();
                g.addEdge(v1, v2);
            }
            Vertice source = new Vertice(in.nextInt());
            BreadthFirstPath bfp = new BreadthFirstPath(g, source);
            bfp.printDistances();
        }
    }
}
