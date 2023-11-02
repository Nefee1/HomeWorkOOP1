public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness ;
    private final int thirstForPower;

    public Slytherin(String name, int magicalTransgression, int powerOfMagic, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicalTransgression, powerOfMagic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public void comparison(Slytherin slytherin){
        if (cunning + determination + ambition + resourcefulness + thirstForPower > slytherin.getCunning()  + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getThirstForPower()){
            System.out.println(name + " сильнее " + slytherin.getName());
        }else {
            System.out.println(slytherin.getName() + " сильнее " + name);

        }
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                ", name='" + name + '\'' +
                ", magicalTransgression=" + magicalTransgression +
                ", powerOfMagic=" + powerOfMagic +
                '}';
    }

}




