package racingcar.domain;

import java.util.Objects;

public class Car {
    private final static int MAX_NAME_LENGTH = 5;

    private final String name;
    private Location location;

    public Car(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차의 이름은 5자를 초과할 수 없습니다.");
        }
        this.name = name;
        this.location = new Location();
    }

    public Car(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.isMovable()) {
            this.location = location.add();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(location, car.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }
}
