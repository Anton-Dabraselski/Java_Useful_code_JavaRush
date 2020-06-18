/* 
Чтение файла (ввод имя файла (путь) с консоли)
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        InputStream input = new FileInputStream(console.readLine());

        while (input.available() > 0){
            System.out.print((char) input.read());
        }
        System.out.println();
        input.close();
        console.close();
    }
}
