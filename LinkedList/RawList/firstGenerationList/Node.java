package firstGenerationList;

public class Node {
	
	private String item;
	
	private int quantity;
	
	private Node list;

	public Node() {
		super();
		// TODO Auto-generated constructor stub
		item = null;
		quantity = 0;
		list = null;
	}

	public Node(String item, int quantity, Node list) {
		super();
		this.item = item;
		this.quantity = quantity;
		this.list = list;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Node getList() {
		return list;
	}

	public void setList(Node list) {
		this.list = list;
	}
	
	
	
	

}
