import models.Fibonacci;
import models.Sequence;
import models.SequenceCache;

public class Main {

    public static void main(String[] args) {

        SequenceCache.loadCache();

        Sequence prime = (Sequence) SequenceCache.getSequence("1");
        System.out.println(new StringBuffer()
                .append("El numero primo de 10.000 es: ")
                .append(prime.getResult())
                .toString());

        Sequence fibonacci = (Sequence) SequenceCache.getSequence("2");
        System.out.println(new StringBuffer()
                .append("El numero fibonacci de 10.000 es: ")
                .append(fibonacci.getResult())
                .toString());


        Sequence fibonacciClone = (Fibonacci) new Fibonacci().clone();

        long result = fibonacciClone.getResult() / 5;

        System.out.println(new StringBuffer()
                .append("El numero Colone fibonacci de 1.000 es: ")
                .append(result)
                .toString());
    }
}
