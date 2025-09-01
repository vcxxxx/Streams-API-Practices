package com.github.streams.practice.a_easy.strings.problems;

import com.github.streams.practice.a_easy.strings.StringProblemsSolution;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Finds the words with the given number of vowels in a given string. <br>
 * <br>
 * Example:
 *
 * <pre>
 *  "The quick brown fox jumps right over the little lazy dog.";
 * </pre>
 *
 * <pre>
 *   Number of Vowels: 2
 *   Words with Maximum Vowels: [quick, over, little]
 * </pre>
 *
 * <br>
 * Example:
 *
 * <pre>
 *  "Hello World";
 * </pre>
 *
 * <pre>
 *   Maximum Number of Vowels: 2
 *   Words with Maximum Vowels: [Hello, World]
 * </pre>
 */
class A_MatchesNoOfVowelsTest {
  @Test
  void testAM_MaxNoOfVowelsTest() {
    var input = "The quick brown fox jumps right over the little lazy dog.";
    final var length = 2;

    var mySolution = StringProblemsSolution.getMatchesVowels(input, length);
    var yourSolution = maxVowels(input, length);
    Assertions.assertEquals(mySolution, yourSolution);
  }

  private List<String> maxVowels(String input, int length) {

    final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    return Arrays.stream(input.split(" "))
        .filter(
            word -> word.chars().mapToObj(c -> (char) c).filter(VOWELS::contains).count() == length)
        .toList();
  }
}
