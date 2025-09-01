package com.github.streams.practice.a_easy.strings.problems;

import com.github.streams.practice.a_easy.strings.StringProblemsSolution;
import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class B_LargestWordTest {
  /**
   * Find the largest word in a given string. <br>
   * <br>
   * Example string:
   *
   * <pre>
   * Input: "I am interested123455 to grow in my organization"
   * Output: "interested123455"
   * </pre>
   *
   * @author ZahidKhan
   * @see StringProblemsSolution#findLargestWordInTheString(String)
   */
  @Test
  public void findLargestWordInTheString() {
    final String input = "I am interested123455 to grow in my organization";
    final String mySolution = StringProblemsSolution.findLargestWordInTheString(input);

    String yourSolution = findLargestWord(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }

  private String findLargestWord(String input) {
    return Arrays.stream(input.split(" ")).max(Comparator.comparingInt(String::length)).orElse("");
  }
}
