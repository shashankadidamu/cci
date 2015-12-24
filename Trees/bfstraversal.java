import java.util.*;
class graphstructure{
		
	int[][] adjmatrix;
	int rootnode =0;
	int nnodes;
	boolean[] visited;

	graphstructure(int n){
		nnodes = n;
		adjmatrix = new int[n][n];
		visited= new boolean[n];
	}

	graphstructure(int[][] matrix){
		nnodes= matrix.length;
		adjmatrix = new int[nnodes][nnodes];
		visited = new boolean[nnodes];
		for(int i=0;i<nnodes;i++){
			for(int j=0;j<nnodes;j++){
				adjmatrix[i][j]= matrix[i][j];
			}
		}
	}

	public void bfs(){
		Queue<Integer> q= new LinkedList<Integer>();

		q.add(rootnode);
		visited[rootnode]=true;
		printnode(rootnode);

		while(! q.isEmpty()){
			int n,child;
			n=q.peek();

			child=getunvisitedchildnode(n);

			if(child!=-1){
				visited[child]=true;
				printnode(child);
				q.add(child);
			}
			else
				q.remove(	);
		}

		clearvisited();
	}

	int getunvisitedchildnode(int node){
		
		for(int j=0;j<nnodes;j++){
			if(adjmatrix[node][j]>0){
				if(! visited[j])
					return j;
			}
		}
		return -1;
	}

	void clearvisited(){
		for(int j=0;j<nnodes;j++)
			visited[j]=false;
	}

	void printnode(int n){
		System.out.print("	"+n);
	}
}

public class bfstraversal{
	public static void main(String[] args)
   {
//                        0  1  2  3  4  5  6  7  8
// ===================================================
      int[][] conn = {  { 0, 1, 0, 1, 0, 0, 0, 0, 1 },  // 0
			{ 1, 0, 0, 0, 0, 0, 0, 1, 0 },  // 1
			{ 0, 0, 0, 1, 0, 1, 0, 1, 0 },  // 2
			{ 1, 0, 1, 0, 1, 0, 0, 0, 0 },  // 3
			{ 0, 0, 0, 1, 0, 0, 0, 0, 1 },  // 4
			{ 0, 0, 1, 0, 0, 0, 1, 0, 0 },  // 5
			{ 0, 0, 0, 0, 0, 1, 0, 0, 0 },  // 6
			{ 0, 1, 1, 0, 0, 0, 0, 0, 0 },  // 7
			{ 1, 0, 0, 0, 1, 0, 0, 0, 0 } };// 8


      graphstructure G = new graphstructure(conn);

      G.bfs();

   }
}

