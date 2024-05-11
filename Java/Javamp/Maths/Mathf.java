package com.Javamp.Maths;

import java.util.ArrayList;

import javax.management.MBeanRegistration;

public class Mathf {
    public int add(int a, int b) {
        return a+b;
    }
    public int subtract(int a, int b) {
        return a-b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    public int divide(int a, int b) {
        return a/b;
    }
    public float getpow(int a, int b) {
        int i=0;
        int ans =1;
        while(i==b) {
            ans *= a;
            i++;
        }
        return ans;
    }
    public double getsqrt(int a) {
        return Math.sqrt(a);
    }
    public int getFactorial(int a) {
        int sum = 0;
        for(int i=1;i<=a;i++) {
            sum += i;
        }
        return sum;

    }
    public boolean isPrime(int a) {
        return getFactor(a).length==1;
    }
    public int[] getFactor(int a) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=a;i++) {
            if(i%a==0) {
                list.add(i);
                continue;
            }
        }
        int[] ns = new int[list.size()];
        for(int i=0;i<=list.size();i++) {
            ns[i] = list.get(i);
        }
        return ns;
    }
    public int getLCM(int a, int b) {
        int LCM = 1;
        for (int i = 1; i < 100; i++) {
            if(i%a==0 && i%b==0) {
                LCM *= i;
                a /= LCM;
                b /= LCM;
            }
        }
        return LCM*a*b;
    }
    public int getHCF(int a, int b) {
        int HCF = 1;
        for (int i = 1; i < 100; i++) {
            if(i%a==0 && i%b==0) {
                HCF *= i;
                a /= HCF;
                b /= HCF;
            }
        }
        return HCF;
    }
    public int getPercentage(int n, int into) {
        return n/100 * into;
    }
    public double getHypotenes(double adj_side, int angle) {
        return (adj_side/Math.cos(angle));
    }
}
