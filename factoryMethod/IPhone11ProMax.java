package factoryMethod;
/**
 * Classe de produto concreto.
 */
public class IPhone11ProMax implements IPhone {

    @Override
    public void getIphone() {
        System.out.println("Criando IPhone 11 Pro Max");
    }

}
