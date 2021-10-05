package sliit.intern;

public class DB {
    public static void connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    }
}
