package pl.bymario.refi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        List<List<Integer>> teams = new ArrayList<>();
//
//        List<Integer> team1 = new ArrayList<>();
//        team1.add(1);
//        team1.add(10);
//        teams.add(team1);
//
//
//        List<Integer> team2 = new ArrayList<>();
//        team2.add(3);
//        team2.add(3);
//        teams.add(team2);
//
//        int tr = 40;
//
//        devTeam(teams, tr);

//        Integer[] t = {6, 1, 1, 2, 2, 3, 3};
//        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(t));
//        numbers.add(2);
//        int k = 1;
//        System.out.println(countPairs(numbers, k));
//        System.out.format(10 + ' ');

    }


    public static int countPairs(List<Integer> numbers, int k) {

        int ans = 0;
        List<Integer> pair = new ArrayList<>();

        for (int i = 0; i < numbers.size() - 1; i++) {
            int a = numbers.get(i).intValue();
            int b = numbers.get(i + 1).intValue();
            if (a + k == b
                    && (pair.isEmpty()
                    || (a != pair.get(0) && b != pair.get(1)))) {

                ans++;
                pair.clear();
                pair.add(a);
                pair.add(b);
            }
        }
        return ans;
    }
//
//        public static int devTeam(List<List<Integer>> teams, int r) {
//
//        OptionalDouble average = teams.stream()
//                .mapToDouble(team ->
//                            team.get(0).doubleValue() / team.get(1).doubleValue()
//
//                ).average();
//
//        double currTr = 0;
//        int seniorToHire = 0;
//
//        if( average.getAsDouble() >= r) {
//            return seniorToHire;
//        }
//
//
//    }


}
