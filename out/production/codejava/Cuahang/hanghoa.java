package Cuahang;

import java.util.Scanner;

public class hanghoa {

    static void menu() {
        System.out.println("MENU");
        System.out.println(" 1 : add proproduct");
        System.out.println(" 2 : remoe product");
        System.out.println(" 3 : Iterrate product");
        System.out.println(" 4 : search product");
        System.out.println(" 5 : exit");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shop newshop = new Shop();
        product newproduct = new product();

        while (true) {
            menu();
            int chon = input.nextInt();
            switch (chon) {
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

                newshop.interProduc();
                    break;
                }
                case 4: {
                    System.out.println("nhap khoan gia ma ban muo tim");
                    double min = input.nextDouble();
                    double max = input.nextDouble();
                    newshop.searchproduct(min, max);
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
