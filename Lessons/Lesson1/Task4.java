// 📌 Напишите метод, который находит самую длинную строку общего
// префикса среди массива строк.
// 📌 Если общего префикса нет, вернуть пустую строку ""
package Lessons.Lesson1;

public class Task4 {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(maxPrefix(strs));
    }
    public static String maxPrefix (String[] words) {
        String[] strs = { "flower", "flow", "flight" };
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix == ""){
                    return "";
                }
            }
        }
        return prefix;
    }
}
