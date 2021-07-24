package org.graph;

import java.util.Scanner;

//Procedure :
//Take 'n' no. of nodes .
//visit all node (vertex)
//find minDistance vertex ,let u
//for every neighbor of u visit all distance
//distance = dist(u) + (u-neigh)
//if current dist < neigh dist
//update
public class DijkstraAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of vertex :-");
        int v = sc.nextInt();
        System.out.println("Enter the no. of edges :-");
        int e = sc.nextInt();

        int adjacencyMatrix[][] = new int[v][v];
        System.out.println("Enter the weight of each vertex : [vertex] [weight] [neighbourVertex]");
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            adjacencyMatrix[v1][v2] = weight;
//            adjacencyMatrix[v2][v1] = weight;

        }
        dijkstra(adjacencyMatrix);
    }

    private static void dijkstra(int[][] adjacencyMatrix) {
        int v = adjacencyMatrix.length;
        boolean visited[] = new boolean[v];
        int distance[] = new int[v];
        distance[0] = 0;
        for (int i = 1; i < v; i++) {
            distance[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < v; i++) {
            //find vertex with min-distance
            int minVertex = findMinVertex(distance, visited);
            visited[minVertex] = true;
            //exploring neighbors
            for (int j = 0; i < v; j++) {
                if (adjacencyMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE) {
                    int newDistance = distance[minVertex] + adjacencyMatrix[minVertex][j];
                    if (newDistance < distance[j]) {
                        distance[j] = newDistance;
                    }
                }
            }
        }
        // print
        for (int i = 0; i < v; i++) {
            System.out.println(i + " " + distance[i]);
        }
    }

    private static int findMinVertex(int[] distance, boolean[] visited) {
        int minVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
                minVertex = i;
            }
        }
        return minVertex;
    }
}
