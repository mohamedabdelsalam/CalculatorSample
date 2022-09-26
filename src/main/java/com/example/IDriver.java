package main.java.com.example;

public interface IDriver {
    void createDatabase(String databaseSchemaPath);

    void setRow(String databaseName, String tableName,String value);

    void getRow(String database, String table, String value);

    void deleteRow(String databaseName, String tableName,String value);
}
