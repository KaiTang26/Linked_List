package Main;

import firstGenerationList.LinkedList1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList1 list = new LinkedList1();
		
		list.addToStart("shit", 2);
		list.addToStart("food", 2);
		list.addToStart("drink", 2);
		list.addToStart("tims", 2);
		list.addToStart("coco", 2);
		list.addToStart("rice", 2);
		list.addToStart("shit", 10);
		
		list.printOutList();
		
		System.out.println(list.size());
		
		list.targetItem("shit");
		

	}

}
