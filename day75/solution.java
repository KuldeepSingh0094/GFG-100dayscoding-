package day75;
import java.util.ArrayList;
import java.util.Collections;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {
    static class Pair implements Comparable<Pair> {
        int hd;
        int data;
        int lev;

        public Pair(int hd, int data, int lev) {
            this.hd = hd;
            this.data = data;
            this.lev = lev;
        }

        @Override
        public int compareTo(Pair p2) {
            if (this.hd == p2.hd) {
                if (this.lev == p2.lev) {
                    return this.data - p2.data;
                }
                return this.lev - p2.lev;
            } else {
                return this.hd - p2.hd;
            }
        }
    }

    static void Inorder(ArrayList<Pair> list, Node root, int hd, int lev) {
        if (root == null) {
            return;
        }
        Inorder(list, root.left, hd - 1, lev + 1);
        list.add(new Pair(hd, root.data, lev));
        Inorder(list, root.right, hd + 1, lev + 1);
    }

    static ArrayList<Integer> verticalOrder(Node root) {
        ArrayList<Pair> list = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        Inorder(list, root, 0, 1);
        Collections.sort(list);
        for (Pair k : list) {
            arr.add(k.data);
        }
        return arr;
    }
}
