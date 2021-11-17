import java.util.Objects;

public class struna extends guitar {
    public int struna_mest;

    public struna(String play, String nastr, String swapstr, int struna_mest) {
        super(play, nastr, swapstr);
        this.struna_mest = struna_mest;
    }

    @Override
    public String getPlay() {
        return super.getPlay();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        struna struna = (struna) o;
        return struna_mest == struna.struna_mest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), struna_mest);
    }
}
