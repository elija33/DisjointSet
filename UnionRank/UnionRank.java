package UnionRank;

public class UnionRank {
    static int parent[];
    static int ranks[];

    public static void initialize() {
        for (int i = 0; i < parent.length - 1; i++) {
            parent[i] = i;
        }
    }

    public static int find(int number) {
        if (parent[number] == number) {
            return number;
        } else {
            return find(parent[number]);
        }
    }

    public static void union(int num, int nums) {
        int numb = find(num);
        int numbs = find(nums);

        if (numb == numbs) {
            return;
        }

        if (ranks[numb] < ranks[numbs]) {
            parent[numb] = numbs;
        }

        else if (ranks[numbs] < ranks[numb]) {
            parent[numbs] = numb;
        }

        else {
            parent[numbs] = numb;
            ranks[numb]++;
        }
    }

    public static void main(String[] args) {
        int number = 5;

        parent = new int[5];
        parent = new int[5];

        initialize();

        union(3, 4);
        union(2, 3);
        union(1, 2);
        union(0, 1);

        System.out.println(parent[3]);
        System.out.println(ranks[3]);
    }
}
