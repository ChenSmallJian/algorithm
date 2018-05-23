// 表示图的边
public class GraphEdge {
	// 该边连接的左顶点
	private GraphNode leftNode;
	// 该边连接的右顶点
	private GraphNode rightNode;

	// 边的权值
	private int weight;
	// 该边是否被访问
	private boolean isVisited;

	public GraphEdge(GraphNode leftNode, GraphNode rightNode, int weight) {
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		this.weight = weight;
		isVisited = false;
	}

	public GraphNode getLeftNode() {
		return leftNode;
	}

	public GraphNode getRightNode() {
		return rightNode;
	}

	public int getWeight() {
		return weight;
	}

	public boolean isVisited() {
		return isVisited;
	}
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
}
