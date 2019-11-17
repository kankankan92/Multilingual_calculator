package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TranslationHelper {
    public static Map<String, String> getTranslation(String pathname) {
        Map<String, String> translation = new HashMap<>();

        try {
            translation = Files.lines(Paths.get(pathname))
                    .map(item -> item.split("="))
                    .collect(Collectors.toMap(item -> item[0].trim(), item -> item[1].trim()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return translation;
    }
}
