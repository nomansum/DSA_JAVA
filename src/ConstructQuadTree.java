public class ConstructQuadTree {


    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;

        // Default constructor
        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        // Constructor with val and isLeaf parameters
        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        // Constructor with all parameters
        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }





    public Node construct(int[][] grid) {
     return helper(grid,0,0,grid.length);
    }

    public Node helper(int[][] grid , int i, int j, int w){

        if(isAllSame(grid,i,j,w)) return new Node(grid[i][j]==1?true:false,true);

        Node node = new Node(true,false);
        node.topLeft = helper(grid,i,j,w/2);
        node.topRight= helper(grid,i,j+w/2,w/2);
        node.bottomLeft=helper(grid,i+w/2,j,w/2);
        node.bottomRight = helper(grid,i+w/2,j+w/2,w/2);
        return node;

    }

    public boolean isAllSame(int[][] grid,int i, int j,int w){

        for(int x=i;x<i+w;++x){
            for(int y=j;y<j+w;++y){
                if(grid[x][y]!=grid[i][j]) return false;
            }
        }
        return true;

    }




}
