public class Gryffindor extends Hogwarts {


    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int magicalTransgression, int powerOfMagic, int nobility, int honor, int bravery) {
        super(name, magicalTransgression, powerOfMagic);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void comparison(Gryffindor gryffindor) {
        if (nobility + honor + bravery > gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery()) {
            System.out.println(name + " сильнее " + gryffindor.getName());
        } else {
            System.out.println(gryffindor.getName() + " сильнее " + name);

        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Hogwarts.Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", name='" + name + '\'' +
                ", magicalTransgression=" + magicalTransgression +
                ", powerOfMagic=" + powerOfMagic +
                '}';
    }

}

