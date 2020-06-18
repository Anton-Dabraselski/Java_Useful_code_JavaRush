/* 
Писатель в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader   = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile));
            String write = "";
            while (!write.equals("exit")){
                write = reader.readLine();
                writer.write(write);
                writer.newLine();
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        reader.close();
    }
}
