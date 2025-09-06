package com.github.streams.practice.a_easy.strings.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.streams.practice.a_easy.strings.StringProblemsSolution;
import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.Test;

class I_SecondHighestWordTest {
  @Test
  public void find2ndHighestWord() {
    final String input = "I am interested123455 to grow in my organization";
    String mySolution = StringProblemsSolution.find2ndLargestWordInTheString(input);

    final String yourSolution = solution(input);

    assertEquals(mySolution, yourSolution);
  }

  private String solution(String input) {
    return Arrays.stream(input.split(" "))
        .sorted(Comparator.comparing(String::length, Comparator.reverseOrder()))
        .skip(1)
        .findFirst()
        .orElse("");
  }
}
