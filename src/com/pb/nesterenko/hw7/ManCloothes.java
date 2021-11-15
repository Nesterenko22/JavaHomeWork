package com.pb.nesterenko.hw7;

public interface ManCloothes {
    default void dressMan() {
    System.out.println("Одягнути чоловіка");
}
    static void dressTshirt() {
        System.out.println("назва" + "розмір" + "ціна" + "колір");
    }


}

}
