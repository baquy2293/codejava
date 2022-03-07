package Store;

import java.util.Arrays;
import java.util.Scanner;

public class product {
    private String Name;
    private String Description;
    private double price;
    private int[] rate = new int[3];
    Scanner input = new Scanner(System.in);

    public product() {
    }

    public product(String name, String description, double price, int[] rate) {
        Name = name;
        Description = description;
        this.price = price;
        this.rate = rate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int[] getRate() {
        return rate;
    }

    public void setRate(int[] rate) {
        this.rate = rate;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
public double getrate()
{
 return (rate[1]+rate[2]+rate[0])/3.0;
}
    public void inputInfor() {
        System.out.println("nhap ten");
        this.Name = input.nextLine();
        System.out.println("Description");
        this.Description = input.nextLine();
        System.out.println("nhap price");
        this.price = input.nextDouble();
        System.out.println("nhap 3 danh gia");
        rate[0] = input.nextInt();
        rate[1] = input.nextInt();
        rate[2] = input.nextInt();
        String tmp = input.nextLine();
    }

    @Override
    public String toString() {
        return "product{" +
                "Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", price=" + price +
                ", rate=" + getrate()+
                '}';
    }

    public void viewinfo() {
        System.out.println(this.toString());
    }

}
