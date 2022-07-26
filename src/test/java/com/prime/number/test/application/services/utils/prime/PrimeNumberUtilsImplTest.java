package com.prime.number.test.application.services.utils.prime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberUtilsImplTest {
    @Test
    void isPrimeNumberReturnsFalseForEqualLessZero() {
        PrimeNumberUtilsImpl primeNumberUtils = new PrimeNumberUtilsImpl();
        boolean response = primeNumberUtils.isPrimeNumber(0);
        assertFalse(response);
    }
    @Test
    void isPrimeNumberReturnsFalseForOne() {
        PrimeNumberUtilsImpl primeNumberUtils = new PrimeNumberUtilsImpl();
        boolean response = primeNumberUtils.isPrimeNumber(1);
        assertFalse(response);
    }
    @Test
    void isPrimeNumberReturnsTrueForTwo() {
        PrimeNumberUtilsImpl primeNumberUtils = new PrimeNumberUtilsImpl();
        boolean response = primeNumberUtils.isPrimeNumber(2);
        assertTrue(response);
    }
    @Test
    void isPrimeNumberReturnsTrueForPrimeNumber() {
        PrimeNumberUtilsImpl primeNumberUtils = new PrimeNumberUtilsImpl();
        boolean response = primeNumberUtils.isPrimeNumber(11);
        assertTrue(response);
    }
    @Test
    void isPrimeNumberReturnsFalseForNotPrimeNumber() {
        PrimeNumberUtilsImpl primeNumberUtils = new PrimeNumberUtilsImpl();
        boolean response = primeNumberUtils.isPrimeNumber(10);
        assertFalse(response);
    }
}