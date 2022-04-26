public class MatrixTranspose {
    public static void main(String args[]){

        int list[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};

        System.out.println("Matrix : ");

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                System.out.print(list[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println("Transpose : ");

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                System.out.print(list[j][i] + " ");

            }

            System.out.println();

        }

    }
}
