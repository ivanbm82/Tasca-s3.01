package nivell2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpanishAgenda implements Agenda {

    private List<Persona> personas;

    public SpanishAgenda() {
        personas = new ArrayList<>();
    }

    @Override
    public void añadirPersona() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el nombre");
        String nombre = input.nextLine();
        System.out.println("Introduzca los apellidos");
        String apellidos = input.nextLine();
        System.out.println("Introduzca la calle");
        String calle = input.nextLine();
        System.out.println("Introduzca el número de la calle");
        String numCalle = input.nextLine();
        System.out.println("Introduzca el piso y puerta");
        String pisoPuerta = input.nextLine();
        System.out.println("Introduzca el número de télefono");
        String telefono = input.nextLine();
        telefono = "+34" + telefono; // Concatenamos el código del país al número de teléfono
        Persona persona = new Persona(nombre, apellidos, calle, numCalle, pisoPuerta, telefono);
        personas.add(persona);
        System.out.println("La persona ha sido añadida a la agenda.");
    }

    public List<Persona> getPersonas() {
        return personas;
    }
}
