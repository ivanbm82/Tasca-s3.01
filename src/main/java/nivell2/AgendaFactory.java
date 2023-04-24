package nivell2;

public class AgendaFactory extends AbstractFactory {

    @Override
    Agenda getAgenda(String datos) {
        if (datos == null) {
            throw new IllegalArgumentException("El parámetro no puede ser nulo.");
        } else if (datos.equalsIgnoreCase("español")) {
            return new SpanishAgenda();
        } else {
            return null;
        }
    }
}
