package com.github.streams.practice.a_easy.numbers.problems;

import com.github.streams.practice.a_easy.numbers.EasyNumbersProblemSolution;
import com.github.streams.practice.a_easy.numbers.problems.ignore.data.DummyData;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class K_IntArray2DToListConverter {
  @Test
  void convertInt2DArrayToList() {
    final int[][] input = DummyData.random2DPrimitiveArray();

    var mySolution = EasyNumbersProblemSolution.convertInt2DArrayToList(input);
    var yourSolution = convert(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }

  private List<List<Integer>> convert(int[][] input) {
    return Arrays.stream(input).map(s -> Arrays.stream(s).boxed().toList()).toList();
  }
}
