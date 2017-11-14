public class Test {
    public static void main(String[] args) {
        int[][] cijfers = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < cijfers.length; i++) {
            for (int j = 0; j < cijfers[i].length; j++) {
                System.out.print(cijfers[i][j] + " ");
            }
            System.out.println();
        }

        char[][] letters = {{'a','b','c'},{'d','e','f'}};

        for (int i = 0; i < letters.length; i++){
            for (int j = 0; j < letters[i].length; j++){
                System.out.print(letters[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] cijferreeks : cijfers){
            for (int cijfer : cijferreeks){
                System.out.print(cijfer + " ");
            }
            System.out.println();
        }
    }

}



