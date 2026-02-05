package Collections.HashSet;

import java.util.ArrayList;
import java.util.LinkedList;

public class Implementation {

    static class HashMap<K, V> {

        public class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void reHash() {
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N * 2];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node n = ll.get(j);
                    put(n.key, n.value);
                }
            }

        }

        public void put(K key, V value) {

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // no node found thus creating new node
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                reHash();
            }

        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            } else {
                LinkedList<Node> ll = buckets[bi];
                Node n = ll.get(di);
                return n.value;
            }

        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // no node found thus creating new node
                return false;
            } else {
                return true;
            }

        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // no node found thus creating new node
                return null;
            } else {
                LinkedList<Node> ll = buckets[bi];
                Node node = ll.remove(di);
                n--;
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;

        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        System.out.println();
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 190);
        map.put("Chine", 150);
        map.put("US", 140);
        map.put("Spain", 50);

        ArrayList<String> countryKeys = map.keySet();
        for (int i = 0; i < countryKeys.size(); i++) {
            System.out.println(countryKeys.get(i) + " " + map.get(countryKeys.get(i)));
        }

    }

}
