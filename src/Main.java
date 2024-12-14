public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int myCalculate = service.calculate(45, 1.50);
        System.out.println("Индекс массы тела:" + myCalculate);
    }
}