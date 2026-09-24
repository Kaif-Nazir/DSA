package Graph;

import java.util.*;

public class Graph {

    public static void main(String[] args) {

    }
    // Bipartite ->Simple need array color to -1 and check whether it was colored or not
    public boolean isBipartite(int[][] graph) {

        int n = graph.length;
        int colors[] = new int[n];
        Arrays.fill(colors , -1);

        for(int ind = 0 ; ind < n ; ind++){

            if(colors[ind] == -1){
                if(!biPardfs(graph , ind , colors , 0))
                    return false;
            }
        }
        return true;
    }
    boolean biPardfs(int graph[][] , int ind , int colors[] , int color){

        colors[ind] = color;

        for(int conn : graph[ind]){
            if(colors[conn]  == -1){
                if(!biPardfs(graph , conn , colors , 1-colors[ind]))
                    return false;
            }else if(colors[conn] == colors[ind]){
                return false;
            }
        }
        return true;
    }
    public boolean isBipartiteBFS(int[][] graph) {

        Queue<Integer> nodes = new ArrayDeque<>();
        int n = graph.length;
        int colors[] = new int[n];
        Arrays.fill(colors , -1);

        for(int ind = 0 ; ind < n ; ind++){

            if(colors[ind] != -1)
                continue;

            colors[ind] = 0;
            nodes.offer(ind);
            while(!nodes.isEmpty()){

                int currNode = nodes.poll();

                for(int conn : graph[currNode]){

                    if(colors[conn] == -1){
                        colors[conn] = 1-colors[currNode];
                        nodes.offer(conn);
                    }
                    else{
                        if(colors[conn] == colors[currNode])
                            return false;
                    }
                }
            }
        }
        return true;
    }

    // Undirected Graph BFS -> Have to Check Parent to know if it was visited or not
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        boolean vis[] = new boolean[V];

        List<List<Integer>> nodes = new ArrayList<>();

        for(int ind = 0 ; ind < V ; ind++)
            nodes.add(new ArrayList<>());

        for(int ind = 0 ; ind < edges.length ; ind++){
            nodes.get(edges[ind][0]).add(edges[ind][1]);
            nodes.get(edges[ind][1]).add(edges[ind][0]);
        }

        for(int ind = 0 ; ind < V ; ind++){
            if(!vis[ind]){
                if(undirectedGraphBFS(nodes , vis , ind))
                    return true;
            }
        }
        return false;
    }
    boolean undirectedGraphBFS(List<List<Integer>> allNodes , boolean vis[] , int node){


        Queue<int[]> nodes = new ArrayDeque<>();

        nodes.offer(new int[]{node , -1});

        while(!nodes.isEmpty()){

            vis[nodes.peek()[0]] = true;
            int currNode = nodes.peek()[0];
            int parent = nodes.peek()[1];

            for(int connNode : allNodes.get(currNode)){
                if(!vis[connNode]){
                    nodes.offer(new int[]{connNode , currNode});
                }
                else if(connNode != parent){
                    return true;
                }
            }
            nodes.poll();
        }
        return false;
    }
    boolean dfs(List<List<Integer>> allNodes , boolean vis[] ,int node , int parent){

        vis[node] = true;

        for(int connNode : allNodes.get(node)){
            if(!vis[connNode]){
                if(dfs(allNodes , vis , connNode , node))
                    return true;
            }
            else if(connNode != parent){
                return true;
            }
        }
        return false;
    }
    // Directed Graph -> DFS ,  Have PathVis and Vis and mark and unmark PathVis when returning
    public boolean isCyclicDirected(int V, int[][] edges) {
        // code here

        List<List<Integer>> nodes = new ArrayList<>();

        for(int ind = 0 ; ind < V ; ind++)
            nodes.add(new ArrayList<>());

        for(int ind = 0 ; ind < edges.length ; ind++)
            nodes.get(edges[ind][0]).add(edges[ind][1]);

        boolean vis[] = new boolean[V];
        boolean pathVis[] = new boolean[V];

        for(int ind = 0 ; ind < V ; ind++){
            if(!vis[ind]){
                if(directedCycleDFS(nodes , vis , pathVis , ind ))
                    return true;
            }
        }
        return false;

    }
    boolean directedCycleDFS(List<List<Integer>> nodes , boolean vis[] , boolean pathVis[] , int node){

        vis[node] = true;
        pathVis[node] = true;

        for(int connNode : nodes.get(node)){

            if(!vis[connNode]){
                if(directedCycleDFS(nodes , vis , pathVis , connNode))
                    return true;
            }
            else if(pathVis[connNode])
                return true;
        }
        pathVis[node] = false;
        return false;
    }

    // Topologial Sort DFS-> Linear Ordering only on DAG . DFS
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here

        boolean vis[] = new boolean[V];
        Stack<Integer> val = new Stack<>();

        List<List<Integer>> adjList = new ArrayList<>();

        for(int ind = 0 ; ind < V ; ind++){
            adjList.add(new ArrayList<>());
        }
        for(int ind = 0 ; ind < edges.length ; ind++){
            adjList.get(edges[ind][0]).add(edges[ind][1]);
        }

        for(int ind = 0 ; ind < V ; ind++){
            if(!vis[ind])
                topoDFS(vis , adjList , ind , val);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!val.isEmpty())
            ans.add(val.pop());

        return ans;
    }
    void topoDFS(boolean vis[] , List<List<Integer>> adjList , int node , Stack<Integer> val){

        vis[node] = true;
        for(int ind = 0 ; ind < adjList.get(node).size() ; ind++){
            if(!vis[adjList.get(node).get(ind)]){
                topoDFS(vis , adjList , adjList.get(node).get(ind) , val);
            }
        }
        val.push(node);
    }

    // Topologial Sort BFS (KAHN )-> Linear Ordering only on DAG
    public ArrayList<Integer> topoSortKahn(int V, int[][] edges) {
        // code here

        List<List<Integer>> adjList = new ArrayList<>();
        int indegree[] = new int[V];
        ArrayList<Integer> ans = new ArrayList<>();

        for(int ind = 0 ; ind < V ; ind++){
            adjList.add(new ArrayList<>());
        }
        for(int ind = 0 ; ind < edges.length ; ind++){
            adjList.get(edges[ind][0]).add(edges[ind][1]);
            indegree[edges[ind][1]]++;
        }

        kahnAlgo(adjList ,indegree, ans);
        return ans;
    }
    void kahnAlgo(List<List<Integer>> adjList ,int [] indegree , ArrayList<Integer> ans){


        Queue<Integer> nodes = new ArrayDeque<>();

        for(int ind = 0 ; ind < adjList.size() ; ind++)
            if(indegree[ind] == 0)
                nodes.offer(ind);

        while(!nodes.isEmpty()){

            int currNode = nodes.poll();

            for(int node : adjList.get(currNode)){

                indegree[node]--;

                if(indegree[node] == 0)
                    nodes.offer(node);

            }
            ans.add(currNode);
        }
    }



}
