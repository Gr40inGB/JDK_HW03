package org.gr40in;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.multiply(15.1, 0.5));
        System.out.println(Calculator.sum(112.4, 123));

        Number[] arr1 = new Integer[]{1, 2, 3, 4};
        Number[] arr2 = new Double[]{1.5, 2.5, 3.5, 4.5};
        System.out.println(compareArrays(arr1, arr2));

        Animal[] arr3 = new Animal[]{new Cat("Tom"), new Animal("Monster"), new Dog("Boll")};
        Animal[] arr4 = new Animal[]{new Cat("Saimon"), new Animal("Thing"), new Dog("gaf")};
        Animal[] arr5 = new Animal[]{new Animal("Ani"), new Animal("Thing"), new Dog("Ok")};
        System.out.println(compareArrays(arr3, arr4));
        System.out.println(compareArrays(arr3, arr5));
    }

    public static <T> boolean compareArrays(T[] firstArray, T[] secondArray) {
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
//                System.out.println(firstArray[i].getClass());
//                System.out.println(secondArray[i].getClass());
                if (firstArray[i].getClass() != secondArray[i].getClass()) return false;
            }
            return true;
        }
        return false;
    }

    public static class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }
    }

    public static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }
    }

    public static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }
    }
}