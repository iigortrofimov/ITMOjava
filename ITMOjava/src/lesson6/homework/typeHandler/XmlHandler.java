package lesson6.homework.typeHandler;

public class XmlHandler extends TypeHandler {
    public XmlHandler(String pathFile) {
        super(pathFile);
    }

    public XmlHandler(int id, String value) {
        super(id, value);
    }

    public XmlHandler(TypeHandler file) {
        super(file);
    }

    @Override
    public void readerFile() {
        System.out.println("Идет чтение Xml файла: ");
        System.out.println("id: " + getId() + "value: " + getValue());
    }

    @Override
    public void writeInfo() {
        System.out.println(" Запись Xml файла: ");

    }

    @Override
    public String extensionFile() {
        return "Extension * .xml file";
    }
}
