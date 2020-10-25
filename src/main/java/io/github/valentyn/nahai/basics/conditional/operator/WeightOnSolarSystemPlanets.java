package io.github.valentyn.nahai.basics.conditional.operator;

import java.util.Scanner;

/*
 * Task:
 * Create a program that will ask the user about a solar system planet they want to visit.
 * And calculate the weight according to the user choose that they would have there.
 * The weight might be calculated using the following formula: weight = mass * surface gravity.
 * The "mass", "planet" should be asked from the user using Scanner class.
 * You MUST use only the different flavors of the "if" operator in this task.
 */
public class WeightOnSolarSystemPlanets {
    public static void main(String[] args) {
        final double SURFACE_GRAVITY_ON_MERCURY = 0.155;
        final double SURFACE_GRAVITY_ON_VENUS = 0.8975;
        final double SURFACE_GRAVITY_ON_EARTH = 1.000;
        final double SURFACE_GRAVITY_ON_MOON = 0.1660;
        final double SURFACE_GRAVITY_ON_MARS = 0.3507;
        final double SURFACE_GRAVITY_ON_JUPITER = 2.5374;
        final double SURFACE_GRAVITY_ON_SATURN = 1.0677;
        final double SURFACE_GRAVITY_ON_URANUS = 0.8947;
        final double SURFACE_GRAVITY_ON_NEPTUNE = 1.1794;
        final double SURFACE_GRAVITY_ON_PLUTO = 0.0899;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the planet which you would like to visit:");
        String planet = scanner.nextLine().toUpperCase();
        System.out.println("Enter your weight");
        double mass = scanner.nextDouble();

        if (planet.equals("MERCURY")) {
            System.out.println("Your weight will be there : " + mass * SURFACE_GRAVITY_ON_MERCURY);
        } else if (planet.equals("VENUS")) {
            System.out.println("Your weight will be: " + mass * SURFACE_GRAVITY_ON_VENUS);
        } else if (planet.equals("EARTH")) {
            System.out.println("Your weight will be: " + mass * SURFACE_GRAVITY_ON_EARTH);
        } else if (planet.equals("MOON")) {
            System.out.println("Your weight will be: " + mass * SURFACE_GRAVITY_ON_MOON);
        }else if(planet.equals("MARS")){
            System.out.println("Your weight will be: " + mass * SURFACE_GRAVITY_ON_MARS);
        }else if(planet.equals("JUPITER")){
            System.out.println("Your weight will be: " + mass * SURFACE_GRAVITY_ON_JUPITER);
        }else if(planet.equals("SATURN")){
            System.out.println("Your weight will be: " + mass * SURFACE_GRAVITY_ON_SATURN);
        }else if(planet.equals("URANUS")){
            System.out.println("Your weight will be: " + mass * SURFACE_GRAVITY_ON_URANUS);
        }else if(planet.equals("NEPTUNE")){
            System.out.println("Your weight will be: " + mass * SURFACE_GRAVITY_ON_NEPTUNE);
        }else if(planet.equals("PLUTO")){
            System.out.println("Your weight will be: " + mass * SURFACE_GRAVITY_ON_PLUTO);
        }else{
            System.out.println("There is no such planet");
        }
    }}

  