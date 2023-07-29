package abstractFactory;

public class Level2AbstractFactory implements EnemiesAbstractFactory {

    @Override
    public Naves getNaves() {
        return new NaveSimple();
    }

    @Override
    public Monsters getMonsters() {
        return new MonsterWithGun();
    }

}
