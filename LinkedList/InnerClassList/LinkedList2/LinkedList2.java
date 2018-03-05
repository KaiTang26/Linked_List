package LinkedList2;

public class LinkedList2 {
	
//	innter class Node can only be accessed by instance of LinkedList2 and class of LinkedList2
	
	private class Node{
		private String item;
		private Node list;
		
		public Node() {
			super();
			// TODO Auto-generated constructor stub
			item = null;
			list = null;
		}

		public Node(String item, Node list) {
			super();
			this.item = item;
			this.list = list;
		}
	}

	private Node head;

	public LinkedList2() {
		super();
		// TODO Auto-generated constructor stub
		head = null;
	}
	
	public void addToStart(String item){
		head = new Node(item, head);
	}
	
	public void deleteHeadNode(){
		head = head.list;
	}
	
	public void outPut(){
		
		Node position = head;
		while(position != null){
			System.out.println("item: "+position.item);
			position = position.list;
		}
	}
	
	


}
