package modul1.modul1_3;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Task4 {

    public static void main(String[] args) {
        BigInteger rez = new BigInteger("1");
        for (int i = 1; i <= 200; i++) {
            rez = rez.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println(rez);
    }
}
