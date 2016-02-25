package pedrotoliveira.puzzles.hackerrank.algorithm.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Undirected Graph
 *
 * @author pedrotoliveira
 */
public class Graph {

    private final List<Vertice> vertices;
    private final Map<Vertice, Set<Edge>> adjMatrix;

    public Graph(int n, int m) {
        this.vertices = new ArrayList<>(n);
        this.adjMatrix = new HashMap<>(n);
    }

    public List<Vertice> getVertices() {
        return vertices;
    }

    public void addVertice(int value) {
        this.vertices.add(new Vertice(value));
    }

    public Vertice getVertice(int value) {
        for (Vertice v : vertices) {
            if (v.getValue() == value) {
                return v;
            }
        }
        return null;
    }

    public void addEdge(int v1, int v2) {
        Vertice vertice1 = getVertice(v1);
        Vertice vertice2 = getVertice(v2);
        Edge edge = new Edge(vertice1, vertice2);

        if (adjMatrix.containsKey(vertice1)) {
            adjMatrix.get(vertice1).add(edge);
        } else {
            Set<Edge> edgeSet = new HashSet<>(2);
            edgeSet.add(edge);
            adjMatrix.put(vertice1, edgeSet);
        }

        if (adjMatrix.containsKey(vertice2)) {
            adjMatrix.get(vertice2).add(edge);
        } else {
            Set<Edge> edgeSet = new HashSet<>(2);
            edgeSet.add(edge);
            adjMatrix.put(vertice2, edgeSet);
        }
    }

    public Set<Edge> getEdges(Vertice vertice) {
        Set<Edge> adjacents = new HashSet<>();
        if (adjMatrix.containsKey(vertice)) {
            adjacents.addAll(adjMatrix.get(vertice));
        }
        return adjacents;
    }

    public void printVertices() {
        System.out.println("Vertices: " + vertices);
    }

    public void printMatrix() {
        System.out.print("Matrix: ");
        adjMatrix.keySet().stream().forEach((v) -> {
            System.out.print("[" + v + "->" + String.valueOf(adjMatrix.get(v)) + "] ");
        });
        System.out.println("");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.vertices);
        hash = 29 * hash + Objects.hashCode(this.adjMatrix);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Graph other = (Graph) obj;
        if (!Objects.equals(this.vertices, other.vertices)) {
            return false;
        }
        if (!Objects.equals(this.adjMatrix, other.adjMatrix)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Graph{" + "vertices=" + vertices + ", adjMatrix=" + adjMatrix + '}';
    }
}
