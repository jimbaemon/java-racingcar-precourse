package racingcar.controller;

import racingcar.domain.GameCount;
import racingcar.domain.Players;
import racingcar.domain.Race;
import racingcar.domain.RandomMovingStrategy;
import racingcar.ui.InputView;
import racingcar.ui.OutputView;

public class RacingCarController {
    public void playGame() {
        Race race = new Race(new Players(InputView.inputPlayers()),
                new GameCount(InputView.inputGameCount()),
                new RandomMovingStrategy());
        OutputView.printGameResult();
        while (race.onPlay()){
            OutputView.printResultPerRace(race.run());
        }
        OutputView.printWinners(race.getWinners());
    }
}
