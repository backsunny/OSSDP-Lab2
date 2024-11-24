import java.util.Arrays;
import java.util.List;


class L2022110533_20_Text {

    @Test
    public static void main(String[] args) {
        // 测试用例1：只有一个节点的树
        int n1 = 1;
        int[][] edges1 = {};
        List<Integer> expected1 = Arrays.asList(0);
        System.out.println(new Solution20().findMinHeightTrees(n1, edges1).equals(expected1));
        // 测试用例2：树的高度为1
        int n2 = 4;
        int[][] edges2 = {{1, 0}, {1, 2}, {1, 3}};
        List<Integer> expected2 = Arrays.asList(1);
        System.out.println(new Solution20().findMinHeightTrees(n2, edges2).equals(expected2));
        // 测试用例3：树的高度为2
        int n3 = 6;
        int[][] edges3 = {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};
        List<Integer> expected3 = Arrays.asList(3, 4);
        System.out.println(new Solution20().findMinHeightTrees(n3, edges3).equals(expected3));
    }
}

