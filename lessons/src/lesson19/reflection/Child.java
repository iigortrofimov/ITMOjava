package lesson19.reflection;

public class Child  extends Parent {

    private String name;
    private int version = 1;

    public Child(String name, int version) {
        this.name = name;
        this.version = version;
    }

    private int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getInfo() {
        return "private getInfo()";
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
class Parent{

}