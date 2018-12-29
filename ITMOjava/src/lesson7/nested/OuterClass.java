package lesson7.nested;

public class OuterClass {
    String value;
    static int intVar = 1;

    public OuterClass(String value){
        this.value = value;
    }
    public InnerClass getInner(){
        return new InnerClass("Объект InnerClass");
    }

    static class InnerClass{
        String val;
        public InnerClass(String val){
            this.val = val;
        }
        public void someVoid(){
            intVar += 12;
            System.out.println(intVar);
           // System.out.println(value); не имеет доступа к нестатическим переменным

        }

    }

}
