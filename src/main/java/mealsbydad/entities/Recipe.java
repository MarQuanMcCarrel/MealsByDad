package mealsbydad.entities;

import java.util.Collection;
import java.util.HashSet;

public class Recipe {


    private int id;
    private String name;
    private String description;
    private String ingredients;
    private String instructions;
    private Collection<User> userLikes = new HashSet<>();
    private User author;


    public Recipe() {
    }

    public Recipe(User user, String name, String description, String ingredients, String instructions) {
        this.author = user;
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.instructions = instructions;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return this.ingredients;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getInstructions() {
        return this.instructions;
    }

    public void setUserLikes(User user) {
        userLikes.add(user);
    }

    public Collection<User> getUserLikes() {
        return this.userLikes;
    }

    public User getAuthor() {
        return this.author;
    }
}
