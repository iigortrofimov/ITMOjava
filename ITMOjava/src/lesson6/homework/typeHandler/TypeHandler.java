package lesson6.homework.typeHandler;

abstract public class TypeHandler implements TypeHandlerInterface {
    private  int id;
    private String value;
    private String pathFile;

    public TypeHandler(String pathFile) {
        this.pathFile = pathFile;
    }

    public TypeHandler(int id, String value) {
        this.id = id;
        this.value = value;
    }
    public TypeHandler(TypeHandler file) {
        this.id = file.id;
        this.value = file.value;
        this.pathFile = file.pathFile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    @Override
    abstract public void readerFile();

    @Override
    abstract public void writeInfo();

    @Override
    abstract public String extensionFile();
}
