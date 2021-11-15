package com.pb.nesterenko.hw7;


public class Atelier {
    public static void main(String[] args)  {
        Tshirt tshirt = new Tshirt(Size.XS, prise:150, color: "pink");
        Pants pants = new Pants();
        Skirt skirt = new Skirt();
        Tie tie = new Tie();


        Clothes[] clothes = {tshirt, skirt, tie, pants};

        public static void dressMan(clothes){
            System.out.println("Чоловічий одяг");
            for (Clothes clothe: clothes ) {
                if (Clothes instanceof Tshirt) {
                    System.out.println("футболка, розмір -" + tshirt.getSize() + "колір-" + tshirt.getColor() +
                            "ціна -" + tshirt.getPrise());
                }
            }
        }
        public static void dressWoman(clothes){
                System.out.println("Жіночий одяг");
        for (Clothes clothe: clothes ) {
            if (Clothes instanceof Skirt) {
                System.out.println("юбка, розмір -" + skirt.getSize() + "колір-" + skirt.getColor() +
                        "ціна -" + skirt.getPrise());
            }
        }
        }

}
