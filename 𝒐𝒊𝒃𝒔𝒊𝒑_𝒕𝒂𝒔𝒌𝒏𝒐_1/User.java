package OasisInfobyte.ReservationSystem;

import java.util.HashMap;

public class User {
    private static HashMap<String, User> userDB = new HashMap<>(); // Mock database
    
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        userDB.put(username, this);
    }

    // Static block to initialize a sample user
    static {
        new User("testUser", "password123"); // Sample user created here
    }

    // Validate user credentials
    public static boolean authenticate(String username, String password) {
        User user = userDB.get(username);
        return user != null && user.password.equals(password);
    }

    // Add a new user if username doesn't already exist
    public static boolean addUser(String username, String password) {
        if (userDB.containsKey(username)) {
            return false; // User already exists
        }
        new User(username, password);
        return true;
    }
}

