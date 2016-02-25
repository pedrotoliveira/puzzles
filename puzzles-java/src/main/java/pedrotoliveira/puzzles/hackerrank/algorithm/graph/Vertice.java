package pedrotoliveira.puzzles.hackerrank.algorithm.graph;

/**
 * Graph Vertice
 * 
 * @author pedrotoliveira
 */
public class Vertice implements Comparable<Vertice> {
    
    private final int value;
    
    public Vertice(int value) {
        this.value = value;
    }
        
    public int getValue() {
        return value;     
    }
    
    @Override
    public int hashCode() {
        int prime = 7;
        return prime * value + value;
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
        return this.value == ((Vertice)obj).value;
    }
    
    @Override
    public String toString() {
        return "V=" + value;   
    }
    
    @Override
    public int compareTo(Vertice o) {
        return this.getValue() == o.getValue() ? 0 : this.getValue() - o.getValue();   
    }    
}
