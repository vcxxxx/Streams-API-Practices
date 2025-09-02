package com.github.streams.practice.a_easy.numbers.problems;

import com.github.streams.practice.a_easy.numbers.EasyNumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class J_MeanOfNumbers {
  @Test
  void meanOfNumbers() {
    final var input =
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

    final var mySolution = EasyNumbersProblemSolution.meanOfNumbers(input);
    final var yourSolution = mean(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }

  private double mean(List<Integer> input) {
    return input.stream().mapToInt(Integer::intValue).average().getAsDouble();
  }
}
