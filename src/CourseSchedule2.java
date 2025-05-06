import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule2 {



    // https://leetcode.com/problems/course-schedule-ii/description/

    public static int[] findOrder(int numCourses, int[][] prerequisites) {


        int[] indegree = new int[numCourses];
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<numCourses;++i){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;++i){
            adjList.get(prerequisites[i][1]).add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;++i){
            if(indegree[i]==0) queue.offer(i);
        }
       int[] ans = new int[numCourses];
        int count = 0;
        while(!queue.isEmpty()){

            int currentNode = queue.peek();
            queue.poll();
           ans[count++]  = currentNode;
            for(int i=0;i<adjList.get(currentNode).size();++i){
                int tempNode = adjList.get(currentNode).get(i);
                if(--indegree[tempNode]==0)queue.offer(tempNode);

            }



        }

if(count!=numCourses)return new int[0];


        return ans;












    }









}
