# **MATRIX TRANSPOSE**

## INFORMATION

* **Program that transposes a matrix created with multidimensional arrays.**

## TECHNOLOGIES USED

* **JAVA**

## CONTENTS

* 3-level and 3-digit lists were created.

* With the for loop, it first prints the matrix and then transposes it.

## CODES

```Java

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


```

```Java

                System.out.println("Transpose : ");

                for(int i = 0; i < 3; i++){

                    for(int j = 0; j < 3; j++){

                        System.out.print(list[j][i] + " ");

                    }

                    System.out.println();

                }

            }
        }

```

```bash

    Matrix :
    1 3 4
    2 4 3
    3 4 5
    Transpose :
    1 2 3
    3 4 4
    4 3 5

```

<br />

## LINK

* Click here https://github.com/Fogo9/MatrixTranspose.git to access the Github page for this project.

<br />

## LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
