package other.outputStreams;

import java.io.*;

class Person implements Serializable
{
    private static final long serialVersionUID = 1L;

    public String  name   ;
    public int     age    ;
    public double  height ;
    public boolean married;

    Person(String name, int age, double height, boolean married)
    {
        this.name    = name;
        this.age     = age;
        this.height  = height;
        this.married = married;
    }
}

class Example
{
    public static void main(String[] args)
    {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("c:/игорь/persons.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Person person = new Person("Остап Бендер", 35, 175, false);
            oos.writeObject (person);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}