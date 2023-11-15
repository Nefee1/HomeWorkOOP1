public class Hogwarts {
    private String name;
    private int magicalTransgression;
    private int powerOfMagic;

    public Hogwarts(String name, int magicalTransgression, int powerOfMagic) {
        this.name = name;
        this.magicalTransgression = magicalTransgression;
        this.powerOfMagic = powerOfMagic;
    }

    public String getName() {
        return name;
    }

    public int getMagicalTransgression() {
        return magicalTransgression;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicalTransgression=" + magicalTransgression +
                ", powerOfMagic=" + powerOfMagic +
                '}';
    }

    public void comparison(Hogwarts hogwarts){
        if (powerOfMagic + magicalTransgression > hogwarts.getMagicalTransgression()  + hogwarts.getPowerOfMagic()){
            System.out.println(name + " сильнее " + hogwarts.getName());
        }else {
            System.out.println(hogwarts.getName() + " сильнее " + name);

        }
    }
}



//