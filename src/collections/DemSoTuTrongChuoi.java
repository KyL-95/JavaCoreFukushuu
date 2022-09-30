package collections;

import java.util.Arrays;

public class DemSoTuTrongChuoi {
    public static void main(String[] args) {
        String str = " hoc          java kho " +
                "\n qua ";
        str = str.trim();
        String [] arrSub = str.split("\\s+");
        System.out.println(Arrays.toString(arrSub));
        System.out.println("Số từ trong chuỗi " + arrSub.length);

    }
}
