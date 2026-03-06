import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 0, c = 0;
        System.out.println("Ingrese las filas");
        f = sc.nextInt();
        System.out.println("Ingrese las columnas");
        c = sc.nextInt();
        Metodos m = new Metodos();
        ObjAgricola[][] Mat = new ObjAgricola[f][c];
        Mat = m.LlenarMatriz(Mat);
        m.Mostrar(Mat);
    }
}
