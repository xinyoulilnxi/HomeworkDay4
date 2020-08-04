package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        String str1 = console.next();
        String str2 = console.next();
        String str3 = console.next();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sf.parse(str1);
        Date date2 = sf.parse(str2);
        Date date3 = sf.parse(str3);
        List<Date> list = new ArrayList<Date>();
        list.add(date1);
        list.add(date2);
        list.add(date3);
        list.sort(new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);

    }
}
