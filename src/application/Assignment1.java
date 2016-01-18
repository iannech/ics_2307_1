package application;

import model.Dice;
import model.Results;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by M on 1/18/2016.
 * <p>
 * The main application class that initiates everything
 */
public class Assignment1 {

    public static void main(String[] args) {
        new Assignment1().showResults(new Assignment1().tossDice());
    }

    private void showResults(List<Dice> diceList) {
        int frequency = 0;
        Results results;
        List<Results> resultsList = new ArrayList<>();
        System.out.println("Start finishing up...Analysing samples created");
        for (int face = 1; face <= 6; face++) {
            for (Dice dice : diceList) {
                if (dice.getFace() == face)
                    frequency++;
            }

            results = new Results();
            results.setFace(face);
            results.setFrequency(frequency);
            results.setPercentage(frequency / 10);

            resultsList.add(results);
            frequency = 0;
        }

        System.out.println("\n\nFace\tFrequency\tPercentage");
        for (Results r : resultsList) {
            System.out.println(r.getFace() + "\t\t" + r.getFrequency() + "\t\t\t" + r.getPercentage());
            frequency += r.getFrequency();
        }

        System.out.println("\n\ntotal frequency : " + frequency);
    }

    private List<Dice> tossDice() {
        Dice dice;
        int randomNum;
        List<Dice> dices = new ArrayList<>();
        System.out.println("Drink some coffee, might be a while :-)\nGenerating random numbers...");
        for (int i = 0; i < 1000; i++) {
            randomNum = new Random().nextInt(12);
            dice = new Dice(toFace(randomNum));
            dices.add(dice);
        }

        return dices;
    }

    private int toFace(int r) {
        if (r >= 0 && r < 3) {
            return 1;
        } else if (r >= 3 && r < 5) {
            return 2;
        } else if (r >= 5 && r < 7) {
            return 3;
        } else if (r >= 7 && r < 9) {
            return 4;
        } else if (r >= 9 && r < 11) {
            return 5;
        } else if (r >= 11 && r < 13) {
            return 6;
        }

        return 0;
    }
}
