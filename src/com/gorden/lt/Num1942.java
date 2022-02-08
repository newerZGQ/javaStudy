package com.gorden.lt;

import com.gorden.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Num1942 implements Test {
    @Override
    public void doTest() {
        int[][] times = new int[][]{
            {1,4}, {2,3}, {4,6}
        };
        int target = 2;
        smallestChair(times, target);
    }

    public int smallestChair(int[][] times, int targetFriend) {
        int[][] timesT = new int[times.length][3];
        for (int i = 0; i < times.length; i++) {
            int[] temp = new int[3];
            temp[0] = times[i][0];
            temp[1] = times[i][1];
            temp[2] = i;
            timesT[i] = temp;
        }
        Arrays.sort(timesT, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int i = 0; i < timesT.length; i++) {
            int[] cur = timesT[i];
            int earliest = i;
            for (int j = 0; j < i; j++) {
                int[] temp = timesT[j];
                if (cur[0] >= temp[1]) {
                    earliest = j;
                    break;
                }
            }
            if (cur[2] == targetFriend) {
                return earliest;
            }
            timesT[earliest] = timesT[i];
        }
        return 0;
    }
}

