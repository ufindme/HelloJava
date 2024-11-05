import java.util.Date;
public class DateFormatExample {
    public static void main(String[] args) {
        Date date = new Date();

        // Output: 2021-07-26 15:30:45 GMT+08:00
        System.out.printf("%tY-%tm-%td %tH:%tM:%tS %tZ", date, date, date, date, date, date, date);

        // Output: 15:30:45
        System.out.printf("%tT%n", date);

        //c的使用 %n表示的是换行符
        System.out.printf("全部日期和时间信息：%tc%n",date);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n",date);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n",date);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR%n",date);

        // 使用toString()显示日期和时间
        System.out.printf("%1$s %2$tB %2$td, %2$tY","Due date:", date);
    }
}