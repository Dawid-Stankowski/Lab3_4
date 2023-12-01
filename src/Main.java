public class Main {
    public static void main(String[] args) {

        //Break
        Petla:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    break Petla;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        //Continue
        Petla:
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    continue Petla;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}