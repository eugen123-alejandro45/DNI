public class Main {
    public static void main(String[] args) {
        DNI dni = new DNI(12345678, 'E');
        System.out.println(dni);
        System.out.println(dni.correctDni());

        DNI dni2 = new DNI("13245678J");
        System.out.println(dni2);
    }
}
