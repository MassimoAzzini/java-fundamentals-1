package org.learning.foods;

public class FavoriteFoods {
    public static void main(String[] args) {
        String[] foods = {"spiedo alla bresciana", "pizzoccheri", "pizza diavola", "pasta carbonara", "spezzatino", "torta meringata"};
        if (foods.length == 1){
            System.out.println("La classifica ha " + foods.length + " elemento");
            System.out.println("Il cibo preferito è :" + foods[0]);
        } else {
            System.out.println("La classifica ha " + foods.length + " elementi");
            System.out.println("Il primo cibo della classifica è :" + foods[0]);
            System.out.println("L'ultimo cibo della classifica è :" + foods[foods.length-1]);
            System.out.println("Il cibo di metà classifica è :" + foods[foods.length/2-1]);
        }

    }
}
