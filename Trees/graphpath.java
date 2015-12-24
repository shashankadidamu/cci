//Given a graph, alg to fin out whether there is a root between two nodes

import java.util.*;
class graphstructure{
	int[][] adjmatrix;
	int rootnode =0;
	int nnodes;
	boolean[] visited;

	public graphstructure(int n){
		nnodes = n;
		adjmatrix = new int[nnodes][nnodes];
		visited= new boolean[nnodes];
	}

	public graphstructure(int[][] matrix){

		nnodes = matrix.length;
		adjmatrix = new int[nnodes][nnodes];
		visited = new boolean[nnodes];

		for(int i=0;i<nnodes;i++){
			for(int j=0;j<nnodes;j++){
				adjmatrix[i][j]= matrix[i][j];
			}
		}
	}

	public boolean bfs(int n1,int n2){
		Queue<Integer> q = new LinkedList<Integer>();

		q.add(n1);
		visited[n1]=true;
		int n,child;
		while(! q.isEmpty()){
			n = q.peek();

			child= getunvisitedchild(n);
			if(child==n2){
				return true;
			}
			else{
				if(child !=-1){
					q.add(child);
					visited[child]=true;
					//printnode(child);
				}
				else
					q.remove();
			}
		}
		clearvisited();
		return false;
	}

	int getunvisitedchild(int node){
		for(int j=0;j<nnodes;j++){
			if(adjmatrix[node][j]>0){
				if(!visited[j])
					return j;
			}
				
		}
		return -1;
	}

	void clearvisited(){
		for(int j=0;j<nnodes;j++){
			visited[j]=false;
		}
	}

	void printnode(int n){
		System.out.print("	"+n);
	}

}

public class graphpath{
	public static void main(String[] args)
   {
//                        0  1  2  3  4  5  6  7  8
// ===================================================
      int[][] conn = {  { 0, 0, 0, 1, 0, 0, 0, 0, 1 },  // 0
						{ 1, 0, 0, 0, 0, 0, 0, 1, 0 },  // 1
						{ 0, 0, 0, 1, 0, 1, 0, 1, 0 },  // 2
						{ 1, 0, 1, 0, 1, 0, 0, 0, 0 },  // 3
						{ 0, 0, 0, 1, 0, 0, 0, 0, 1 },  // 4
						{ 0, 0, 1, 0, 0, 0, 1, 0, 0 },  // 5
						{ 0, 0, 0, 0, 0, 1, 0, 0, 0 },  // 6
						{ 0, 0, 1, 0, 0, 0, 0, 0, 0 },  // 7
						{ 1, 0, 0, 0, 1, 0, 0, 0, 0 } };// 8


      graphstructure G = new graphstructure(conn);

      System.out.println(G.bfs(0,1));

   }
}