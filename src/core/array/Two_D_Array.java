package core.array;

public class Two_D_Array {
    int refV[][]= new int[][]{
            {1,2},
            {3,4},
    };
    public void display(){

        for(int tem=0; tem<refV.length; tem++)
            for(int tem1=0; tem1<refV[tem].length; tem1++)
                System.out.println(refV[tem][tem1]);
    }

}
