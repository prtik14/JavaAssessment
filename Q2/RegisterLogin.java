import java.util.HashMap;

public class RegisterLogin {
	public static String user_name;
    private static String password;
    
    static HashMap<String, String> map = new HashMap<>();
    
    public static void register(String Ruser, String Rpassword) {
        map.put(Ruser,Rpassword);

        System.out.printf("User %s has been crated \n", Ruser);
    }

    public static void login(String luserName, String Lpassword) {
 	if(map.get(luserName) == Lpassword) {
    		System.out.println("Logged in");
    	}
    }
}
