class Solution {
    // Map original node → cloned node
    private Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        // If already cloned, return from map
        if (map.containsKey(node)) {
            return map.get(node);
        }

        // Create clone (new node with same value)
        Node clone = new Node(node.val, new ArrayList<>());

        // Store in map to avoid infinite loops
        map.put(node, clone);

        // DFS on neighbors
        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }

        return clone;
    }
}
