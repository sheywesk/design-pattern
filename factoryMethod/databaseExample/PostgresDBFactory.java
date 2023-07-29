package factoryMethod.databaseExample;

public class PostgresDBFactory {

    public static Database getDatabase(){
        return new PostgresDB();
    }

}
