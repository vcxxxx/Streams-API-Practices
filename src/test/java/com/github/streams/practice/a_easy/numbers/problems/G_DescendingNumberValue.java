package com.github.streams.practice.a_easy.numbers.problems;

import com.github.streams.practice.a_easy.numbers.EasyNumbersProblemSolution;
import com.github.streams.practice.a_easy.numbers.problems.ignore.data.DummyData;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * Given a numeric array , re arrange the elements to form a highest possible value.
 * Input:  {1, 34, 3, 98, 9, 76, 45, 4};
 * Output: 998764543431
 * Explanation: 9,98,76,45,4,34,3,1
 * */
class G_DescendingNumberValue {

  private String getHighestValue(List<Integer> input) {
    return input.stream()
        .map(String::valueOf)
        .sorted((a, b) -> (b + a).compareTo(a + b))
        .collect(Collectors.joining());
  }

  @Test
  public void test() {
    var input = DummyData.fakeList(7);
    var mySolution = EasyNumbersProblemSolution.getHighestPossibleValue(input);
    var yourSolution = getHighestValue(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
