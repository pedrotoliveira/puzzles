package pedrotoliveira.puzzles.hackerrank.algorithm.graph;

/**
 *
 * Graph Edge
 *
 * @author pedrotoliveira
 */
public class Edge {

    private final String label;
    private final Vertice v1;
    private final Vertice v2;

    public Edge(Vertice v1, Vertice v2) {
        this.label = v1.getValue() + "-" + v2.getValue();
        this.v1 = v1;
        this.v2 = v2;
    }

    public Vertice getV1() {
        return v1;
    }

    public Vertice getV2() {
        return v2;
    }

    public Vertice getPair(Vertice v) {
        return (v1.equals(v)) ? v2 : v1;
    }

    @Override
    public int hashCode() {
        int prime = 7;
        return prime * label.hashCode();
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
        return this.label.equals(((Edge) obj).label);
    }

    @Override
    public String toString() {
        return "E=" + label;
    }

}
