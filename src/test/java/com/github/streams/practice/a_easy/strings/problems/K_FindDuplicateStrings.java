package com.github.streams.practice.a_easy.strings.problems;

import com.github.streams.practice.a_easy.strings.StringProblemsSolution;
import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class K_FindDuplicateStrings {
  @Test
  void findDuplicateStrings() {
    final var input = List.of("Hellow", "World", "How", "are", "you", "How", "are", "you");
    final var mySolution = StringProblemsSolution.findDuplicateStrings(input);
    final var yourSolution = solution(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }

  private List<String> solution(List<String> input) {
    Set<String> set = new HashSet<>();
    return input.stream().filter(s -> !set.add(s)).distinct().toList();
  }
}
