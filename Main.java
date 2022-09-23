package Arreglo.java;

public class Main
{
    public static void main(String args[])
    {
        Arreglo arreglo = new Arreglo();

        arreglo.setArreglo(5);
        arreglo.setElementos(3);
        arreglo.setCantidadElementos(4);

        arreglo.agregarArreglo();
        arreglo.mostrarArreglos();
        arreglo.buscarElementos(7);
        arreglo.editarElementos();
        arreglo.eliminarElemento();
    }
}
