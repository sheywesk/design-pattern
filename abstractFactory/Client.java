package abstractFactory;

public class Client {
    public static void main(String[] args) {
        // É possível refatorar as classes AbstractFatory para um 
        // factory method e assim poderiamos ter um LevelFactory.create(LEVEL.LEVEL_1)
        Level1AbstractFactory level1 = new Level1AbstractFactory();
        level1.getMonsters();
        level1.getNaves();

        Level2AbstractFactory level2 = new Level2AbstractFactory();
        level2.getMonsters();
        level2.getNaves();

    }
}
