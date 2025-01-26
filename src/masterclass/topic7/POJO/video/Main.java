package masterclass.topic7.POJO.video;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Daniel";
                        case 5 -> "João";
                        default -> "No one";
                    },
                    "05/11/1999",
                    "Java MasterClass");
            System.out.println(s);
        }
    }
}
