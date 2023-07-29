package abstractFactory;

public class Level1AbstractFactory implements EnemiesAbstractFactory {

    @Override
    public Naves getNaves() {
        return new NaveSimple();
    }

    @Override
    public Monsters getMonsters() {
        return new MonsterSimple();
    }

}
