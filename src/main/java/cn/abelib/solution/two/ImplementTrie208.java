package cn.abelib.solution.two;

import org.junit.Test;


/**
 * @Author: abel.huang
 * @Date: 2020-02-02 19:55
 */
public class ImplementTrie208 {
    class Trie {
        class TrieNode {
            private char data;
            private TrieNode[]children;
            private boolean flag;

            public TrieNode(char c) {
                this.data = c;
                this.children = new TrieNode[26];
                this.flag = false;
            }
        }

        private TrieNode root;

        /** Initialize your data structure here. */
        public Trie() {
            this.root = new TrieNode('/');
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                TrieNode child = node.children[c - 'a'];
                if (child == null) {
                    node.children[c - 'a'] = new TrieNode(c);
                    child = node.children[c - 'a'];
                }
                node = child;

            }
            node.flag = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                TrieNode child = node.children[c - 'a'];
                if (child == null) {
                    return false;
                }
                node = child;
            }
            return node.flag;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode node = root;
            for (char c : prefix.toCharArray()) {
                TrieNode child = node.children[c - 'a'];
                if (child == null) {
                    return false;
                }
                node = child;
            }
            return true;
        }
    }


    @Test
    public void trieTest() {
         // Your Trie object will be instantiated and called as such:
         Trie trie = new Trie();
         String word = "apple";
        String word2 = "applee";
         trie.insert(word);
         boolean ans1 = trie.search(word2);
         System.err.println(ans1);
         boolean ans2 = trie.startsWith(word2);
        System.err.println(ans2);

    }
}
