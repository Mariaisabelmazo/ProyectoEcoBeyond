package backend;

import java.sql.Connection;

/**
 * El objetivo de esta clase es centralizar las credenciales de conexión a la base de datos
 * 
 */
public class baseDatos {
    
    /**
     * Credenciales de conexión
     */
    private Connection conn = null;
    private String url;
    private String user;
    private String contra;
    private String driver;
    
    public baseDatos() {
        this.url = "jdbc:mysql://localhost:3306/dbEcoBeyond";
        this.user = "root";
        this.contra = "";
        this.driver = "com.mysql.jdbc.Driver";
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    
    
    
}
