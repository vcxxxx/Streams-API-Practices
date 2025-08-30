package com.github.streams.practice.a_easy.numbers.problems;

import com.github.streams.practice.a_easy.numbers.EasyNumbersProblemSolution;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Re-arranges the elements of a numeric array to form the smallest possible value.
 *
 * <p>Example: Input: [1, 34, 3, 98, 9, 76, 45, 4] <br>
 * Output: 133444576998
 *
 * <p>Explanation: The numbers are re-arranged in ascending order, with single-digit numbers placed
 * before multi-digit numbers like [1,3,34,4,45,76,9,98].
 */
class F_AscendingNumberValue {

  private String getSmallestPossibleValue(List<Integer> input) {
    return input.stream()
        .map(String::valueOf)
        .sorted((a, b) -> (a + b).compareTo(b + a))
        .collect(Collectors.joining());
  }

  @Test
  public void test() {
    var input = List.of(1, 34, 3, 98, 9, 76, 45, 4);
    var mySolution = EasyNumbersProblemSolution.getSmallestPossibleValue(input);
    var yourSolution = getSmallestPossibleValue(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
