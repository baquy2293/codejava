package Store;

import java.util.ArrayList;

public class Shop {
    ArrayList<Product> listProduct = new ArrayList<>();
    Product newProduct = new Product();

    public Shop() {
    }

    public void addProduct() {
        newProduct.inputInformation();
        listProduct.add(newProduct);
    }

    public int findIndexbyName(String name) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public void removeProduct(String name) {
        if (this.findIndexbyName(name) >= 0) {
            this.listProduct.remove(name);
        } else {
            System.out.println("khong tim thay ");
        }
    }

    public void iterateProduct() {
        for (Product x : listProduct) {
            x.viewInFomation();
        }
    }

    public void searchProduct(double minprice, double maxPrice) {
        for (Product x : listProduct) {
            if (x.getPrice() <= maxPrice && x.getPrice() >= maxPrice) {
                x.viewInFomation();
            }
        }
    }
}
