import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ScoreTest1 {


    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("ABBACCCCCAC", new ArrayList<>(Arrays.asList(3, 2, 6))),
                 Arguments.of("AABACCCCCAC", new ArrayList<>(Arrays.asList(4, 1, 6)))
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void calculateScoreTest(String score, ArrayList<Integer> expectedResult) {
        ArrayList<Integer> actualResult = Score1.calculateScore(score);
        assertEquals(expectedResult, actualResult);


    }
}

