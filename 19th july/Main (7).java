class Main
{
public static void main(String args[])
{
    int[][] matrix = { {2,3,4},
                    {5,6,4}
    };
    
    for(int[] row:matrix)
    {
        System.out.print(row+ "    ");
       
    }
    
    System.out.println("the matrix is:");
    for(int[] row:matrix)
    {//row=
    for(int column:row)
    {
        System.out.print(column + "   ");
        
    }
    System.out.println();
}
}
}