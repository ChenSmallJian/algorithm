import java.util.ArrayList;
import java.util.List;

//表示图的顶点
public class GraphNode {
	// 表示该顶点的数据
	private String data;
	// 表示该顶点的边集合
	public List<GraphEdge> nodeList = null;
	// 表示该顶点是否被访问过
	private boolean isVisited;

	public GraphNode(String data) {
		this.data = data;
		isVisited = false;
		if (nodeList == null) {
			nodeList = new ArrayList<>();
		}
	}

	public String getData() {
		return data;
	}

	public List<GraphEdge> getEdgeList() {
		return nodeList;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public boolean isVisited() {
		return isVisited;
	}
}
