package factoryMethod.databaseExample;

public class Client {
    public static void main(String[] args) {
        // Versão em que o cliente precisa ter ciencia das factories existentes e
        // usar a que deseja.
        Database postgres1 = PostgresDBFactory.getDatabase();
        postgres1.insert("1324","salvando");

        Database oracle1 = OracleDBFactory.getDatabase();
        oracle1.insert("1324","salvando");

        // Versão de simple factory em que o cliente não precisa conhecer todas
        // as interfaces e possui apoio do Enum na criação dos bd possiveis
        // no factory.
        Database postgres = DatabaseFactory.create(DatabaseEnum.POSTGRES);
        postgres.insert("1324","salvando");

        Database oracle = DatabaseFactory.create(DatabaseEnum.ORACLE);
        oracle.insert("1324","salvando");

    }
    
}
