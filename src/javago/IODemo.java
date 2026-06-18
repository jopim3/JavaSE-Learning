package javago;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class IODemo {

    public static void main(String[] args) throws Exception {
        // 1. 写文件（BufferedWriter + FileWriter）
        BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
        writer.write("Hello World");
        writer.newLine();
        writer.write("IO");
        writer.close();

        // 2. 读文件（BufferedReader + FileReader）
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        String line;
        while ((line=reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

        // 3. Files 工具类（最简单）
        List<String> list = Files.readAllLines(Paths.get("test.txt"));
        System.out.println(list);

    }
}
