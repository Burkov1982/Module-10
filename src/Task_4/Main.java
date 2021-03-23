package Task_4;

import java.util.stream.Stream;

public class Main {
    public static final long A = 25214903917l;
    public static final int C = 11;
    public static final long M =(long) 2^48;
    public static final long SEED = 0;

    public static void main(String[] args) {
        GenerateSomeRandomDigit generate = new GenerateSomeRandomDigit();
        generate.infinityRandomDigitsGen(A, C, M, SEED).forEach(System.out::println);
    }
    static class GenerateSomeRandomDigit {
        public long x;
        public Stream<Long> infinityRandomDigitsGen(long a, int c, long m, long seed) {
            x = seed;
            return (Stream<Long>) Stream.iterate(seed, n -> x = Long.valueOf(Math.toIntExact((a * x + c) % m)));
        }
    }
}
