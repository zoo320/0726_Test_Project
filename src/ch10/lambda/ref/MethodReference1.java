package ch10.lambda.ref;
 
import java.util.Arrays;
 
public class MethodReference1 {
 
    public static void main(String[] args) {
        String[] langs = { "Phyhon", "C", "java", "JavaScript" };
        Arrays.sort(langs, (o1, o2) -> {
            return o1.compareTo(o2);
        });
        System.out.println(Arrays.toString(langs));
        
        Arrays.sort(langs, String::compareTo); 
        System.out.println(Arrays.toString(langs));
        
        Arrays.sort(langs, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(langs));
    }
}
