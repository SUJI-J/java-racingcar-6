package racingcar;

import java.util.List;

import static racingcar.GameMessage.INPUT_CAR_MESSAGE;
import static racingcar.GameMessage.INPUT_ATTEMPT_MESSAGE;
import static racingcar.GameMessage.OUTPUT_RESULT_MESSAGE;
import static racingcar.GameMessage.OUTPUT_WINNER_MESSAGE;

public class OutputView {

    public static void printRequestCar() {
        System.out.println(INPUT_CAR_MESSAGE);
    }

    public static void printRequestAttempt() {
        System.out.println(INPUT_ATTEMPT_MESSAGE);
    }

}
