import java.util.ArrayList;
import java.util.List;

public class MyGraph {
	public static void main(String[] args) {
		GraphNode A = new GraphNode("A");
		GraphNode B = new GraphNode("B");
		GraphNode C = new GraphNode("C");
		GraphNode D = new GraphNode("D");
		GraphNode E = new GraphNode("E");
		GraphEdge AB = new GraphEdge(A, B, 2);
		GraphEdge AC = new GraphEdge(A, C, 4);
		GraphEdge AD = new GraphEdge(A, D, 2);
		GraphEdge BC = new GraphEdge(B, C, 3);
		GraphEdge CD = new GraphEdge(C, D, 3);
		GraphEdge BE = new GraphEdge(B, E, 3);
		GraphEdge CE = new GraphEdge(C, E, 4);
		GraphEdge DE = new GraphEdge(D, E, 5);
		A.getEdgeList().add(AB);
		A.getEdgeList().add(AC);
		A.getEdgeList().add(AD);
		B.getEdgeList().add(AB);
		B.getEdgeList().add(BC);
		B.getEdgeList().add(BE);
		C.getEdgeList().add(AC);
		C.getEdgeList().add(BC);
		C.getEdgeList().add(CD);
		C.getEdgeList().add(CE);
		D.getEdgeList().add(AD);
		D.getEdgeList().add(CD);
		D.getEdgeList().add(DE);
		E.getEdgeList().add(BE);
		E.getEdgeList().add(CE);
		E.getEdgeList().add(DE);

		List<GraphNode> nodes = new ArrayList<>();
		nodes.add(A);
		A.setVisited(true);
		prim(nodes, 5);
		System.out.println(sum);
	}

	static int sum = 0;

	static void prim(List<GraphNode> nodes, int size) {
		if (nodes.size() == size)
			return;
		int tmp = Integer.MAX_VALUE;
		int x = -1, y = -1;
		for (int i = 0; i < nodes.size(); i++) {
			List<GraphEdge> edges = nodes.get(i).getEdgeList();
			for (int j = 0; j < edges.size(); j++) {
				GraphEdge ge = edges.get(j);
				if (ge.isVisited() == true)
					continue;
				if (ge.getWeight() <= tmp) {
					tmp = ge.getWeight();
					x = i;
					y = j;
				}
			}
		}
		GraphEdge ge = nodes.get(x).getEdgeList().get(y);
		ge.setVisited(true);
		sum += ge.getWeight();
		if (!ge.getLeftNode().isVisited()) {
			nodes.add(ge.getLeftNode());
			ge.getLeftNode().setVisited(true);
		}
		if (!ge.getRightNode().isVisited()) {
			nodes.add(ge.getRightNode());
			ge.getRightNode().setVisited(true);
		}
		prim(nodes, size);
	}
}