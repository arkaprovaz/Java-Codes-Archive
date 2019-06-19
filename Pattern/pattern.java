class Pattern{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){
                if(j==2||j==3)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern2{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=i;j<=5;j++)
                    System.out.print(j+" ");
            System.out.println();
        }
    }
}