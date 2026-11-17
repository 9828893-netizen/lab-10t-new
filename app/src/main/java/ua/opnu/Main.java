package ua.opnu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    // Завдання 1: doubling
    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    // Завдання 2: square
    public static List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    // Завдання 3: moreY
    public static List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y" + s + "y")
                .collect(Collectors.toList());
    }

    // Завдання 4: noNeg
    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

    // Завдання 5: no9
    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> Math.abs(n) % 10 != 9)
                .collect(Collectors.toList());
    }

    // Завдання 6: noZ (фільтруємо рядки, які не містять літеру 'z')
    public static List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }

    // Завдання 7: refinedStrings (без дублікатів, сортування за спаданням довжини)
    public static List<String> refinedStrings(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .collect(Collectors.toList());
    }

    // Завдання 8: flatten (розбиваємо рядки "Ім'я Прізвище" за пробілом)
    public static List<String> flatten(List<String> strings) {
        return strings.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Перевірки з методички для простих завдань
        System.out.println("Завдання 1: " + doubling(Arrays.asList(1, 2, 3)));
        System.out.println("Завдання 2: " + square(Arrays.asList(1, 2, 3)));
        System.out.println("Завдання 3: " + moreY(Arrays.asList("a", "b", "c")));
        System.out.println("Завдання 4: " + noNeg(Arrays.asList(1, -2)));
        System.out.println("Завдання 5: " + no9(Arrays.asList(1, 2, 19)));
        System.out.println("Завдання 6: " + noZ(Arrays.asList("aaa", "bbb", "aza")));
        System.out.println("Завдання 7: " + refinedStrings(Arrays.asList("aa", "c", "aa", "bbb")));
        System.out.println("Завдання 8: " + flatten(Arrays.asList("John Wick", "John Snow")));
    }
}