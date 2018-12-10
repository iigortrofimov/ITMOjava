package lesson19.reflection;

import com.mysql.cj.x.protobuf.MysqlxExpr;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        // каждый загруженный класс имеет соответсвующий
        // java.lang.Class объект, который дает доступ к струтуре

        // у каждого типа есть свой литерал class

        System.out.println(String.class);
        System.out.println(int.class);

        Child child = new Child("Bill", 2);
        // строковый литерал объекта
        System.out.println(child.getClass());
        // строковый литерал класса наследника

        Class cls;
        cls = child.getClass();
        System.out.println("child name " + cls.getName());

        cls = cls.getSuperclass();
        System.out.println("child extends " + cls.getName());

        // доступ к компонентам

        // класс объекта
        Class<Child> childClass = Child.class;
        System.out.println(childClass);

        // доступ к полям
        Field[] fields = childClass.getFields();
        System.out.println(Arrays.toString(fields));

        Field[] declaredFields = childClass.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));

        // доступ к declared полям
        Method[] methods = childClass.getMethods();
        System.out.println(Arrays.toString(methods)); // all not private methods of parent class

        Method[] declaredMethods = childClass.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods)); // all declared methods

        // доступ к конструкторам
        Constructor<?>[] declaredConstructors = childClass.getDeclaredConstructors();
        System.out.println(Arrays.toString(declaredConstructors));

        // доступ к конкретному полю, методу, констуктору
        Field field = childClass.getDeclaredField("name");   //можно достьуп к приватному

        //получить доступ к полю
        field.setAccessible(true);
        field.set(child, "Bob");
        System.out.println((String) field.get(child));
        System.out.println(child);

        Method method = childClass.getDeclaredMethod("getInfo");
        method.setAccessible(true);
        String data = (String) method.invoke(child);
        System.out.println(data);

        // доступ к конструктору
        // Constructor<Child> childConstructor = childClass.getDeclaredConstructor();

        Constructor<Child> childConstructor = childClass.getDeclaredConstructor(String.class, int.class);

        //создание объекта
        Child child1 = childConstructor.newInstance("John", 23);
        System.out.println(child1);

        boolean isFinal = Modifier.isFinal(field.getModifiers());
        boolean isPrivate = Modifier.isPrivate(field.getModifiers());

        Class<?>[] interfaces = childClass.getInterfaces();
    }
}
