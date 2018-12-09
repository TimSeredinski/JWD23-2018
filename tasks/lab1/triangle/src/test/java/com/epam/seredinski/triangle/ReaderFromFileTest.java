package com.epam.seredinski.triangle;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.epam.seredinski.triangle.datareader.ReaderFromFile.readFromFile;

public class ReaderFromFileTest {

    @Test
    public void isEqualWhenLinesAreCorrect() {
        List<Double[]> arrayOfCoordinates = readFromFile("src/main/resources/fileWithCorrectData.txt");
        Double[][] arrayOfCorrectNumbers = {{1.0, 1.0, 5.0, 1.0, 5.0, 4.0}, {1.3, 2.2, 3.7, 1.1, 2.0, 3.5}, {0.8, 0.8, 6.2, 0.8, 3.3, 4.9},{1.0, 1.0, 5.0, 1.0, 3.0, 4.5}};
        List<Double[]> expectedArray = new ArrayList<>(Arrays.asList(arrayOfCorrectNumbers));
        Assert.assertEquals(expectedArray.get(expectedArray.size() - 1), arrayOfCoordinates.get(arrayOfCoordinates.size() - 1));
    }

    @Test
    public void isEqualSizeWhenOneLineIsIncorrect() {
        List<Double[]> actualArray = readFromFile("src/main/resources/fileWithOneIncorrectLine.txt");
        Double[][] arrayOfCorrectNumbers = {{1.0, 1.0, 5.0, 1.0, 5.0, 4.0}, {0.8, 0.8, 6.2, 0.8, 3.3, 4.9}};
        List<Double[]> expectedArray = new ArrayList<>(Arrays.asList(arrayOfCorrectNumbers));
        Assert.assertEquals(expectedArray.size(), actualArray.size());
    }
}

