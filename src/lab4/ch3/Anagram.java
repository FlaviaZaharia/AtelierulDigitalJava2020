package lab4.ch3;


import java.io.FileWriter;
import java.io.IOException;

public class Anagram {
    private static String aux="";
        public static void main(String[] args) throws IOException {
            String str = "listen";
            System.out.println("String is: "+str);
            System.out.println("Anagram of the given string is: ");
            FileWriter outputStream = new FileWriter("./src/lab4/ch3/output.txt");
                int size = str.length();
                Anagram a = new Anagram();
                a.anagram(str, 0, size - 1);
                outputStream.write(aux);
                System.out.println(aux);

        }
        private void anagram(String str, int start, int end){
            if (start == end)
                aux+=str+'\n';
               //System.out.println(str);
            else {
                for (int i = start; i <= end; i++) {
                    str = swap(str, start, i);
                    anagram(str, start + 1, end);
                    str = swap(str, start, i);
                }
            }
        }
        public String swap(String a, int i, int j)
        {
            char temp;
            char[] charArray = a.toCharArray();
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
        }
    }

