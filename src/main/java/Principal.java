public class Principal {
    public static void main(String[] args){

        /*
        System.out.println(">>>>LISTAS VERTICALES");
        ListaVertical listaV = new ListaVertical();
        listaV.insertar(new NodoOrtogonal(5,0,6));
        listaV.insertar(new NodoOrtogonal(3,0,3));
        listaV.insertar(new NodoOrtogonal(45,0,2));
        listaV.insertar(new NodoOrtogonal(6,0,4));
        listaV.insertar(new NodoOrtogonal(78,0,5));
        listaV.insertar(new NodoOrtogonal(90,0,1));

        listaV.recorrer();

        System.out.println(">>>>LISTAS HORIZONTALES");
        ListaHorizontal listaH = new ListaHorizontal();
        listaH.insertar(new NodoOrtogonal(5,2,2));
        listaH.insertar(new NodoOrtogonal(3,1,3));
        listaH.insertar(new NodoOrtogonal(45,3,6));
        listaH.insertar(new NodoOrtogonal(6,4,5));
        listaH.insertar(new NodoOrtogonal(78,5,1));
        listaH.insertar(new NodoOrtogonal(90,6,9));

        listaH.recorrer();

        System.out.println(">>>>CABECERAS COLUMNAS");
        ListaCabeceraColumnas listaCH = new ListaCabeceraColumnas();
        listaCH.insertar(new NodoCabeceraColumna(6));
        listaCH.insertar(new NodoCabeceraColumna(3));
        listaCH.insertar(new NodoCabeceraColumna(2));
        listaCH.insertar(new NodoCabeceraColumna(4));
        listaCH.insertar(new NodoCabeceraColumna(5));
        listaCH.insertar(new NodoCabeceraColumna(1));
        listaCH.recorrer();
        System.out.println((listaCH.busqueda(6) != null) ? "> Si existe la cabecera" : "> No existe la cabecera");

        System.out.println(">>>>CABECERAS FILAS");
        ListaCabeceraFilas listaCV = new ListaCabeceraFilas();
        listaCV.insertar(new NodoCabeceraFila(6));
        listaCV.insertar(new NodoCabeceraFila(3));
        listaCV.insertar(new NodoCabeceraFila(2));
        listaCV.insertar(new NodoCabeceraFila(4));
        listaCV.insertar(new NodoCabeceraFila(5));
        listaCV.insertar(new NodoCabeceraFila(1));
        listaCV.recorrer();
        System.out.println((listaCV.busqueda(7) != null) ? "> Si existe la cabecera" : "> No existe la cabecera");*/

        System.out.println(">>>>MATRIZ ORTOGONAL<<<<");
        MatrizOrtogonal matriz = new MatrizOrtogonal();
        matriz.llenar(3,3);

        System.out.println("> buscando por filas: " + matriz.filas.busqueda(1).fila.primero.getAbajo().getDerecha().getDato());
        System.out.println("> buscando por columnas: " + matriz.columnas.busqueda(2).columna.primero.getAbajo().getIzquierda().getIzquierda().getDato());


    }
}
