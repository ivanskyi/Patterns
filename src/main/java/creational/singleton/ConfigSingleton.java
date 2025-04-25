package creational.singleton;

public class ConfigSingleton {

    private String databaseUrl;
    private String apiKey;

    private ConfigSingleton() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/database";
        this.apiKey = "API_KEY_12345";
    }

    private static class Holder {
        private static final ConfigSingleton INSTANCE = new ConfigSingleton();
    }

    public static ConfigSingleton getInstance() {
        return Holder.INSTANCE;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
