import java.util.HashMap;

public class TrieNode {
    private char val;
    private boolean isEnded;
    private HashMap<Character, TrieNode> children;
    TrieNode(char val, boolean isEnded) {
        this.val = val;
        this.isEnded = isEnded;
        this.children = new HashMap<>();
    }

    public char getVal() {
        return val;
    }

    public void setVal(char val) {
        this.val = val;
    }

    public boolean isEnded() {
        return isEnded;
    }

    public void setEnded(boolean ended) {
        isEnded = ended;
    }

    @Override
    public String toString() {
        return "TrieNode{" +
                "val=" + val +
                ", isEnded=" + isEnded +
                '}';
    }

    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(HashMap<Character, TrieNode> children) {
        this.children = children;
    }
}
