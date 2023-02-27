import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

            System.out.println(sqrt.apply(0.5));
    }
    public static UnaryOperator<Double> sqrt=new UnaryOperator<Double>() {
        @Override
        public Double apply(Double aDouble) {
            return aDouble*aDouble;
        }
    };
}