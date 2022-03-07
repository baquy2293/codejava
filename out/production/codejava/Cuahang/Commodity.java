package Store;

import java.util.Scanner;

public class Commoditycommodity {

    static void menu() {
        System.out.println("MENU");
        System.out.println(" 1 : Add proproduct");
        System.out.println(" 2 : Remove product");
        System.out.println(" 3 : Iterrate product");
        System.out.println(" 4 : Rearch product");
        System.out.println(" 5 : Exit");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shop newshop = new Shop();
        Product newProduct = new Product();

        while (true) {
            menu();
            int select = input.nextInt();
            switch (select) {
                case 1: {

                    newshop.addProduct();
                    break;
                }
                case 2: {

                    System.out.println("nhap ten can xoa");
                    String name = input.nextLine();
                    newshop.removeProduct(name);
                    break;
                }
                case 3: {

                newshop.iterateProduct();
                    break;
                }
                case 4: {
                    System.out.println("nhap khoan gia ma ban muo tim");
                    double min = input.nextDouble();
                    double max = input.nextDouble();
                    newshop.searchProduct(min, max);
                    break;
                }
                case 5: {
                   System.exit(0);
                    break;
                }
                default:
                    System.out.println("nhap tu 1 den 6");
            }
        }


    }
}
