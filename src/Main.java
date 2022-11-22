public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.90;
        int weight = 100;
        double result = service.calculate(height, weight);
        System.out.println("Ваш индекс массы тела:");
        System.out.println(result);
    }
}