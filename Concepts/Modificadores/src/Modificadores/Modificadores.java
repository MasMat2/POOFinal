package modificadores;

public class Modificadores {
    public static void main(String[] args) {

        // Hijo hijo;
        // hijo = new Hijo("hello");
        // System.out.printf(hijo.getVar());
        // hijo = new Hijo("world!");
        // System.out.printf(hijo.getVar());
        Contact c;
        int x = 0;
        while (x < 10) {
            c = new Contact();
            x = x + 1;
        }
        for (int i = 3; i <= 30; i += 3) {
            System.out.printf("%d\t", i);
        }
        System.out.println("");
        int i = 3;
        while (i <= 30) {
            System.out.printf("%d\t", i);
            i += 3;
        }
        System.out.println("");
        int i = 0;
        do {
        i += 3;
        System.out.printf("%d\t", i);
        } while (i < 30);

    }
}