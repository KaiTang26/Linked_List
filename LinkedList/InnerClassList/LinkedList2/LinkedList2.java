package LinkedList2;

import java.util.NoSuchElementException;

public class LinkedList2 {
	
//	Inner class Node can only be accessed by instance of LinkedList2 and class of LinkedList2
	
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
	
	public class List2Iterator{
		private Node position;
		
		private Node previous;

		public List2Iterator() {
			super();
			// TODO Auto-generated constructor stub
			position = head;
			
			previous = null;
		}
		
		public void restart(){
			position = head;
			previous = null;
		}
		
		public boolean hasNext(){
			return (position != null);
		}
		
		public String next(){
			if(! hasNext()){	
				throw new NoSuchElementException();
			}
			
			String toReturn = position.item;
			
			previous = position;
			
			position = position.list;
			
			return toReturn;
			
		}
		
		public void addHere(String input){
			if(position != null && previous != null ){
				Node temp = new Node(input, position);
				previous.list = temp;
				previous = temp;
			}else if(position == null && previous != null){
				
				previous.list = new Node(input, position);
				previous = previous.list;
				
			}else{
				LinkedList2.this.addToStart(input);
			}
		}
		
		public void changeHere(String input){
			if(position == null){
				throw new IllegalStateException();
			}else{
				position.item = input;
			}
		}
		
		public void deleteNode(){
			if(position != null && position.list !=null ){
				previous.list = position.list;
				position = position.list;
				
			}else if(position == null){
				throw new IllegalStateException();
				
			}else if(previous == null){
				head = head.list;
				position = head;
			}
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
	
	public List2Iterator Iterator(){
		
		return new List2Iterator();
	}
	
	
	
	


}
