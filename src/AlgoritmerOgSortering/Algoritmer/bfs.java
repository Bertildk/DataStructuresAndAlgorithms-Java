package AlgoritmerOgSortering.Algoritmer;
import java.util.*;

import AlgoritmerOgSortering.Sorting.qs;
public class bfs {
    public static void main(String[] args) {
        bfs BFS =  new bfs();
        BFS.run();
    }
    public void run(){
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, List.of(1,2));
        graph.put(1, List.of(0,3,4));
        graph.put(2, List.of(0));
        graph.put(3, List.of(1));
        graph.put(4, List.of(1,5));
        graph.put(5, List.of(4));

        System.out.println("Shortest distance from 0 to 4 is " + bfs(graph, 0, 4));
        System.out.println("Prac begins");
        prac(graph, 0, 0);
    }
    public int bfs(Map<Integer, List<Integer>> graph, int start, int target){
        Queue<Integer> q =  new LinkedList<>();
        boolean[] marked = new boolean[graph.size()];
        int[] distances = new int[graph.size()];
        Map<Integer, Integer> parent = new HashMap<>();

        parent.put(start, null);
        marked[start] = true;
        q.add(start);
        distances[start] = 0;

        while(!q.isEmpty()){
            int current = q.poll();
            System.out.print(current + " ");

            if(current == target){
                System.out.println();
                Integer tmp = target;
                ArrayList<Integer> path = new ArrayList<>();
                while(tmp != null){
                    path.add(0, tmp);
                    tmp = parent.get(tmp);
                }
                for (Integer val : path) {
                    System.out.print(val + " - ");                    
                }
                return distances[target];
            }

            for (Integer neighboor : graph.get(current)) {
                if(!marked[neighboor]){
                    distances[neighboor] = distances[current] + 1;
                    parent.put(neighboor, current);
                    marked[neighboor] = true;
                    q.add(neighboor);
                }
            }
        }
        System.out.println();
        return distances[target];
    }
















        public int prac(Map<Integer, List<Integer>> graph, int start, int target){
            boolean[] marked = new boolean[graph.size()];
            marked[start] = true;
            Queue<Integer> q = new LinkedList<>();
            q.add(start);

            while(!q.isEmpty()){
                int current = q.poll();
                System.out.print(current + " ");
                for (Integer integer : graph.get(current)) {
                   if(!marked[integer]){
                    marked[integer] = true;
                    q.add(integer);
                   } 
                }
            }
            return 1;
        }
        public int pracDFS(Map<Integer, List<Integer>> graph, int index){
            if(graph.get(index) == null) return;
        }

}
