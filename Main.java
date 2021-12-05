public class Main {

    private static Scheiße scheiße = new Scheiße("Scheiße!");


    public static void main(String args[]){

        Schleife.Schleife();

    }

}

class Buchstaben {
    static String[] test = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k","l", "m", "n", "o", "p", "q", "r", "s","t","u","v","w","x","y","z"};
}

class Scheiße {
    static String scheiße = "";
    public Scheiße(String scheiße) {
        this.scheiße = scheiße;
    }

    public static void gibaus() {
        String[] echtertest = Buchstaben.test;
        String ausrufezeichen1 = "!";
        char ausrufezeichen = ausrufezeichen1.charAt(0);
        Print.print(echtertest[18]+echtertest[2]+echtertest[7]+echtertest[4]+echtertest[8]+echtertest[18]+echtertest[18]+echtertest[4]+ausrufezeichen);
    }

}

class Print {
    public static void print(String a){

        System.out.println(a);

    }
}

class Schleife {

    public static void Schleife() {
        while(Scheiße.scheiße == "Scheiße!"){
            Scheiße.gibaus();
        }
    }

}
