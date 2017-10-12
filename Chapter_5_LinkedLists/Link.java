package Chapter_5_LinkedLists;


public class Link{
	public int iData;
	public double dData;
	public Link next;
	
	public Link(int id, double dd){
		iData = id;
		dData = dd;
	}
	
	public void displayLink(){
		System.out.print("{" + iData + ", " + dData + "} ");
	}
	
	
}

//public class Link{
//	public int iData;
//	public long dData;
//	public Link next;
//	
//	public Link(int id, long dd){
//		iData = id;
//		dData = dd;
//		
//	}
//	
//	public void displayLink(){
//		System.out.print("{" + iData + ", " + dData + "} ");		
//	}
//}