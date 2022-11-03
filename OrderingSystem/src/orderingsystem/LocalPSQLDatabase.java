package orderingsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author thanasis
 */
public class LocalPSQLDatabase {
    private String url;
    private String ip;
    private String port;
    private String dbname;
    private String username;
    private String password;
    private Connection conn;
    private boolean isConnected = false;

    public LocalPSQLDatabase(String ip, String port, String dbname, 
            String username, String password) throws ClassNotFoundException{
        Class.forName("org.postgresql.Driver");
        this.ip = ip;
        this.port = port;
        this.dbname = dbname;
        this.username = username;
        this.password = password;
        this.url = "jdbc:postgresql://"+this.ip+":"+this.port+"/"+this.dbname;
    }
    
    public void establishConnection() {
        try {
            this.conn = DriverManager.getConnection(this.url, this.username,
                    this.password);
            this.isConnected = true;
        } catch (SQLException e) {
            System.out.println("Connection to: " + this.url + " has failed!");
        }
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setIsConnected(boolean isConnected) {
        this.isConnected = isConnected;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
