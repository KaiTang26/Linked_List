package GenericLinkedList;

public class LinkedList3<T> {
	
	private class Node<T>{
		
		private T data;
		private Node list;
		
		public Node(T data, Node list) {
			super();
			this.data = data;
			this.list = list;
		}

		public Node() {
			super();
			// TODO Auto-generated constructor stub
			data = null;
			list = null;
		}

		

		public void setData(T data) {
			this.data = data;
		}
		
		
			
	}
	
	private Node<T> head;

	public LinkedList3() {
		super();
		// TODO Auto-generated constructor stub
		head = null;
	}
	
	public void addItem(T data){
		head = new Node<T>(data, head);
	}
	
	public void setFirstNode(T data){
		
		head.setData(data);
		
	}
	
	public void outPut(){
		Node<T> position = head;
		
		while(position != null){
			System.out.println(position.data);
			position = position.list;
		}
		
	}
	
	public LinkedList3(LinkedList3<T> otherlist){
		if(otherlist == null){
			throw new NullPointerException();
		}else if(otherlist.head == null){
			head = null;
		}else{
			head = copyOf(otherlist.head);
		}
		
	}
	
//	private Node<T> copyOf(Node<T> ohterhead){
//		
//		Node<T> position = ohterhead;
//		
//		Node<T> newHead;
//		
//		Node<T> end = null;
//		
//		newHead = new Node<T>(position.data, null);
//		
//		end = newHead;
//		
//		position = position.list;
//		
//		while(position != null){
//			
//			end.list = new Node<T>(position.data, null);
//			
//			end = end.list;
//			
//			position = position.list;
//			
//		}
//		
//		return newHead;
//		
//		
//	}
	
	private Node<T> copyOf(Node<T> head){
		
		Node<T> newHead;
		
		Node<T> end;
		
		Node<T> position = head;
		
		newHead = new Node<T>(position.data, null);
		
		end = newHead;
		
		position = position.list;
		
		while(position != null){
			
			end.list = new Node<T>(position.data, null);
			
			end = end.list;
			
			position = position.list;
			
		}
		
		return newHead;
		
		
		
	}
	
	
	

}
