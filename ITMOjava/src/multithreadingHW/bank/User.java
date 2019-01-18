package multithreadingHW.bank;

public class User {
    private long userId;
    private String email;

    public User(String email) {
        this.email = email;
        this.userId = (long) (Math.random() * 2 * Long.MAX_VALUE - Long.MAX_VALUE);
    }

    public long getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                '}';
    }
}
