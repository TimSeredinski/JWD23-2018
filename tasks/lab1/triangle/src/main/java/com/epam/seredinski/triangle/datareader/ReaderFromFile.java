package com.epam.seredinski.triangle.datareader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.epam.seredinski.triangle.validation.InputValidation.isValidInputString;

public class ReaderFromFile {

    public static List<Double[]> readFromFile(String path) {
        List<Double[]> arrayOfCoordinates = new ArrayList<>();
        try {
            List<String> lines = Files.lines(Paths.get(path)).collect(Collectors.toList());
            for (int i = 0; i < lines.size(); i++) {
                String[] str = lines.get(i).split(" ");
                if (!isValidInputString(str)) {
                    continue;
                }
                Double[] arr = new Double[6];
                for (int j = 0; j < str.length; j++) {
                    arr[j] = Double.parseDouble(str[j]);
                }
                arrayOfCoordinates.add(arr);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayOfCoordinates;
    }
}
