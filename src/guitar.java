import java.util.Objects;

public class guitar {
    public String play,nastr, swapstr;

    public guitar(String play, String nastr, String swapstr) {
        this.play = play;
        this.nastr = nastr;
        this.swapstr = swapstr;
    }

    public String getPlay() {
        return play;
    }

    public String getNastr() {
        return nastr;
    }

    public String getSwapstr() {
        return swapstr;
    }


    @Override
    public String toString() {
        return "guitar{" +
                "play='" + play + '\'' +
                ", nastr='" + nastr + '\'' +
                ", swapstr='" + swapstr + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        guitar guitar = (guitar) o;
        return play.equals(guitar.play) && nastr.equals(guitar.nastr) && swapstr.equals(guitar.swapstr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(play, nastr, swapstr);
    }
}
