package Chapter_13_Graphs;

public class Graph {
	
	private final int MAX_VERTICES = 20;
	private Vertex[] vertexList;
	private int[][] adjMatrrix;
	private int nVertices;
	private StackX theStack;
	private Queue theQueue;
	
	public Graph(){
		vertexList = new Vertex[MAX_VERTICES];
		adjMatrrix = new int[MAX_VERTICES][MAX_VERTICES];
		nVertices = 0;
		
		//fill the adjMatrix with zeros
		for(int i = 0; i < MAX_VERTICES; i++){
			for(int j = 0; j < MAX_VERTICES; j++){
				adjMatrrix[i][j] = 0;
			}
		}
		
		//make the stack
		theStack = new StackX();
		theQueue = new Queue();
	}
	
	//create a new vertex and all it to the vertex list
	public void addVertex(char lab){
		Vertex newVertex = new Vertex(lab);
		vertexList[nVertices++]  = newVertex;
	}
	
	//add edge using the matrix
	public void addEdge(int start, int end){
		adjMatrrix[start][end] = 1;
		adjMatrrix[end][start] = 1;
	}
	
	//display the value of the vertex at the required vertex 
	public void displayVertex(int v){
		System.out.print(vertexList[v].label);
	}
	
	
	public int getAdjacentUnvisitedVertex(int  v)
	{
			for(int j=0; j<nVertices; j++){
				if(adjMatrrix[v][j]==1 && vertexList[j].wasVisited==false){
				return j;
			}
		}	
		
		return -1;
	}
	
	//depth-first search for the graph
	public void dfs(){
		//begin at the vertex zero and mark it true for visited
		vertexList[0].wasVisited = true;
		displayVertex(0); // display the vertex
		theStack.push(0); // push it on to the stack
		
		while(!theStack.isEmpty()){
			//get an unvisited vertex to the top of the stack
			
			int v = getAdjacentUnvisitedVertex(theStack.peek());
			
			if(v == -1){
				theStack.pop();
			}else{
				vertexList[v].wasVisited = true;
				displayVertex(v); // display the vertex
				theStack.push(v); // push it on to the stack
			}
		}//end of the loop
		
		//reset the flags
		for(int i = 0; i < nVertices; i++){
			vertexList[i].wasVisited = false;
		}
		
	}//end dfs
	
	//using breadth-first search for the graph
	public void bfs(){
		//begin at the vertex and make it true indicating that you have visited it
		vertexList[0].wasVisited = true;
		displayVertex(0);
		theQueue.enQueue(0);
		
		int v2;
		
		while(!theQueue.isEmpty()){
			int v1 = theQueue.deQueue(); // deQueue the first form the queue
			while((v2 = getAdjacentUnvisitedVertex(v1)) != -1){
				//perform the stuff above
				vertexList[v2].wasVisited = true;
				displayVertex(v2);
				theQueue.enQueue(v2);
			}
		}
		
		//new once the while loop exits the reset the flags of the vertices
		for(int i = 0; i < nVertices; i++){
			vertexList[i].wasVisited = false;
		}
		
	}
	
	//minimum spanning tree using depth-first search for the graph, we need to make few cahnges 
	public void mst(){
		//begin at the vertex zero and mark it true for visited
		vertexList[0].wasVisited = true;
		//displayVertex(0); // display the vertex
		theStack.push(0); // push it on to the stack
		
		while(!theStack.isEmpty()){
			//get an unvisited vertex to the top of the stack
			int currentVertex = theStack.peek(); //added to display the minimum spanning tree
			int v = getAdjacentUnvisitedVertex(theStack.peek());
			
			if(v == -1){
				theStack.pop();
			}else{
				vertexList[v].wasVisited = true;
				theStack.push(v); // push it on to the stack
				
				displayVertex(currentVertex); //added to display the minimum spanning tree
				displayVertex(v); // display the vertex
				System.out.print(" ");
				
			}
		}//end of the loop
		
		//reset the flags
		for(int i = 0; i < nVertices; i++){
			vertexList[i].wasVisited = false;
		}
	}//end mst
}
