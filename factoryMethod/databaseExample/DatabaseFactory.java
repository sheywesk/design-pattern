package factoryMethod.databaseExample;

public class DatabaseFactory {

	public static Database create(DatabaseEnum databaseEnum) {
		return switch (databaseEnum) {
            case ORACLE -> new OracleDB();
            case POSTGRES -> new PostgresDB();
            default -> new PostgresDB();
        };
	}

}
