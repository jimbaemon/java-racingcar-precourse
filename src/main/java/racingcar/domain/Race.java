package racingcar.domain;

import java.util.ArrayList;
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
        this.gameCount = gameCount.downCount();
        return players;
    }

    public boolean onPlay() {
        return gameCount.isLeft();
    }

    public List<Car> getWinners() {
        Car winner = findWinner();
        return findTieWithWinner(winner);
    }

    private Car findWinner() {
        Car winner = null;
        for(int i = 0; i < players.size()-1; i++){
            Car car = players.get(i);
            winner = car.whoIsWinner(players.get(i+1));
        }
        return winner;
    }

    private List<Car> findTieWithWinner(Car winner){
        List<Car> winners = new ArrayList<>();
        for (Car player : players) {
            getIfTie(winner, winners, player);
        }
        return winners;
    }

    private void getIfTie(Car winner, List<Car> winners, Car player) {
        if(player.isTie(winner)){
            winners.add(player);
        }
    }
}
