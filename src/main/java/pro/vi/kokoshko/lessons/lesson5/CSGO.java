package pro.vi.kokoshko.lessons.lesson5;

public class CSGO {
    public static void main(String[] args) {
        String CSGO = "CT";
        int q = 4;
        int w = 9;
        int e = 15;
        int r = 19;
        int t = 28;
        double resultCSGO = (q + w + e + r + t) / 5;
        String CS2 = "T";
        int a = 3;
        int s = 5;
        int d = 11;
        int f = 24;
        int g = 32;
        double resultCS2 = (a + s + d + f + g) / 5;
        if (resultCSGO > resultCS2){
            System.out.println("Win CSGO");
        }
            else if (resultCSGO < resultCS2){
            System.out.println("Win CSGO");
        }
            else if (resultCSGO == resultCS2){
            System.out.println("draw");
            }
    }

}
