package pedrotoliveira.puzzles.hackerrank.algorithm.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * The Breadth First Search Algorithm to calculate the paths in a undirected
 * graph
 *
 * @author pedrotoliveira
 */
public class BreadthFirstPath {

    private static final int INFINITY = -1;
    private static final int EDGE_SIZE = 6;

    private final Graph graph;
    private final Vertice sourceVertice;
    private final List<Vertice> visited = new ArrayList<>();
    private final Map<Vertice, Integer> distTo;

    public BreadthFirstPath(final Graph graph, Vertice sourceVertice) {
        this.graph = graph;
        this.sourceVertice = sourceVertice;
        this.distTo = new HashMap<>();
        bfs();
    }

    private void bfs() {
        Queue<Vertice> queue = new LinkedList<>();

        graph.getVertices().stream().forEach((v) -> {
            distTo.put(v, INFINITY);
        });

        visited.add(sourceVertice);
        distTo.put(sourceVertice, 0);
        queue.add(sourceVertice);
        while (!queue.isEmpty()) {
            Vertice v = queue.poll();
            for (Edge edge : graph.getEdges(v)) {
                Vertice vPair = edge.getPair(v);
                if (!visited.contains(vPair)) {
                    visited.add(vPair);
                    queue.add(vPair);
                    int path = distTo.get(v) + 1;
                    distTo.put(edge.getPair(v), path);
                }
            }
        }
    }

    public void printDistances() {
        for (int i = 1; i <= graph.getVertices().size(); i++) {
            Vertice v = new Vertice(i);
            if (distTo.containsKey(v) && !v.equals(sourceVertice)) {
                System.out.print(calculateDistance(distTo.get(v)) + " ");
            }
        }
        System.out.println("");
    }

    private int calculateDistance(int path) {
        return (path > -1) ? path * EDGE_SIZE : -1;
    }

}
