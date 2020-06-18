/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            //BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
            FileInputStream input = new FileInputStream(reader.readLine());
            BufferedReader br = new BufferedReader(new InputStreamReader(input));

            List<Integer> list = new ArrayList<>();
            int line;
            while (br.ready()){
                line = Integer.parseInt(br.readLine());
                list.add(line);
            }

            Collections.sort(list);

            for (int j = 0; j < list.size(); j++) {
                if(list.get(j)%2==0) {
                    System.out.println(list.get(j));
                }
            }
            reader.close();
            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
