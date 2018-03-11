package DLL;

import java.util.NoSuchElementException;

public class DoubleList {
	
	private class TwoWayNode{
		
		private String item;
		
		private TwoWayNode previous;
		
		private TwoWayNode next;

		public TwoWayNode(String item, TwoWayNode previous, TwoWayNode next) {
			super();
			this.item = item;
			this.previous = previous;
			this.next = next;
		}

		public TwoWayNode() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	}
	
	public class Doubleiterator{
		
		private TwoWayNode position ;

		
		public Doubleiterator() {
			super();
			// TODO Auto-generated constructor stub
			position = head;
		}



		public void reStart(){
			position = head;
		}
		
		
		
		public boolean hasNext(){
			return (position != null);
		}
		
		public String Next(){
			
			if(!hasNext()){
				throw new NoSuchElementException();
			}
			
			String toReturn = position.item;
			
			position = position.next;
			
			return toReturn;
			
		}
		
		public void deletNode(){
			position.previous.next = position.next;
			
			position.next.previous = position.previous;
			
			position = position.next;
		}
		
		public void addToHere(String a){
			
			TwoWayNode temp = new TwoWayNode(a, position.previous, position);
			
			position.previous.next = temp;
			
			position.previous = temp;
			
			
		}
		
		
	
		
	
	}
	
	private TwoWayNode head;

	public DoubleList() {
		super();
		// TODO Auto-generated constructor stub
		head = null;
	}

//	this method use to add new node into the start of the list
	public void addToStart(String item){
		
		TwoWayNode newHead = new TwoWayNode(item, null, head);
		
		if(head != null){		
			head.previous = newHead;
		}
		
		head = newHead;
	}
	
	public Doubleiterator iterator(){
		
		return new Doubleiterator();
		
	}
	
	public boolean headNullTest(){
		return (head != null);
	}
	
	
	
	
	
	
	
	

}
