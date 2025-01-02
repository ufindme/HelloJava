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

    //�ַ����ķָ��֣�
    public static void splitString(){
        String str = "hello world";
        String[] arr = str.split(" ");    //���˿ո����⣬���õĻ��ж��š��ֺš����ߵ�
        for (String s:arr){
            System.out.println(s);
        }
    }

    public static void getClientNameFromPhotoName(){
        //�ַ����ĸ�ʽ���û�id-photo-�û���.ͼƬ��ʽ��׺
        String str = "123-photo-����.jpg";
        int beginIndex = str.indexOf("-photo-") + 7;     //�ӵ�8���ַ���ʼ��ȡ
        int endIndex = str.lastIndexOf(".");            //�����һ��"."��ʼ��ȡ
        String name = str.substring(beginIndex, endIndex);     //��ȡ�ַ���

        //��ͻ�����
        System.out.println(name);
    }

    //format()����
    public static void formatString(){
        String str = "hello %s, your age is %d, salary is %.2f";
        String name = "Tom";
        int age = 25;
        double salary = 5000.5456;
        String result = String.format(str, name, age, salary);
        System.out.println(result);
    }

    //String�ཫ�ַ���������ĸ��д
    public static void toFirstLetterUpperCase(){
        String str = "hello world";
        String result = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(result);
    }

    //String�ࣺ���ַ�����ÿ�����ʵ�����ĸ��д
    public static void toFirstLetterUpperCase2(){
        String str = "hello world";
        String[] arr = str.split(" ");
        for (int i=0; i<arr.length; i++){
            arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
        }
        String result = String.join(" ", arr);
        System.out.println(result);      //�����Hello World
    }
}
