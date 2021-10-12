package fr.ufrsciencestech.panier.Model;

public class Jus implements Fruit{
    private Fruit ingredient;

    public Jus(Fruit ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public boolean isSeedless() {
        return this.ingredient.isSeedless();
    }

    @Override
    public double getPrix() {
        return this.ingredient.getPrix() * 2;
    }

    @Override
    public String getOrigine() {
        return this.ingredient.getOrigine();
    }

    @Override
    public String toString() {
        return "Jus de " + this.ingredient.toString();
    }
}
