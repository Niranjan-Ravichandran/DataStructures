package com.example.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import com.example.demo.Graph.Node;

public class GraphTest {
	private HashMap<Integer, Node> nodeLookUp = new HashMap<>();
	public class Node{
		private int data;
		Node(int data){
			this.data = data;
		}
		LinkedList<Node> adjacent = new LinkedList<>(); 
		
	}
	private Node getNode(int data) {
		return nodeLookUp.get(data);
	}
	private Node addNode(int data) {
		Node node = nodeLookUp.get(data);
		if(null == node) {
			node = new Node(data);
			nodeLookUp.put(data, node);
		}
		return node;
	}
	
	private void addEdge(int source, int destination) {
		Node sourceNode = nodeLookUp.get(source);
		Node destinationNode = nodeLookUp.get(destination);
		sourceNode.adjacent.add(destinationNode);
	}
	
	private boolean hasPathDFS(int source, int destination) {
		Node sourceNode = getNode(source);
		Node destinationNode = getNode(destination);
		HashSet<Integer> visited = new HashSet<>();
		return hasPathDFS(sourceNode, destinationNode, visited);
	}

	private boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited) {
		if (visited.contains(source.data)) {
			return false;
		}
		visited.add(source.data);
		if (source.data == destination.data) {
			return true;
		} else {
			for (Node node : source.adjacent) {
				if (hasPathBFS(node, destination)) {
					return true;
				}
			}
		}
		return false;
	}
	private boolean hasPathBFS(int source,int destination) {
		return hasPathBFS(getNode(source), getNode(destination));
	}
	private boolean hasPathBFS(Node source, Node destination) {
		LinkedList<Node> nextToVisit = new LinkedList<>();
		nextToVisit.add(source);
		while(!nextToVisit.isEmpty()) {
			Node node = nextToVisit.remove();
			if(node == destination) {
				return true;
			}
			for(Node n: node.adjacent) {
				nextToVisit.add(n);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		GraphTest graph = new GraphTest();
		graph.addNode(0);
		graph.addNode(1);
		graph.addNode(2);
		graph.addNode(3);
		graph.addNode(4);
		graph.addNode(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		//graph.addEdge(1, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		System.out.println(graph.hasPathDFS(1, 4));
		System.out.println(graph.hasPathBFS(1, 4));
	}
}
