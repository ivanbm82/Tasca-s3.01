package nivell2;

public class Main {

    public static void main(String[] args) {

        AbstractFactory agendaFactory = FactoryProducer.getFactory();

        Agenda agenda = agendaFactory.getAgenda("español");

        agenda.añadirPersona();

        for (Persona persona : agenda.getPersonas()) {
            System.out.println(persona);
        }
    }

}