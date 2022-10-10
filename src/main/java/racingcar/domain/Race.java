package racingcar.domain;

import java.util.List;

public class Race {
    private List<Car> players;
    private GameCount gameCount;
    private final MovingStrategy movingStrategy;

    public Race(List<Car> players, GameCount gameCount, MovingStrategy movingStrategy) {
        this.players = players;
        this.gameCount = gameCount;
        this.movingStrategy = movingStrategy;
    }

    public List<Car> run() {
        for (Car player : players) {
            player.move(movingStrategy);
        }
        return players;
    }
}
