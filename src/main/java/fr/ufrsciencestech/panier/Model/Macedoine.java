package fr.ufrsciencestech.panier.Model;

import java.util.ArrayList;

public class Macedoine implements Fruit{
    private ArrayList<Fruit> ingredients;

    public Macedoine() {
        this.ingredients = new ArrayList<Fruit>();
    }

    public void addFruit(Fruit f) {
        this.ingredients.add(f);
    }

    public int getSize()
    {
        return this.ingredients.size();
    }

    @Override
    public boolean isSeedless() {
        for (Fruit f : this.ingredients)
        {
            if (f.isSeedless() == false)
            {
                return false;
            }
        }
        return true;
    }

    @Override
    public double getPrix() {
        double amount = 0;
        for (Fruit f : this.ingredients)
        {
            amount += f.getPrix();
        }

        return amount;
    }

    @Override
    public String getOrigine() {
        String origine = "";
        for (Fruit f : this.ingredients) {
            origine += f.getOrigine() + ", ";
        }

        return origine;
    }

    @Override
    public String toString(){
        String info = "[macedoine]: {";
        for (Fruit f : this.ingredients) {
            info += f.getOrigine() + ", ";
        }
        info += "} ";

        return info;
    }
}
