public class WhatIf {
    public static void main(String[] args) {
        int cats = 20;
        int dogs = 50;
        int people = 80;
        
        if (people>cats) {
        System.out.println("People are rulers of the earth");
        }
        if (cats>people) {
        System.out.println("Cats, cats everywhere!");
        }
        if (dogs>cats) {
        System.out.println("Dogs are everywhere, too much barking!");
        }
        if (cats>dogs) {
        System.out.println("Cats are better than dogs");
        }
      
        dogs += 30;
      
        if (people>=dogs) {
        System.out.println("People are greater than or equal to dogs");
        }
        if (dogs>=people) {
        System.out.println("Dogs are greater than or equal to people");
        }
        if (people==dogs) {
        System.out.println("People are equal to dogs");
        }
    }
}
