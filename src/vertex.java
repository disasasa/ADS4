import java.util.*;

public class WeightedGraph<Vertex> {
    private Vertex data;
    private Map<WeightedGraph<Vertex>, Double> adjacentVertices;

    public void addAdjacentVertex(WeightedGraph<Vertex> destination, double weight){
        adjacentVertices.put(destination,weight);
    }

    public WeightedGraph(Vertex data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>();
    }
    public Vertex getData() {
        return data;
    }

    public void setData(Vertex data) {
        this.data = data;
    }

    public Map<WeightedGraph<Vertex>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        WeightedGraph<?> vertex = (WeightedGraph<?>) object;
        return Objects.equals(data, vertex.data) && Objects.equals(adjacentVertices, vertex.adjacentVertices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, adjacentVertices);
    }
}