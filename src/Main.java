public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Gryffindor("HarryPotter", 99, 99, 99, 99, 99),
                new Gryffindor("HermioneGranger", 88, 88, 88, 88, 88),
                new Gryffindor("RonWeasley", 77, 77, 77, 77, 77),
                new Hufflepuff("ZachariahSmith", 15, 1, 4, 16, 17),
                new Hufflepuff("CedricDiggory", 16, 71, 81, 61, 32),
                new Hufflepuff("JustinFinchFletchley", 1, 31, 5, 21, 17),
                new Slytherin("DracoMalfoy", 79, 81, 91, 71, 64, 85, 46),
                new Slytherin("GrahamMontague", 1, 1, 1, 1, 1, 1, 1),
                new Slytherin("GregoryGoyle", 2, 2, 2, 2, 2, 2, 2),
                new Ravenclaw("zhouChang", 46, 78, 46, 31, 28, 7),
                new Ravenclaw("padmaPatil", 46, 17, 1, 31, 46, 82),
                new Ravenclaw("marcusBelby", 4, 81, 14, 3, 1, 1),
        };
        for (int i = 0; i < hogwarts.length; i++) {
            for (int d = i + 1; d < hogwarts.length - 1; d++) {
                hogwarts[i].comparison(hogwarts[d]);
            }
        }
    }
}
//