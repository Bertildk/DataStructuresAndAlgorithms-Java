package AlgoritmerOgSortering.Algoritmer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.LinkedList;

public class DepthFirstSearch {
    Map<Integer, List<Integer>> graph;

    public static void main(String[] args) {
        DepthFirstSearch app = new DepthFirstSearch();
        app.run();

    }

    public void run(){
        graph =  new HashMap<>();
        
        graph.put(0, List.of(1,2));
        graph.put(1, List.of(0,3,4));
        graph.put(2, List.of(0));
        graph.put(3, List.of(1));
        graph.put(4, List.of(1,5));
        graph.put(5, List.of(4));
        dfsRecursive(graph, 0);
    }

    public void dfs(Map<Integer, List<Integer>> graph, int start){
        boolean marked[] = new boolean[graph.size()]; // boolean array to indicate if a verticle has been seen
        Stack<Integer> stack = new Stack<>();
   
        marked[start] = true;
        stack.push(start);

        while(!stack.isEmpty()){
            int current = stack.pop();
            System.out.print(current + " ");

            for(int neighbor : graph.get(current)){
                if(!marked[neighbor]){
                    marked[neighbor] = true;
                    stack.push(neighbor);
                }
            }

        }
    } // 0 2 1 4 5 3 
    public void dfsRecursive(Map<Integer, List<Integer>> graph, int current){
        boolean marked[] = new boolean[graph.size()];
        dfsRecursiveHelper(graph, current, marked);
    }
    public void dfsRecursiveHelper(Map<Integer, List<Integer>> graph, int current, boolean marked[]){
        if(marked[current]) return;

        marked[current] = true;
        System.out.print(current + " ");

        for (Integer neighboor : graph.get(current)) {
            dfsRecursiveHelper(graph, neighboor, marked);
        }
    }

}
