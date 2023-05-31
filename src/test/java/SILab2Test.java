import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SILab2Test {

    @Test
    public void testFunction_NullUser_ExceptionThrown() {
        User user = null;
        List<User> allUsers = new ArrayList<>();
        SILab2 lab2 = new SILab2();
        try {
            lab2.function(user, allUsers);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException ex) {
            assertEquals("Mandatory information missing!", ex.getMessage());
        }
    }

    @Test
    public void testFunction_UsernameNull_UsernameSetToEmail() {
        User user = new User(null, "password", "email@example.com");
        List<User> allUsers = new ArrayList<>();
        SILab2 lab2 = new SILab2();
        lab2.function(user, allUsers);
        assertEquals("email@example.com", user.getUsername());
    }

    @Test
    public void testFunction_PasswordContainsUsername_ReturnsFalse() {
        User user = new User("username", "password123", "email@example.com");
        List<User> allUsers = Arrays.asList(user);
        SILab2 lab2 = new SILab2();
        boolean result = lab2.function(user, allUsers);
        assertFalse(result);
    }

    @Test
public void testFunction_ValidPassword_ReturnsTrue() {
    User user = new User("username", "Password!123", "email@example.com");
    List<User> allUsers = new ArrayList<>();
    SILab2 lab2 = new SILab2();
    boolean result = lab2.function(user, allUsers);
    assertTrue(result);
}

@Test
public void testFunction_PasswordLengthLessThan8_ReturnsFalse() {
    User user = new User("username", "pass123", "email@example.com");
    List<User> allUsers = new ArrayList<>();
    SILab2 lab2 = new SILab2();
    boolean result = lab2.function(user, allUsers);
    assertFalse(result);
}

@Test
public void testFunction_PasswordDoesNotContainSpecialCharacters_ReturnsFalse() {
    User user = new User("username", "password123", "email@example.com");
    List<User> allUsers = new ArrayList<>();
    SILab2 lab2 = new SILab2();
    boolean result = lab2.function(user, allUsers);
    assertFalse(result);
}

@Test
public void testFunction_PasswordContainsSpace_ReturnsFalse() {
    User user = new User("username", "password 123", "email@example.com");
    List<User> allUsers = new ArrayList<>();
    SILab2 lab2 = new SILab2();
    boolean result = lab2.function(user, allUsers);
    assertFalse(result);
}

@Test
public void testFunction_PasswordContainsAllSpecialCharacters_ReturnsTrue() {
    User user = new User("username", "P@ssw0rd!", "email@example.com");
    List<User> allUsers = new ArrayList<>();
    SILab2 lab2 = new SILab2();
    boolean result = lab2.function(user, allUsers);
    assertTrue(result);
}

@Test
public void testFunction_PasswordContainsNoSpecialCharacters_ReturnsFalse() {
    User user = new User("username", "password123", "email@example.com");
    List<User> allUsers = new ArrayList<>();
    SILab2 lab2 = new SILab2();
    boolean result = lab2.function(user, allUsers);
    assertFalse(result);
}

@Test
public void testFunction_PasswordContainsOnlySpecialCharacters_ReturnsFalse() {
    User user = new User("username", "!@#$%^&*", "email@example.com");
    List<User> allUsers = new ArrayList<>();
    SILab2 lab2 = new SILab2();
    boolean result = lab2.function(user, allUsers);
    assertFalse(result);
}

@Test
public void testFunction_NullPassword_ReturnsFalse() {
    User user = new User("username", null, "email@example.com");
    List<User> allUsers = new ArrayList<>();
    SILab2 lab2 = new SILab2();
    boolean result = lab2.function(user, allUsers);
    assertFalse(result);
}







}
