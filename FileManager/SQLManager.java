/**
 * Created by ed on 28.03.2016.
 */
public class SQLManager {
    public SQLManager(String adress) {
        checkConnection("url");
        connect();
    }
    public void connect (){
        System.out.println( "Conections to");
    }
    public boolean checkConnection (String adress){
        System.out.println(" Conections is");
        return true;
    }

    public boolean executeSQL(String query){
        System.out.println("Execute SQL"+query);

    }

}
