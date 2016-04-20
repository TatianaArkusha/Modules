/**
 * Created by Татьяна on 20.04.2016.
 */
public class Multiplicator {
    public static int mul(int x, int y){
        int accumulator = 0;
        for (int i = 0; i<y; i++){
            accumulator = add(accumulator, x);
        }
        return accumulator;
    }

    private static int add(int x, int y) {
        return x+y;
    }
}
