/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
ArrayList <Integer> nums = new ArrayList<Integer>();
nums.add(1);
nums.add(100);
nums.add(15);
nums.add(10);
nums.add(2);
nums.add(3);
nums.add(-1);
        Collections.sort(nums);
        int size = nums.size();
        System.out.println("Исходная, отсортированая коллекция чисел: " + nums);
ArrayList <Integer> nums1 = new ArrayList<Integer>();
        for (int i = 0; i <size; i++) {
if ((nums.get(i)>0) && (nums.get(i)<10)) nums1.add(i);
        }
        System.out.println("Коллекция чисел подходящая под условия задания: " + nums1);


    }
}
