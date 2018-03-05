package firstGenerationList;

public class LinkedList1 {
	
	private Node head;

	public LinkedList1() {
		super();
		// TODO Auto-generated constructor stub
		head = null;
	}
	
	public void addToStart(String item, int quantity) {
		// TODO Auto-generated constructor stub
		head = new Node(item, quantity, head);
	}
	
	public void printOutList(){
		
		Node position = head;
		
		while(position != null){
			
		System.out.println("item: "+position.getItem()+" & quantity: "+position.getQuantity());
		
		position = position.getList();
			
		}
	}
	
	public int size(){
		int count =0;
		
		Node position = head;
		
		while(position != null){
			
			count++;
			
			position = position.getList();
			
		}
		
		return count;
	}
	
	
	public void targetItem(String item){
		
		Node position = head;
		
		while(position != null){
			
			if(position.getItem().equals(item)){
				
				System.out.println("item: "+position.getItem()+" & quantity: "+position.getQuantity());
			}
				
			position = position.getList();
			
		}
		
	}
	
	public void deleteHeadNode(){
		
		head = head.getList();
	}
	
	
	
	

}
