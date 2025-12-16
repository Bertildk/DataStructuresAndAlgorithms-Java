package AlgoritmerOgSortering.Algoritmer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;


public class BreadthFirstSearch {
    Map<Integer, List<Integer>> graph;

    public static void main(String[] args) {
        BreadthFirstSearch app = new BreadthFirstSearch();
        app.run();

    }
    /** BFS - Is a graph traversal algorithm that searches a graph level by level from a chosen node
    Common use cases
    Shortest path from A to B
    Locating specific Vertex
    Measure distance from A to B
    Checking connectivity: "can I reach Verticle B from A?"
    Detecting Cycles in graphs

    **/
    public void run(){
        graph =  new HashMap<>();
        
        graph.put(0, List.of(1,2));
        graph.put(1, List.of(0,3,4));
        graph.put(2, List.of(0));
        graph.put(3, List.of(1));
        graph.put(4, List.of(1,5));
        graph.put(5, List.of(4));

        bfs(graph, 0);
        int start = 0, target = 5;
        int distance = DistanceBFS(graph, start, target);
        System.out.println("Distance from " + start + " to " + target + " = " + distance);

        LevelOrderTraversalbfs(graph, 0);

        Map<String, List<String>> graf = new HashMap<>();
        graf.put("Alice", List.of("Bob", "Charlie"));
        graf.put("Bob", List.of("Alice", "Diana", "Eva"));
        graf.put("Charlie", List.of("Alice"));
        graf.put("Diana", List.of("Bob", "Frank"));
        graf.put("Eva", List.of("Bob"));
        graf.put("Frank", List.of("Diana"));
        for (String person : FriendNetworkBFS(graf, "Alice", "Frank")) {
            System.out.print(person + " - ");
        }
    }
    /*
    What BFS wants:

    Visit start node

    Visit all neighbors

    Then neighbors of neighbors

    And so on…
     */
    public void bfs(Map<Integer, List<Integer>> graph, int start){
        boolean marked[] = new boolean[graph.size()];
        Queue<Integer> q = new LinkedList<>();

        marked[start] = true;
        q.add(start);

        while(!q.isEmpty()){
            int current = q.poll();
            System.out.print(current + " ");
            for (Integer neighboor : graph.get(current)) {
                if(!marked[neighboor]){
                    marked[neighboor] = true;
                    q.add(neighboor);
                }
            }

        }
        System.out.println();
    }

    public int DistanceBFS(Map<Integer, List<Integer>> graph, int start, int target){
        boolean marked[] = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();
        int distance[] = new int[graph.size()];
        Arrays.fill(distance, -1);

        distance[start] = 0;
        marked[start] = true;
        queue.add(start);

        while(!queue.isEmpty()){
            int current = queue.poll();

            for(int neighbor : graph.get(current)){
                if(!marked[neighbor]){
                    marked[neighbor] = true;
                    distance[neighbor] = distance[current] + 1;
                    queue.add(neighbor);
                }
            }
        }

        return distance[target];
    }
    public void LevelOrderTraversalbfs(Map<Integer, List<Integer>> graph, int start){
        boolean marked[] = new boolean[graph.size()];
        Queue<Integer> q = new LinkedList<>();

        marked[start] = true;
        q.add(start);
        int level = 0;

        while(!q.isEmpty()){
            int levelSize = q.size();
            System.out.print("Level : " + level + " : ");

            for (int i = 0; i < levelSize; i++) {
                int current = q.poll();
                System.out.print(current + " ");
                for (Integer neighbor : graph.get(current)) {
                    if(!marked[neighbor]){
                        marked[neighbor] = true;
                        q.add(neighbor);
                    }
                }     
            }
            System.out.println();
            level++;

        }

    }

   public ArrayList<String> FriendNetworkBFS(Map<String, List<String>> graph, String start, String target){
        Set<String> marked = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> parent = new HashMap<>();

        distances.put(start, 0);
        marked.add(start);
        q.add(start);

        while(!q.isEmpty()){
            String current = q.poll();
            if(current.equals(target)){
                ArrayList<String> path = new ArrayList<>();
                String tmp =  target;
                while(tmp != null){
                    path.add(0, tmp); // adds from start instead of at end so path returns coprrectly. 
                    tmp = parent.get(tmp);

                }
                return path;
            }
            //for (initialization; condition; update) 

            for (String friend : graph.get(current)) {
                if(!marked.contains(friend)){
                    distances.put(friend, distances.get(current) + 1);
                    parent.put(friend, current);

                    marked.add(friend);
                    q.add(friend);
                }
            }
        }
        System.out.println(distances.get(target));
        System.out.println();
        return null;
   }

}
