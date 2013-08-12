package br.com.aj2.util;


import java.sql.SQLException;
import org.h2.tools.RunScript;
import org.h2.tools.Script;

/**
 *
 * @author João Paulo
 */
public class backup {
    private String url;
    private String user;
    private String password;
    private String fileName;
    private String charSetName;
    private Boolean continueOnError;
    
    public void generetBackup() throws SQLException{
        Script.execute(url, user, password, fileName);
    }
    
    public void restoreBackup() throws SQLException{
        RunScript.execute(url, user, password, fileName, charSetName, continueOnError);
    }
    
}
