package factoryMethod;

public class Client {
    public static void main(String[] args) {
        IPhone iPhone11 = IPhoneFactory.create("X", "Pro");
        iPhone11.getIphone();
        IPhone iPhone11Max = IPhoneFactory.create("11", "Max");
        iPhone11Max.getIphone();
    }
}
