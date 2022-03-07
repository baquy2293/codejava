package Cuahang;

import java.util.ArrayList;

public class Shop {
    ArrayList<product> danhsachsanpham = new ArrayList<>();
    product newProduct = new product();
    public Shop() {
    }

    public void addProduct() {

        newProduct.inputInfor();
        danhsachsanpham.add(newProduct);
    }

    public int findIndexbyName(String name) {
        for (int i = 0; i < danhsachsanpham.size(); i++) {
            if (danhsachsanpham.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public void removeProduct(String name) {
        if (this.findIndexbyName(name) >= 0) {
            this.danhsachsanpham.remove(name);
        } else {
            System.out.println("khong tim thay ");
        }
    }

    public void interProduc() {
        for (product x : danhsachsanpham) {
            x.viewinfo();
        }
    }

    public void searchproduct(double minprice, double maxProduct) {
        for (product x : danhsachsanpham) {
            if (x.getPrice() <= maxProduct && x.getPrice() >= maxProduct) {
                x.viewinfo();
            }
        }
    }
}
