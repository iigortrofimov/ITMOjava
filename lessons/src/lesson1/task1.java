package lesson1;

public class task1 {
    public static void main(String[] args) {
        int hight = 10, length = 15, width = 12;
        int area = 2 * ((length *  width) + (width * hight) + (length * hight));
        System.out.println("Площадь = " + area);
        if (width > hight)
        {
            System.out.println("ширина больше высоты = " + width);
        }
        else if (hight > width)
        {
            System.out.println("высота больше ширины = " + hight);
        }
    }
}
