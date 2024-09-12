package com.solvd.laba.homework7;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Executor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the file path: ");
        String filePath = input.nextLine();
        filePath = StringUtils.strip(filePath, "\""); //removes quotations if filePath is enclosed by them

        try {
            File myFile = new File(filePath);

            /* The code below reads the contents of a file and returns the contents as one large String with all characters set to lower case
            and then separates each word designated by the separator characters and then stores each word as an element in an array. */
            String[] splitContent = StringUtils.split(FileUtils.readFileToString(myFile, "UTF-8").toLowerCase(), " \n\t\r.,;:!?()[]{}\"");

            /* For each word in the splitContent array: add the word to the map as a key.
            The default value is set to 0 for if the word is not in the map.
            Everytime a word is added, the value that gets returned from that word as a key will increment by 1. */
            Map<String, Integer> wordCount = new HashMap<>();
            for (String word: splitContent) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            /* For every word in the splitContent array, count the number of words that only appear once.
            If the value returned is 1, then the word only appeared once. */
            int uniqueWordCount = 0;
            for (String word: splitContent) {
                if (wordCount.getOrDefault(word, 0) == 1) {
                    uniqueWordCount++;
                }
            }

            /* Write to the file by adding a new line with the number of unique words. */
            FileUtils.writeStringToFile(myFile, String.format("\nNumber of unique words: %d", uniqueWordCount), "UTF-8", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
