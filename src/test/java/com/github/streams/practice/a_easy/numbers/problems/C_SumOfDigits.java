package com.github.streams.practice.a_easy.numbers.problems;

import com.github.streams.practice.a_easy.numbers.EasyNumbersProblemSolution;
import com.github.streams.practice.a_easy.numbers.problems.ignore.data.DummyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Calculates the sum of digits of a given integer.
 *
 * <p>This method takes an integer as input, breaks it down into individual digits, and returns
 * their sum.
 *
 * <p>Example: <br>
 * Input = 123<br>
 * Output = 6 <br>
 * Explanation: (1 + 2 + 3)
 */
class C_SumOfDigits {

  private Long sumOfDigits(int input) {
    return String.valueOf(input).chars().map(Character::getNumericValue).asLongStream().sum();
  }

  @Test
  void testSumOfDigits() {
    final var input = DummyData.fakerNumber();
    var mySolution = EasyNumbersProblemSolution.sumOfDigits(input);
    var yourSolution = sumOfDigits(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
