import java.util.*;

public class Skyline {
    public static void main(String[] args) {
        int[][] input = {{1, 5, 11}, {2, 7, 6}, {3, 19, 13}, {3, 25, 14}, {4, 28, 24}, {7, 16, 12}, {13, 29, 23}, {18, 22, 19}};
        int[][] input2 = {{1,5,11}};
        Skyline s = new Skyline();
        List<List<Integer>> res = s.getSkyline(input);
        for (List<Integer> r : res) {
            System.out.println(r.toString());
        }

    }

    public List<List<Integer>> getSkyline(int[][] buildings) {
        if (buildings.length == 0) {
            return new ArrayList<>();
        }

        return merge(buildings, 0, buildings.length - 1);
    }

    private List<List<Integer>> merge(int[][] building, int start, int end) {
        List<List<Integer>> res = new ArrayList<>();
        // Base case: 1 building
        if (start == end) {
            // add upper left of the building. [l, h]
            res.add(new ArrayList<>() {{
                add(building[start][0]);
                add(building[start][1]);
            }});
            // add lower right of the building. [r,0]
            res.add(new ArrayList<>() {{
                add(building[start][2]);
                add(0);
            }});
            return res;
        }
        // divide into left and right parts
        int mid = start + (end - start) / 2;
        List<List<Integer>> left = merge(building, start, mid);
        List<List<Integer>> right = merge(building, mid + 1, end);
        // merger two skylines
        int leftH = 0, rightH = 0; // Height of the point in the left or right part when added into result
        int pL = 0, pR = 0; // pointer

        while (pL < left.size() || pR < right.size()) {
            int x1 = pL < left.size() ? left.get(pL).get(0) : Integer.MAX_VALUE;
            int x2 = pR < right.size() ? right.get(pR).get(0) : Integer.MAX_VALUE;
            int x = 0;

            if (x1 < x2) {
                leftH = left.get(pL).get(1);
                x = x1;
                pL++;
            } else if (x1 > x2) {
                rightH = right.get(pR).get(1);
                x = x2;
                pR++;
            } else {
                leftH = left.get(pL).get(1);
                rightH = right.get(pR).get(1);
                x = x1;
                pL++;
                pR++;
            }

            int maxH = Math.max(leftH, rightH);
            updateRes(res, x, maxH);
        }
        return res;
    }

    private void updateRes(List<List<Integer>> res, int x, int h) {
        // Only update the height at the start point of the building
        // Avoid adding same height more than once at same building
        if (res.isEmpty() || res.get(res.size() - 1).get(1) != h) {
            res.add(new ArrayList<Integer>() {{
                add(x);
                add(h);
            }});
        } else {
            res.get(res.size() - 1).set(1, h);
        }
    }

}
