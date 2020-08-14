package day04;

import day03.Emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        StringBuilder str = new StringBuilder();
        Collection<Emp> col = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String name = console.next();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            String str1 = str.toString();
            if((str1.contains(name))) {
                System.out.println("该用户已输入");
            }else{
                col.add(new Emp(name, console.nextInt(), console.next(), console.nextInt(), sf.parse(console.next())));
                str.append(name); }
        }
        System.out.println(col.toString());
        Calendar cal = Calendar.getInstance();
        for (Emp name1:
            col ) {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            System.out.print(name1.getName());
            System.out.print(":");
            long time =name1.getHiredate().getTime();
            cal.setTimeInMillis(time + 30l * 3 * 24 * 60 * 60 * 1000);
            cal.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
            Date date = cal.getTime();
            String str1 = sf.format(date);
            System.out.println(str1);
        }
    }
}
