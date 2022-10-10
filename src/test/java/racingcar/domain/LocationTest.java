package racingcar.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LocationTest {

    @Test
    void 위치값_생성시_0으로_설정(){
        Location location = new Location();
        Assertions.assertThat(location).isEqualTo(new Location(0));
    }

    @Test
    void 위치값_증가시_1만큼_증가(){
        Location location = new Location();
        Location AddedLocation = location.add();
        Assertions.assertThat(AddedLocation).isEqualTo(new Location(1));
    }

}