package Knapsack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by caa on 21.03.16.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //напишите тут ваш код

        int i, N, M;

        N = Integer.parseInt(reader.readLine());
        M = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<>(N);
        for (i = 0; i < N; i++)
            list.add(reader.readLine());
        for (i = 0; i < M; i++) {
            list.add(N + i, list.get(i));
        }
        for (i = 0; i < M; i++)
            list.remove(i);
        for (String s : list)
            System.out.println(s);
    }

}
