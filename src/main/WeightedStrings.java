package main;

import java.util.*;

public class WeightedStrings {
    private Map<Character, Integer> letterWeights;

    private WeightedStrings() {
        letterWeights = new HashMap<>();
        char letter = 'a';
        for(int i = 1; i<=26; i++) {
            letterWeights.put(letter, i);
            letter++;
        }
    }

    private List<Integer> findAllPossibleWeights(String input) {
        List<Integer> weights = new ArrayList<>();

        int sum = 0;
        for(int i = 0; i<input.length(); i++) {
            for(int j = i; j<input.length(); j++) {
                if(input.charAt(i) == input.charAt(j)) {
                    sum = sum + letterWeights.get(input.charAt(j));
                } else {
                    break;
                }
            }
            weights.add(sum);
            sum = 0;
        }
        return weights;
    }

    public static void main (String args[]) {
        WeightedStrings o1 = new WeightedStrings();
        System.out.println(o1.letterWeights);

        Scanner sn = new Scanner(System.in);
        String input = sn.next();
        int n = sn.nextInt();
        int query;
        List<Integer> weights = o1.findAllPossibleWeights(input);
        for(int i = 0; i<n; i++) {
            query = sn.nextInt();
            if(weights.contains(query)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
