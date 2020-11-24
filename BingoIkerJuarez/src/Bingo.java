import java.util.*;

public class Bingo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int numFiles=3;
        int numColumnes=9;
        int opcio;
        int repeticions=0;

        int[][] taulell1 = new int[3][9];
        int[] taulell2 = new int[15];
        int[][] taulellPC1 = new int[3][9];

        int[] numSortits = new int[90];

        System.out.println("#################");
        System.out.println("Escull un taulell");
        System.out.println("#################");
        System.out.println("1- Taulell 1");
        System.out.println("2- Taulell 2");
        System.out.println("0- No vull jugar");
        System.out.print("Escull una: ");
        opcio=sc.nextInt();
        sc.nextLine();

        switch (opcio){
            case 0:
                break;

            case 1:

                for (int j=0;j<taulell1[0].length;j++){
                    for (int i=0;i< taulell1.length;i++){
                        int numero = ran.nextInt(10)+(j*10)+1;
                        if (taulell1[i][j]==taulell1[i][j]){
                            numero = ran.nextInt(10)+(j*10)+1;
                            taulell1[i][j]=numero;
                        }
                        taulell1[i][j]=numero;
                    }
                }

                while(repeticions<5) {
                    for (int j = 0; j < taulell1[0].length; j++) {
                        if (taulell1[0][j] == taulell1[1][j]) {
                            int num = ran.nextInt(10) + (j * 10) + 1;
                            taulell1[0][j] = num;
                        } else if (taulell1[1][j] == taulell1[2][j]) {
                            int num = ran.nextInt(10) + (j * 10) + 1;
                            taulell1[1][j] = num;
                        }
                    }
                    repeticions++;
                }

                repeticions=0;



                while(repeticions<2) {

                    for (int j = 0; j < taulell1[0].length; j++) {
                        if (taulell1[0][j] > taulell1[1][j]) {
                            int temp = taulell1[0][j];
                            taulell1[0][j] = taulell1[1][j];
                            taulell1[1][j] = temp;
                        }
                        if (taulell1[1][j] > taulell1[2][j]) {
                            int temp = taulell1[1][j];
                            taulell1[1][j] = taulell1[2][j];
                            taulell1[2][j] = temp;
                        }
                    }
                    repeticions++;
                }

                taulell1[1][0]=0;
                taulell1[2][0]=0;
                taulell1[2][1]=0;
                taulell1[0][2]=0;
                taulell1[0][3]=0;
                taulell1[1][4]=0;
                taulell1[2][4]=0;
                taulell1[1][5]=0;
                taulell1[0][6]=0;
                taulell1[2][7]=0;
                taulell1[0][7]=0;
                taulell1[1][8]=0;


                System.out.println("El teu taulell és el següent: ");
                for (int i=0;i<numFiles;i++){
                    for (int j=0;j<numColumnes;j++){
                        if (j<=7) {
                            System.out.print(taulell1[i][j] + " - ");
                        }else{
                            System.out.print(taulell1[i][j]);
                        }
                    }
                    System.out.println();
                }

                for (int j=0;j<taulellPC1[0].length;j++){
                    for (int i=0;i< taulellPC1.length;i++){
                        int numero = ran.nextInt(10)+(j*10)+1;
                        if (taulellPC1[i][j]==taulellPC1[i][j]){
                            numero = ran.nextInt(10)+(j*10)+1;
                            taulellPC1[i][j]=numero;
                        }
                        taulellPC1[i][j]=numero;
                    }
                }

                while(repeticions<5) {
                    for (int j = 0; j < taulellPC1[0].length; j++) {
                        if (taulellPC1[0][j] == taulellPC1[1][j]) {
                            int num = ran.nextInt(10) + (j * 10) + 1;
                            taulellPC1[0][j] = num;
                        } else if (taulellPC1[1][j] == taulellPC1[2][j]) {
                            int num = ran.nextInt(10) + (j * 10) + 1;
                            taulellPC1[1][j] = num;
                        }
                    }
                    repeticions++;
                }

                repeticions=0;



                while(repeticions<2) {

                    for (int j = 0; j < taulellPC1[0].length; j++) {
                        if (taulellPC1[0][j] > taulell1[1][j]) {
                            int temp = taulellPC1[0][j];
                            taulellPC1[0][j] = taulellPC1[1][j];
                            taulellPC1[1][j] = temp;
                        }
                        if (taulellPC1[1][j] > taulellPC1[2][j]) {
                            int temp = taulellPC1[1][j];
                            taulellPC1[1][j] = taulellPC1[2][j];
                            taulellPC1[2][j] = temp;
                        }
                    }
                    repeticions++;
                }

                taulellPC1[1][0]=0;
                taulellPC1[2][0]=0;
                taulellPC1[2][1]=0;
                taulellPC1[0][2]=0;
                taulellPC1[0][3]=0;
                taulellPC1[1][4]=0;
                taulellPC1[2][4]=0;
                taulellPC1[1][5]=0;
                taulellPC1[0][6]=0;
                taulellPC1[2][7]=0;
                taulellPC1[0][7]=0;
                taulellPC1[1][8]=0;

                System.out.println();
                System.out.println("*************");
                System.out.println("Hora de jugar");
                System.out.println("*************");

                int puntsJ=0;
                int puntsPC=0;
                int encert;
                int numAleatori;
                int afegirNums=1;
                boolean bucle=true;

                do {

                    numAleatori= ran.nextInt(90);
                    while(numAleatori==0){
                        numAleatori= ran.nextInt(90);
                    }
                    System.out.println("El numero aleatori és: "+numAleatori);
                    for (int x=0;x<numFiles;x++){
                        for (int y=0;y<numColumnes;y++){
                            if (y<=7) {
                                System.out.print(taulell1[x][y] + " - ");
                            }else{
                                System.out.print(taulell1[x][y]);
                            }
                        }
                        System.out.println();
                    }
                    for(int j=0; j<taulell1[0].length; j++){
                        for(int i=0; i<taulell1.length; i++){
                            if(taulell1[i][j]==numAleatori){
                                System.out.print("Tens un número, marca'l amb un 0: ");
                                encert=sc.nextInt();
                                sc.nextLine();
                                taulell1[i][j]=encert;
                                puntsJ++;
                            }
                        }
                    }
                    System.out.println("Torn del PC.");
                    if(puntsJ==15){
                        System.out.println("Has guanyat, FELICITATS!!!");
                        break;
                    }else if(puntsPC==15){
                        System.out.println("Has perdut, gunya el PC.");
                        break;
                    }
                }while(puntsJ<15 || puntsPC<15);

                break;

            case 2:


                break;

        }


        /*while (bucle){

            numAleatori= ran.nextInt(90)+1;
            System.out.println("El numero que ha sortit és: "+numAleatori);
            for(int i=0;i< taulell2.length;i++){
                if(i<14) {
                    System.out.print(taulell2[i] + "-");
                }else{
                    System.out.print(taulell2[i]);
                }
            }
            for(int i=0;i< taulell2.length;i++){
                if(taulell2[i]==numAleatori){
                    System.out.print("Tinc el numero!! Haig de marcar-l'ho amb un 0. ");
                    encert=sc.nextInt();
                    taulell2[i]=encert;
                    puntsJ++;
                }
            }
            if(puntsJ==15 || puntsPC==15){
                break;
            }
            break;
        }*/



    }
}
