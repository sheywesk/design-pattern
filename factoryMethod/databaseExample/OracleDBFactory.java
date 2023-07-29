package factoryMethod.databaseExample;

public class OracleDBFactory {

    public static Database getDatabase() {
        return new PostgresDB();
    }
}
