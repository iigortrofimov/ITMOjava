package lesson13;

import java.util.Arrays;

public class EnumExample {
    public static void main(String[] args) {
        User user = new User(1, "Alex", Role.ADMIN);
        User user2 = new User(2, "Bob", Role.USER);

        if (user.getRole() == Role.ADMIN) {
            System.out.println("OKs");
        }
// values
        System.out.println(Arrays.toString(Role.values()));
        for (Role role : Role.values()) {
            System.out.println(role);
        }

        // valueOf() создание поля через строчку String
        String str = "USER";
        Role userRole = Role.valueOf(str);
        User user3 = new User(3, "Tom", userRole);

        // ordinal
        System.out.println(userRole.ordinal());
    }
}

class User {
    private int id;
    private String name;
    private Role role;

    public User(int id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }
}

enum Role { // перечисление
    ADMIN {
        public Role adminRole() {
            return ADMIN;
        }

    },
    USER, GUEST;

    public Role someRole() {
        return USER;
    }


}
