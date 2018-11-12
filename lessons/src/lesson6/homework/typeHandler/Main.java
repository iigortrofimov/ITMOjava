package lesson6.homework.typeHandler;

public class Main {
    public static void main(String[] args) {

        TxtHandler txtFile = new TxtHandler("config/app.txt");
        XmlHandler xmlFile = new XmlHandler("config/app.xml");

        txtFile.setId(11);
        txtFile.setValue("txt Value ");

        xmlFile.setId(22);
        xmlFile.setValue("xml Value ");

        txtFile.readerFile(); // прочитать данные тхт файла
        System.out.println("Reading path for txt files: " + txtFile.getPathFile() + "\n");
        System.out.println("--------------------");

        xmlFile.readerFile();
        System.out.println("Reading path for xml files: " + xmlFile.getPathFile() + "\n");
        System.out.println("--------------------");

        txtFile.writeInfo();
        System.out.println();
        xmlFile.writeInfo();
        System.out.println("--------------------");

        //преобразовать txt файл в xml файл + создать один объект на основе другого
        XmlHandler txtFileInXmlFile = new XmlHandler(txtFile);
        System.out.println(txtFileInXmlFile.extensionFile());
        System.out.println();
        System.out.println(txtFile.extensionFile());
        System.out.println();
        System.out.println(xmlFile.extensionFile());
    }
}
