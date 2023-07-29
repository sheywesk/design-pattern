package factoryMethod.iphoneExample;

/**
 * Classe de produto concreto.
 */
public class IPhone11Pro implements IPhone {

    @Override
    public void getIphone() {
        System.out.println("Criando iphone 11 pro");
    }
}
