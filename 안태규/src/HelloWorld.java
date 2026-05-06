import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){
        int num = 1;
        double width = 12.34;
        String content = "Programming";
        num = 10;
        System.out.println(width);

        double a = 1.23;
        float b = 3.45f;

        char char_1 = 'a';
        char char_2 = 97;
        char char_3 = 43;
        char char_4 = 0x61;

        System.out.println(char_1);
        System.out.println(char_2);
        System.out.println(char_3);
        System.out.println(char_4);
        final double PI = 3.14;  //상수는 전체 대문자
        System.out.println(PI);

        //형변환 byte < sh < int < long << float < double
        short sh = 1;
        int i = sh;
        System.out.println(i);
        double d = i;
        System.out.println(d);
        sh = (short) d;
        System.out.println(sh);
        sh = (short) (d + i);
        System.out.println(sh);

        //문자열 저장 방식
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello";
        //변수의 주소값 비교
        if (str1 == str2){
            System.out.println("1 == 2");
        }
        if (str2 == str3){
            System.out.println("2 == 3");
        }
        if (str3 == str1){
            System.out.println("3 == 1");   // 같은 값은 같은 주소로 처리함
        }
        // 주소는 1과 3만 같아서 마지막만 출력

        //변수에 저장된 값 비교
        if (str1.equals(str2)){
            System.out.println("1 eq 2");
        }
        if (str2.equals(str3)){
            System.out.println("2 eq 3");
        }
        if (str3.equals(str1)){
            System.out.println("3 eq 1");
        }
        //저장된 값은 모두 같기 때문에 모두 출력

        //문자열 병합
        str2 = "world!";
        System.out.println(str1+", "+str2);

        //StringBuilder가 더 효율적이고 빠름
        StringBuilder strbdr1 = new StringBuilder("Hello");
        strbdr1.append(", World!");
        System.out.println(strbdr1); //toString으로 변환 안 하고도 출력 잘 되네
        System.out.println(strbdr1.toString());

        String name = "아라아라아라";
        System.out.println(name.indexOf("라")); //여러개는 인식 못 함, 첫 번째 것만
        System.out.println(name.substring(2, 5));  //"아라아" 2~4번 인덱슦까지 출력

        String low = "abc";
        String up = "ABC";
        low = low.toUpperCase();
        up = up.toLowerCase();
        System.out.println(low+up);
        if (low.equals(up)){
            System.out.println(low);
        }
        if (low.equalsIgnoreCase(up)){  // 대소문자 무시하고 비교
            System.out.println(low);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println();

        printNum(mod(7,4));
    }

    static int mod (int a, int b) {
        int result = a % b;
        return result;
    }

    static void printNum (int a) {
        System.out.println(a);
    }
    static void printListElements(ArrayList list) {

        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
