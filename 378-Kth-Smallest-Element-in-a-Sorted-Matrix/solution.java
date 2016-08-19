public class Solution {
    
    public class Node {
        int row;
        int column;
        int value;
        
        public Node(int row, int column, int value) {
            this.row = row;
            this.column = column;
            this.value = value;
        }
    }
    
    PriorityQueue<Node> pq;
    
    public int kthSmallest(int[][] matrix, int k) {
        // 8:40
        int size = matrix.length;
        int columns = matrix[0].length;
        pq = new PriorityQueue<Node>(size, new Comparator<Node> () {
                public int compare(Node a, Node b) {
                    return a.value - b.value;
                }
            });
        int index = 0;
        for(int i=0;i<size;i++) {
            pq.add(new Node(i, 0, matrix[i][0]));
        }
        Node temp  = null; 
        while(index != k) {
            index++;
            temp = pq.poll();
            if (temp.column + 1 < columns) {
                pq.add(new Node(temp.row, temp.column + 1, matrix[temp.row][temp.column + 1]));
            }
        }
        return temp.value;
    }
    
   
}