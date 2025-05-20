import java.util.*;

public class Vertex {

    private String name;
    private boolean visited;
    private List<Vertex> neighborList;

    public Vertex(String name) {
        this.name = name;
        visited = false;
        neighborList = new ArrayList<>();
    }

    /*
     * Returns visited
     */
    public boolean isVisited() {
        return visited;
    }

    /*
     * Sets visited to the given value
     */
    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    /*
     * Adds the given Vertex object to neighborList 
     */
    public void addNeighbor(Vertex vertex) {
        neighborList.add(vertex);
    }

    /*
     * Returns the neighborList List
     */
    public List<Vertex> getNeighborList() {
        return neighborList;
    }

    /*
     * Returns a string representation of the vertex 
     */
    public String toString() {
        return this.name;
    }
}
