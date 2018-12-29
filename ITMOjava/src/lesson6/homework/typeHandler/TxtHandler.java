package lesson6.homework.typeHandler;

public class TxtHandler extends TypeHandler {
    public TxtHandler(String pathFile) {
        super(pathFile);
    }

    public TxtHandler(int id, String value) {
        super(id, value);
    }

    public TxtHandler(TypeHandler file) {
        super(file);
    }

    @Override
    public void readerFile() {
        System.out.println("Идет чтение TXT файла: ");
        System.out.println("id: " + getId() + " value: " + getValue());
    }

    @Override
    public void writeInfo() {
        System.out.println(" Запись Txt файла: ");

    }

    @Override
    public String extensionFile() {
        return "Extension *.txt file";
    }
}
