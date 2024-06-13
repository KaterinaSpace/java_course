// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
// результат a4b3c1d2.
package Lessons.Lesson2;

public class StringCompress {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(Compress(str));
}
public static String Compress(String str)
{
    StringBuilder  result = new StringBuilder();
    int count = 1; 
    for (int i = 1; i < str.length(); i++) {
        if(str.charAt(i) != str.charAt(i-1))
        {
            result.append(str.charAt(i - 1)).append(count);
            count = 1;
        }
        else
        {
            count++; 
        }
    }
    result.append(str.charAt(str.length()-1)).append(count);
    return result.toString(); 
}
}
