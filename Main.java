package com.austin;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Main {

    public static void main(String[] args) {

        double tax = .786;
        double tithe =.90;

     String key = JOptionPane.showInputDialog("What is your annual salary? \n if you want to enter hourly pay type 'hour'");

     if (key.equals("hour")) {

         String hourly = JOptionPane.showInputDialog("What will your hourly be?");
        double hourlyPay = Double.parseDouble(hourly);
         String hours = JOptionPane.showInputDialog("How many hours will you be working per week?");
         int weeklyHours = Integer.parseInt(hours);
         double hourlySalary = hourlyPay*weeklyHours*52;

         double taxedSalary = hourlySalary*tax;

         double tithedSalary = taxedSalary*tithe;

         double endSalary = tithedSalary;
         double endWeekly = endSalary/52;
         double endPaycheck = endSalary/26;
         double endMonthly = endSalary/12;

         JOptionPane.showMessageDialog(null, "Your yearly salary will be: " +
                 new DecimalFormat("0.00").format(hourlySalary) + "\n" +
                 "after taxes it will be: " + new DecimalFormat("0.00").format(taxedSalary) + "\n"
         +"after tithing you're looking at: " + new DecimalFormat("0.00").format(tithedSalary));

         JOptionPane.showMessageDialog(null, "So to sum it up..." + "\n" +
         "Yearly: " + new DecimalFormat("0.00").format(endSalary) + "\n" +
         "Monthly: " + new DecimalFormat("0.00").format(endMonthly) + "\n" +
         "Weekly: " + new DecimalFormat("0.00").format(endWeekly) + "\n" +
         "Per paycheck: " + new DecimalFormat("0.00").format(endPaycheck));
     }

     else{
             int salary = Integer.parseInt(key);
             double taxedSalary = salary*tax;
             double tithedSalary = taxedSalary*tithe;

             double yearlySalary = tithedSalary;
             double monthlySalary = yearlySalary/12;
             double weeklySalary = yearlySalary/52;
             double paycheckSalary = yearlySalary/26;

         JOptionPane.showMessageDialog(null, "Your yearly salary will be: " +
                 new DecimalFormat("0.00").format(salary) + "\n" +
                 "after taxes it will be: " + new DecimalFormat("0.00").format(taxedSalary) + "\n"
                 +"after tithing you're looking at: " + new DecimalFormat("0.00").format(tithedSalary));


         JOptionPane.showMessageDialog(null, "So to sum it up..." + "\n" +
                 "Yearly: " + new DecimalFormat("0.00").format(yearlySalary) + "\n" +
                 "Monthly: " + new DecimalFormat("0.00").format(monthlySalary) + "\n" +
                 "Weekly: " + new DecimalFormat("0.00").format(weeklySalary) + "\n" +
                 "Per paycheck: " + new DecimalFormat("0.00").format(paycheckSalary));
     }
    }
}
