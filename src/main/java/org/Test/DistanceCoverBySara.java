package org.Test;

import java.util.Scanner;

public class DistanceCoverBySara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double res=0;
        if (n % 2 == 0) {
            if (n % 4 == 2)
                res = 1;
            else if (n % 4 == 0)
                res = 0;
        }
        else
            res = dis(n);

        System.out.println("The shortest distance is : "+(int)res);
    }




    public static double dis(double n) {
            if (n == 1)
                return 1;
            else
                return n - dis(n - 1) * Math.pow(-1, (n - 1));

        }
}



