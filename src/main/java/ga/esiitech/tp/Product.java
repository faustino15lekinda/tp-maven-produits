package ga.esiitech.tp;

public class Product {
    private String name;
    private int price;
    private int quantity;

    // nom du produit
    // prix en FCFA
    // quantité en stock
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Valeur du stock = prix x quantité
    public int getStockValue() {
        return price * quantity;
    }

    // Élément Les 3 attributs private Le constructeur
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }
}