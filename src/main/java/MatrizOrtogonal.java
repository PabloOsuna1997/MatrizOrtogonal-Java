public class MatrizOrtogonal {
    ListaCabeceraFilas filas;
    ListaCabeceraColumnas columnas;

    public MatrizOrtogonal() {
        this.filas = new ListaCabeceraFilas();
        this.columnas = new ListaCabeceraColumnas();
    }

    public void insertar(int x, int y, int dato){
        NodoOrtogonal nodoNuevo;
        nodoNuevo = new NodoOrtogonal(dato, x, y);
        if(columnas.busqueda(x) == null){
            //existe la cabecera columnas
            columnas.insertar(new NodoCabeceraColumna(x));
        }
        if(filas.busqueda(y) == null){
            filas.insertar(new NodoCabeceraFila(y));
        }
        NodoCabeceraColumna tmpC;
        NodoCabeceraFila tmpF;
        tmpC = columnas.busqueda(x);
        tmpF = filas.busqueda(y);
        tmpC.columna.insertar(nodoNuevo);
        tmpF.fila.insertar(nodoNuevo);

        System.out.println("Se inserto: " + dato +" en la pos: " + x +"," + y);
    }

    public void llenar(int x, int y){
        int randomData = 1;
        for (int j = 0; j < y; j ++){
            for(int i = 0; i < x; i ++){
                insertar(i,j,randomData);
                randomData++;
            }
        }
    }

}
