public class Main {

    private static Scheiße scheiße = new Scheiße("Scheiße!");


    public static void main(String args[]){

        Schleife.Schleife();

    }

}

class Scheiße {
    static String scheiße = "";
    public Scheiße(String scheiße) {
        this.scheiße = scheiße;
    }

    public void gibaus() {
        Print.print("Scheiße");
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
            Print.print("Scheiße!");
        }
    }

}
