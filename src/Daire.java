import java.util.Scanner;
// Formül : (𝜋 * (r*r) * 𝛼) / 360
public class Daire {
    public static void main(String[] args) {
        float pi = 3.14f;
        float r , a;
        Scanner vr =new Scanner(System.in);
        System.out.print("Buraya yarı çapını yazın : ");
        r = vr.nextFloat();
        System.out.print("Buraya merkez açısının ölçüsün yazın : ");
        a = vr.nextFloat();
        float dil = (pi* (r*r)*a) / 360;
        System.out.println("Daire diliminin alanı : "+ dil);

    }

}
