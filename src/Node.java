import java.util.ArrayList;
import java.util.List;

class Nodee {
    public int val;
    public List<Node> neighbors;

    public Nodee() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Nodee(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Nodee(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
