package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        System.out.println(arr);
        List<Integer> arr1 = arr.subList(3,7);
        for (int i = 0; i < 4; i++) {
            arr1.set(i,arr1.get(i) * 10);
        }
        System.out.println(arr);
        List<Integer> arr2 = arr.subList(7,10);
        arr.removeAll(arr2);
        System.out.println(arr);

    }
}
