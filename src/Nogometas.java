public class Nogometas extends Sportas implements Comparable<Nogometas> {
    private int brojGolova;

    public Nogometas(String ime, int brojDresa, int brojGolova) {
        super(ime, brojDresa);
        this.brojGolova = brojGolova;
    }

    @Override          // time se osiguramo da nam netko ne pošalje nepostojeći objekt - s @NotNull
    public int compareTo(Nogometas prvi) {  // može i public int compareTo(@NotNull Nogometas prvi)
        return prvi.getBrojGolova() - this.getBrojGolova();
    }

    @Override
    public String toString() {
        return "Nogometaš: " + getIme() + ", Dres: " + getBrojDresa() + ", Golovi: " + brojGolova;
    }

    public int getBrojGolova() {
        return brojGolova;
    }

    public void setBrojGolova(int brojGolova) {
        this.brojGolova = brojGolova;
    }

}
