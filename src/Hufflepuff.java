public class Hufflepuff extends Hogwarts{

    private final int hardworking;
    private final int loyal;
    private final int honest;

    public Hufflepuff(String name, int magicalTransgression, int powerOfMagic, int hardworking, int loyal, int honest) {
        super(name, magicalTransgression, powerOfMagic);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void comparison(Hufflepuff hufflepuff){
        if (hardworking + loyal + honest > hufflepuff.getHardworking()  + hufflepuff.getLoyal() + hufflepuff.getHonest()){
            System.out.println(name + " сильнее " + hufflepuff.getName());
        }else {
            System.out.println(hufflepuff.getName() + " сильнее " + name);

        }
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", name='" + name + '\'' +
                ", magicalTransgression=" + magicalTransgression +
                ", powerOfMagic=" + powerOfMagic +
                '}';
    }
}


















//