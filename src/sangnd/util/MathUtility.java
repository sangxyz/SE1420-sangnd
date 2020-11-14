/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sangnd.util;

public class MathUtility {

    //alm thu vien giong y chang Math
    //MATH.PI, abs(), sqrt(), pow(a,b) a^b
    //pham la thu vien thi sai static kho ko can luu info cho rieng minh
    //con thu vien ma van can luu info rieng, thi van nostatic nhu binh thuong
    public static final double PI = 3.1415;

    //tien ich tinh n giai thua n!=1,2,3,..,n
    //n khong phai tu 0 tro lenh
    //0!=1!=1
    //am gia thua la vo nghia
    //hai thua tang cuc nhanh 21! long ko chua dc
    // bai nhay minh se chan gia yhua tu0 den 20
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0-20");
        }
        if (n == 0 || n == 1) {
            return 1; //trường hợp đặt biệt return luôn
        }
        // viết else trừ điểm
        //Mặc định đến đây là n= 2..20
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
        //viet code de chay thu cai ham code test sout
        //log file  expexted <> actual
        //cung van expeted actual xanh tat ca do cho mot ky thuat TDD (Test Driven Development)
        // dung cac bo thu vien
    }
}
