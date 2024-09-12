package com.solvd.laba.homework7;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
public class Executor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the file path: ");
        String filePath = input.nextLine();
        filePath = StringUtils.strip(filePath, "\"");

        try {
            File myFile = new File(filePath);
            String content = FileUtils.readFileToString(myFile, "UTF-8");
            String[] splitContent = StringUtils.split(content, " \n\t\r.,;:!?()[]{}\"");
            Set<String> uniqueWords = new HashSet<>();
            for (String word : splitContent) {
                if (StringUtils.isNotBlank(word)) {
                    uniqueWords.add(word.toLowerCase());
                }
            }
            String myString = String.format("\nNumber of unique words: %d", uniqueWords.size());
            FileUtils.writeStringToFile(myFile, myString, "UTF-8", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
