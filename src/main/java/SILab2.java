import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public static boolean function(User user, List<User> allUsers) {
        if (user == null || user.getPassword() == null || user.getEmail() == null) {
            throw new RuntimeException("Mandatory information missing!");
        }
        
        if (user.getUsername() == null) {
            user.setUsername(user.getEmail());
        }

        String specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        String password = user.getPassword();
        String passwordLower = password.toLowerCase();

        if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length() < 8) {
            return false;
        } else {
            if (!passwordLower.contains(" ")) {
                for (int i = 0; i < specialCharacters.length(); i++) {
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Пример на користење на функцијата

        // Креирање на листа со постоечки корисници
        List<User> users = new ArrayList<>();
        users.add(new User("user1", "password1", "user1@example.com"));
        users.add(new User("user2", "password2", "user2@example.com"));

        // Креирање на нов корисник
        User newUser = new User("user3", "password3", "user3@example.com");

        // Повик на функцијата и прикажување на резултатот
        boolean isValid = function(newUser, users);
        System.out.println("Is user valid? " + isValid);
    }
}
