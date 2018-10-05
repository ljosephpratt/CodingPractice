import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println(stringListTest());
        System.out.println(integerListListTest());
    }

    List<List<Integer>> nearestXsteakHouses(int totalSteakhouses, List<List<Integer>> allLocations, int numSteakhouses) {
        if (numSteakhouses > totalSteakhouses)
            throw new IllegalArgumentException("The number of steak houses cannot be larger than total steak houses.");

        Map<Double, Integer> orderedSteakhouses = new TreeMap<>();

        for (int i = 0; i < allLocations.size(); i++) {
            List<Integer> list = allLocations.get(i);
            double x = (double)list.get(0);
            double y = (double)list.get(1);
            double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            orderedSteakhouses.put(distance, i);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Double, Integer> entry : orderedSteakhouses.entrySet()) {
            result.add(allLocations.get(entry.getValue()));
        }

        result = result.subList(0, numSteakhouses);
        // List<List<Integer>> fixedResult = new ArrayList<>();
        // for (int i = 0; i < numSteakhouses; i++) {
        //     fixedResult.add(result.get(i));
        // }

        return result;
    }

    List<List<Integer>> optimalUtilization(int maximumOperatingTravelDistance, List<List<Integer>> forwardShippingRouteList, List<List<Integer>> returnShippingRouteList) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> perfectResults = new ArrayList<>();
        for (int i = 0; i < forwardShippingRouteList.size(); i++) {
            List<Integer> forward = forwardShippingRouteList.get(i);
            for (int j = 0; j < returnShippingRouteList.size(); j++) {
                List<Integer> ret = returnShippingRouteList.get(j);
                int totalDistance = forward.get(1) + ret.get(1);
                if (totalDistance == maximumOperatingTravelDistance) {
                    perfectResults.add(Arrays.asList(forward.get(0), ret.get(0)));
                } else if (totalDistance < maximumOperatingTravelDistance) {
                    if (!result.isEmpty()) {
                        int currentDistance = forwardShippingRouteList.get(result.get(0).get(0) - 1).get(1) + returnShippingRouteList.get(result.get(0).get(1) - 1).get(1);
                        if (currentDistance < totalDistance) {
                            result.get(0).set(0, forward.get(0));
                            result.get(0).set(1, ret.get(0));
                        }
                    } else {
                        result.add(Arrays.asList(forward.get(0), ret.get(0)));
                    }
                }
            }
        }
        if (!perfectResults.isEmpty()) {
            return perfectResults;
        }

        return result;
    }
    
    static List<List<Integer>> integerListListTest() {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> test1 = Arrays.asList(1, 2);
        List<Integer> test2 = Arrays.asList(3, 4);
        result.add(test1);
        result.add(test2);
        test1.set(0, 5);
        return result;
    }

    static List<String> stringListTest() {
        List<String> result = new ArrayList<>();
        String a = "Hello";
        String b = "World";
        String c = "Wassup!";
        result.add(a);
        result.add(b);
        result.add(c);
        a = "Yo";
        return result;
    }
}
