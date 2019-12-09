package DH_SAIGON;

import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap 1 so nguyen n nho hon 10000");
            n = sc.nextInt();
        } while (n > 10000 || n < 0);
        cau1(n);
        cau2(n);

    }

    public static void cau1(int n) {

        int max = 0;
        for (int i = n; i > 0; i--) {
            int x=i;
            int t = 0;
            while (x > 0) {
                t += x % 10;
                x = x / 10;
            }
            if (max < t) max = t;
        }
        System.out.println("cau 1=" + max);
    }

    public static boolean checkSNT(int n) {
        if (n <= 1) return false;
        else if (n == 2) return true;
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean check_SHH(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        if (sum == n) return true;
        return false;
    }

    public static void cau2(int n) {
        int dem1 = 0, dem2 = 0;
        for (int i = 1; i < n; i++) {
            if (check_SHH(i)) dem2++;
            if (checkSNT(i)) dem1++;
        }
        System.out.println("Co " + dem1 + " so nguyen to");
        System.out.println("Co " + dem2 + " so hoan hao");
    }
}
