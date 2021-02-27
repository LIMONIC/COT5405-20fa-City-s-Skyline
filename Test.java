
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.testRunTime(t.test10());
        t.testRunTime(t.test100());
        t.testRunTime(t.test1000());
        t.testRunTime(t.test10000());
        t.testRunTime(t.test100000());

    }

    private int[] getRandomBuilding() {
        Random rand = new Random();
        int L = rand.nextInt(Integer.MAX_VALUE - 2) + 1;
        int R = rand.nextInt(Integer.MAX_VALUE - 2) + 1;
        int H = rand.nextInt(Integer.MAX_VALUE - 2) + 1;
        int[] res = new int[3];
        while (L == R) {
            L = rand.nextInt(Integer.MAX_VALUE - 2) + 1;
        }
        if (L < R) {
            res[0] = L;
            res[2] = R;
        }
        if (R < L) {
            res[0] = R;
            res[2] = L;
        }
        res[1] = H;
        return res;
    }

    private int[][] test10 () {
        int[][] res = new int[10][3];
        for (int i = 0; i < res.length; i++) {
            res[i] = getRandomBuilding();
        }
        return res;
    }

    private int[][] test100 () {
        int[][] res = new int[100][3];
        for (int i = 0; i < res.length; i++) {
            res[i] = getRandomBuilding();
        }
        return res;
    }

    private int[][] test1000 () {
        int[][] res = new int[1000][3];
        for (int i = 0; i < res.length; i++) {
            res[i] = getRandomBuilding();
        }
        return res;
    }

    private int[][] test10000 () {
        int[][] res = new int[10000][3];
        for (int i = 0; i < res.length; i++) {
            res[i] = getRandomBuilding();
        }
        return res;
    }

    private int[][] test100000 () {
        int[][] res = new int[100000][3];
        for (int i = 0; i < res.length; i++) {
            res[i] = getRandomBuilding();
        }
        return res;
    }

    private void testRunTime (int[][] input) {
        Skyline s = new Skyline();
        long startTime, stopTime;
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            startTime = System.nanoTime();
            s.getSkyline(input);
            stopTime = System.nanoTime();
            sum += stopTime - startTime;
        }
        System.out.println("Run time of " +input.length+ " buildings (microsecond): " + ((sum / 5) / 1000));
    }
}
