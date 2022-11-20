package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void calcSqr(int min, int max) {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(min, max);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}
