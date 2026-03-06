import java.util.Scanner;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    public ObjAgricola[][] LlenarMatriz(ObjAgricola[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjAgricola o = new ObjAgricola();
                System.out.println("Tenga en cuenta que las categorias son (Lacteos/Carnes/Granos/Bebidas)");
                System.out.println("Ingrese el nombre: ");
                o.setNombre(sc.next());
                System.out.println("Ingrese el peso: ");
                o.setPeso(sc.nextInt());
                System.out.println("Ingrese el Precio/Unidad: ");
                o.setPrecioUnidad(sc.nextDouble());
                System.out.println("Ingrese la categoria: (Lacteos/Carnes/Granos/Bebidas)");
                o.setCategoria(sc.next());
                m[i][j] = o;
            }
        }
        return m;
    }

    public ObjAgricola[][] Organizar(ObjAgricola[][] p){
        
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                ObjAgricola[][] o = new ObjAgricola();
                if(o[i][j].getCategoria().equalsIgnoreCase("Lacteos")){
                    
                }
            }
        }


        return p;
    }

    public void Mostrar(ObjAgricola[][]m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Nombre: " + m[i][j].getNombre());
                System.out.println("Peso: " + m[i][j].getPeso());
                System.out.println("Precio/Unidad: " + m[i][j].getPrecioUnidad());
            }
        }

    }

  
}
