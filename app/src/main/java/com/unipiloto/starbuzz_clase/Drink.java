package com.unipiloto.starbuzz_clase;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks={
            new Drink( name: "Latte", description: "Una taza de expreso cubierta con crema de leche", R.drawable.capuccino);
            new Drink( name: "Capuccino", description: "Una taza de expreso con leche caliente y flameado de leche", R.drawable.latte);
            new Drink( name: "Filter", description: "Una taza de expreso con leche caliente y flameado de leche", R.drawable.filter);
    };

    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
