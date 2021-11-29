package com.pb.nesterenko.hw10;

public class Main {
    public static void main(String[] arg) throws Exception, IndexException {
        NumBox<java.lang.Float> floatNumBox = new NumBox<>(5);
        try {
            floatNumBox.add(0, num:4.5F);
            floatNumBox.add(1, num:5.5F);
            floatNumBox.add(2, num:3.5F);
            floatNumBox.add(3, num:8.5F);
            floatNumBox.add(5, num:46.5F);

        }
        catch (Exception e) {
            System.out.println('немає місця в масиві');
            try{
                float float0 = floatNumBox.get(0);
                float float1 = floatNumBox.get(1);
                float float2= floatNumBox.get(2);
                float float3 = floatNumBox.get(3);
                float float4 = floatNumBox.get(4);

                System.out.println(float0);
                System.out.println(float1);
                System.out.println(float2);
                System.out.println(float3);
                System.out.println(float4);

            }

        }
        NumBox<Double> numBox2 = new NumBox<>(5);
        numBox2.add(new Double(num:6.5));
        numBox2.add(new Double(num:4.5));
        numBox2.add(new Double(num:3.5));
        numBox2.add(new Double(num:1.5));

        Double number2 = (Double) numBox2.get(1);
        System.out.println("значення другого елемента масива");
        System.out.println("масив повний");
        System.out.println("середнє арефметичне значення");
        System.out.println("сума всіх елементів");
        System.out.println("максимальний елемент масива");


    }


}
