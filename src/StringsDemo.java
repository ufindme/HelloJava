public class StringsDemo{
    public static void main(String[] args){
        String str = "helloworld@123";

        //convert str's character from down-case to upper-case;
        System.out.println(convertUpperCase(str));
        
        //checking str if that is contains numberic; By the way, it's also can be used to check str is numberic
        System.out.println(isExistsNumberic(str));
        StringsDemo.formatString();
        toFirstLetterUpperCase2();
    }
    
    //convert str's character from down-case to upper-case;
    public static String convertUpperCase(String str){
        char[] charArray = str.toCharArray();
        for (int x =0; x< charArray.length; x++){
            if (charArray[x] >='a' && charArray[x] <= 'z'){
                charArray[x] -=32;
            }
        } 
        
        return new String(charArray);
    }
    
    //checking str if that is contains numberic; By the way, it's also can be used to check str is numberic
    public static boolean isExistsNumberic(String str){
        char[] charArray = str.toCharArray();
        
        for (char c:charArray){
            if (c >= '0' && c<='9'){
                return true; 
            }
        }
        
        return false;
    }

    //字符串的分割（拆分）
    public static void splitString(){
        String str = "hello world";
        String[] arr = str.split(" ");    //除了空格以外，常用的还有逗号、分号、竖线等
        for (String s:arr){
            System.out.println(s);
        }
    }

    public static void getClientNameFromPhotoName(){
        //字符串的格式：用户id-photo-用户名.图片格式后缀
        String str = "123-photo-张三.jpg";
        int beginIndex = str.indexOf("-photo-") + 7;     //从第8个字符开始截取
        int endIndex = str.lastIndexOf(".");            //从最后一个"."开始截取
        String name = str.substring(beginIndex, endIndex);     //截取字符串

        //求客户姓名
        System.out.println(name);
    }

    //format()方法
    public static void formatString(){
        String str = "hello %s, your age is %d, salary is %.2f";
        String name = "Tom";
        int age = 25;
        double salary = 5000.5456;
        String result = String.format(str, name, age, salary);
        System.out.println(result);
    }

    //String类将字符串的首字母大写
    public static void toFirstLetterUpperCase(){
        String str = "hello world";
        String result = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(result);
    }

    //String类：将字符串中每个单词的首字母大写
    public static void toFirstLetterUpperCase2(){
        String str = "hello world";
        String[] arr = str.split(" ");
        for (int i=0; i<arr.length; i++){
            arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
        }
        String result = String.join(" ", arr);
        System.out.println(result);      //输出：Hello World
    }
}
