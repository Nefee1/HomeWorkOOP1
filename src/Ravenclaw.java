public class Ravenclaw extends Hogwarts{
        private final int smart;
        private final int witty;
        private final int wise;
        private final int fullOfCreativity;

    public Ravenclaw(String name, int magicalTransgression, int powerOfMagic, int smart, int witty, int wise, int fullOfCreativity) {
        super(name, magicalTransgression, powerOfMagic);
        this.smart = smart;
        this.witty = witty;
        this.wise = wise;
        this.fullOfCreativity = fullOfCreativity;
    }

    public void comparison(Ravenclaw ravenclaw){
        if (smart + witty + wise + fullOfCreativity > ravenclaw.getSmart()  + ravenclaw.getWitty() + ravenclaw.getWise() + ravenclaw.getFullOfCreativity()){
            System.out.println(name + " сильнее " + ravenclaw.getName());
        }else {
            System.out.println(ravenclaw.getName() + " сильнее " + name);

        }
    }

    public int getSmart() {
        return smart;
    }

    public int getWitty() {
        return witty;
    }

    public int getWise() {
        return wise;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "smart=" + smart +
                ", witty=" + witty +
                ", wise=" + wise +
                ", fullOfCreativity=" + fullOfCreativity +
                ", name='" + name + '\'' +
                ", magicalTransgression=" + magicalTransgression +
                ", powerOfMagic=" + powerOfMagic +
                '}';
    }
}

