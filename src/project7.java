public class project7 {
    void primalgorithm(int[][] graph, int start) {
        int len = graph.length;
        boolean[] or = new boolean[len];

        int[] para = new int[len];
        for(int i=0; i<len; i++)
        {
            or[i]=false;
        }
        or [start] = true;
        para [start] = 0;

        for(int l=0; l<len; l++)
        {
            int min = Integer.MAX_VALUE;
            int min_index = 0;
            int min_para = 0;
            for(int a=0; a<len; a++)
            {
                for(int j=0; j<len; j++)
                {
                    if (or[a] == true && graph[a][j] < min && graph[a][j]!=0 && or[j] == false)
                    {
                        min = graph[a][j];
                        min_index = j;
                        min_para = a;
                    }
                }
            }
            or[min_index] = true;
            para[min_index] = min_para;
        }
        System.out.println("Edge \tWeight");
        for(int i=0; i<len; i++)
        {
            System.out.println(para[i] + "-" + i + "=" + graph[para[i]][i]);
        }
    }
    public static void main(String[] args) {
        int[][] graph ={
                {0, 4, 0, 0, 0, 0, 0, 8, 0},//0
                {4, 0, 8, 0, 0, 0, 0, 11,0},//1
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14,0, 0, 0},
                {0, 0, 0, 9, 0, 10,0, 0, 0},
                {0, 0, 4, 14,10,0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11,0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        project7 prim = new project7();
        prim.primalgorithm(graph, 0);
    }
}
