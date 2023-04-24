package nivell1;

import java.util.ArrayList;

public class Undo {
	
	private static Undo instance;
	private static ArrayList<String> orders=new ArrayList<String>();
	
	private Undo() {
		
	}
	
	public static Undo getInstance	() {
		
		if(instance ==null) {
			return instance=new Undo();
		}
		return instance;
	}
	
	public void addInstance(String order) {
		
		orders.add(order);
		
	}
	
	public void undo() {
		
		if (orders.size()!=0 ) {
			
			orders.remove(orders.size()-1);

		}else {
			System.out.println("Antes de deshacer tendria que añadir un pedido");
		}
	}
	
	public void toListInstances() {
	
		orders.forEach(System.out::println);
	}

}
