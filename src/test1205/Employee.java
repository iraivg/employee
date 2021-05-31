/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1205;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author 2017_irinagi
 */
public class Employee {

    private String name;
    private double hours;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            this.name = name;
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: ");
        }

    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours >= 0 && hours <= 24) {
            this.hours = hours;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 1) {
            this.salary = salary;
        }
    }

    public Employee(String name, double hours, double salary) {
        this.name = name;
        this.hours = hours;
        this.salary = salary;
    }

    public Employee() {
        this("Ricko", 1, 2400);
    }

    public String toString() {
        return ("Employee" + "Name: " + name + "Hours: " + hours + "Salary: " + salary);
    }

    public void insert(LinkedList<Employee> arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name->");
        setName(input.next());
        System.out.println("Hours->");
        setHours(input.nextDouble());
        System.out.println("Salary->");
        setSalary(input.nextDouble());
        arr.add(new Employee(getName(), getHours(), getSalary()));
    }

    public LinkedList<Employee> bubbleSortSalary(LinkedList<Employee> arr) {
        Employee swap;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int t = 0; t < n - i - 1; t++) {
                if (arr.get(t).getSalary() > arr.get(t + 1).getSalary()) {
                    swap = arr.get(t);
                    arr.set(t, arr.get(t + 1));
                    arr.set(t + 1, swap);
                }
            }
        }
        return arr;
    }

    public void quickSort(LinkedList<Employee> arr, int low, int high) {
        if (low < high + 1) {
            int e = Sort(arr, low, high);
            quickSort(arr,low,e-1);
            quickSort(arr,e+1,high);
        }
    }

    public int Sort(LinkedList<Employee> arr, int low, int high) {

        Employee pivot = arr.get(low);
        Employee swap;

        do {
            while (low < high && arr.get(high).getHours() >= pivot.getHours()) {
                high--;
            }
            if (low < high) {
                swap = arr.get(low);
                arr.set(low, arr.get(high));
                arr.set(high, swap);

            }while(low<high && arr.get(low).getHours()<= pivot.getHours()){
                low++;
            }            if (low < high) {
                swap = arr.get(low);
                arr.set(low, arr.get(high));
                arr.set(high, swap);

            }
        } while (low < high);
        swap = arr.get(low);
        return low;

    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        Employee obj = new Employee();
        LinkedList<Employee> arr = new LinkedList<>();
    }

    public static void main(String[] args) {
        Employee obj = new Employee();

    }

}
ddfhvgouehgjebvjuohegube jhejhghjuig