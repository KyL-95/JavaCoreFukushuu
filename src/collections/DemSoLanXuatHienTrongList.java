package collections;

import java.util.*;

public class DemSoLanXuatHienTrongList {

    static void DemKyTu(List<Integer> list)
    {
        int counter[] = new int[256];
        int len = list.size();
        for (int i = 0; i < len; i++)
            counter[list.get(i)]++;
        for (int i = 0; i < len; i++) {
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (list.get(i) == list.get(j))
                    flag++;
            }
            if (flag == 1)
                System.out.println("Số lần xuất hiện của " + list.get(i)
                        + " trong list:" + counter[list.get(i)]);
        }
    }
    public static void main(String[] args) {
        Integer[] arr = {1, 5, 4, 6, 7, 3, 6, 4};
        DemKyTu(Arrays.asList(arr));
    }
}
