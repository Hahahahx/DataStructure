package Java二进制;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BinaryTest{
    public static void main(String[] args){
        BigDecimal d1 = new BigDecimal("0.3");
        BigDecimal d2 = new BigDecimal(0.2);
        BigDecimal d3 = BigDecimal.valueOf(0.1);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d1.divide(d3));
        System.out.println(d3.divide(d1,new MathContext(5, RoundingMode.HALF_UP)));

    }
}