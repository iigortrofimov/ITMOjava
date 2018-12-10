package lesson19.annotation;

public class ParseAnnotation {

    public static void main(String[] args) {

        User user = new User(User.Permission.ADMIN);

        Class<?> actionClass = DeleteAction.class;

        PermisionRequired permisionRequired = actionClass.getAnnotation(PermisionRequired.class);

        if (permisionRequired != null) {
            if (user.getPermission().equals(permisionRequired.value())) {
                System.out.println("Пользователю доступно управление");
            }
        }

    }
}
