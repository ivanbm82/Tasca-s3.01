package nivell2;

public class FactoryProducer {

    public static AbstractFactory getFactory() {
        return new AgendaFactory();
    }
}