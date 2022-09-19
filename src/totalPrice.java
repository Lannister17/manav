import java.util.Scanner;

public class totalPrice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pearkg,applekg,tomatokg, bananakg, auberginekg;
        float pear = 2.14f, apple = 3.67f, tomato = 1.11f, banana = 0.95f,aubergine = 5.00f;
        float totalPrice;

        System.out.print("Armut kac kilo aldınız :");
        pearkg = input.nextInt();
        System.out.print("Elma kac kilo aldınız :");
        applekg = input.nextInt();
        System.out.print("Domates kac kilo aldınız :");
        tomatokg = input.nextInt();
        System.out.print("Muz kac kilo aldınız :");
        bananakg = input.nextInt();
        System.out.print("Patlıcan kac kilo aldınız :");
        auberginekg = input.nextInt();

        totalPrice = pear * pearkg + apple * applekg + tomato * tomatokg + banana * bananakg + aubergine * auberginekg;
        System.out.println("Toplam tutar : " + totalPrice);

    }
}
