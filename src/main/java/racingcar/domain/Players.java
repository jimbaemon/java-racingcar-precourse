package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Players {
    private final static String PLAYER_SEPARATOR = ",";

    private final List<Car> players;

    public Players(final String players){
        String[] split = players.split(PLAYER_SEPARATOR);
        ArrayList<Car> playerList = new ArrayList<>();
        for (String carName : split) {
            playerList.add(new Car(carName));
        }
        this.players = playerList;
    }

    public Players(List<Car> players) {
        this.players = players;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Players players1 = (Players) o;
        return Objects.equals(players, players1.players);
    }

    @Override
    public int hashCode() {
        return Objects.hash(players);
    }
}
