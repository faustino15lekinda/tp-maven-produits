package ga.esiitech.tp;

import com.google.gson.Gson;

public class App {

    public static void main(String[] args) {
        Product clavier = new Product("Clavier", 15000, 3);

        System.out.println(clavier);
        System.out.println("Valeur du stock : " + clavier.getStockValue() + " FCFA");

        Gson gson = new Gson();
        String json = gson.toJson(clavier);
        System.out.println("En JSON : " + json);
    }
}