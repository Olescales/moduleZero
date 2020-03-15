package controller.Session;

import model.Flower;
import model.Wrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State {

    private List<Flower> flowers;
    private List<Wrapper> packSheet;

    public State() {
        flowers = new ArrayList<>();
        packSheet = new ArrayList<>();
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public List<Wrapper> getPackSheet() {
        return packSheet;
    }

    public void setPackSheet(List<Wrapper> packSheet) {
        this.packSheet = packSheet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        State state = (State) o;

        if (!Objects.equals(flowers, state.flowers)) return false;
        return Objects.equals(packSheet, state.packSheet);
    }

    @Override
    public int hashCode() {
        int result = flowers != null ? flowers.hashCode() : 0;
        result = 31 * result + (packSheet != null ? packSheet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "State{" +
                "flowers=" + flowers +
                ", packSheet=" + packSheet +
                '}';
    }
}
