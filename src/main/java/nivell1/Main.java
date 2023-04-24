package nivell1;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		Undo u = Undo.getInstance();
		
		menu(u);
		
	}
	
	public static void menu(Undo u) {
		
		Scanner input= new Scanner(System.in);
		
		int opcion=-1;
		while(opcion!=0){
			
			System.out.println("1.-Añadir pedidos\n2.-Eliminar último pedido\n3.-Listar pedidos");
			try {
				opcion=input.nextInt();

			} catch(InputMismatchException e){
				System.out.println("Formato de opcion erronea");
				
			}
			input.nextLine();

			switch(opcion) {

			case 1:
				System.out.println("Introduce el pedido que quieres añadir en la lista");
				String order=input.nextLine();
				u.addInstance(order);
				break;

			case 2:
				u.undo();
				break;

			case 3:
				u.toListInstances();
				break;
			default:
				System.out.println("Opción no disponible");

			}
		}
	}
}