package FindUnionOperationsDisjointSets;

public class FindUnionDisjointSet {
    static int parent[];

    public static void initialize() {
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }

    // finding the element in the find union disjoint set
    public static int find(int number) {
        if (parent[number] == number) {
            return number;
        } else {
            return find(parent[number]);
        }
    }

    // Unioning of the element
    public static void union(int number, int numbers) {
        int num = find(number);
        int nums = find(number);
        if (num == nums) {
            return;
        }
        parent[nums] = num;
    }

    public static void main(String[] args) {
        int numbers = 5;

        parent = new int[5];
        initialize();
        union(0, 2);
        union(0, 4);

        System.out.println(find(4));
        System.out.println(find(3));
    }
}