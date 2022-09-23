package Arreglo.java;

public class Arreglo
{
    int arreglos[];
    int elementos;
    int cantidadElementos;
    int i;

// SET DE ARREGLO

    public void setArreglo(int elementos)
    {
        for(int i=0; i<elementos; i++)
        {
            System.out.println(arreglos[i]);
        }
    }

//SET Y GET DE ELEMENTOS

    public void setElementos(int elemento)
    {
        elementos = elemento;
    }
    public int getElementos()
    {
        return elementos;
    }

//SET Y GET DE CANTIDAD DE ELEMENTOS

    public void setCantidadElementos(int cantElemento)
    {
        cantidadElementos = cantElemento;
    }
    public int getCantidadElementos()
    {
        return cantidadElementos;
    }

//AGREGAR ARREGLO

    public void agregarArreglo()
    {
        arreglos = new int[getCantidadElementos()];
        for(i=0; i<getCantidadElementos(); i++)
        {
            System.out.println(i);
        }
    }

//MOSTRAR ARREGLO

    public void mostrarArreglos()
    {
        for(i=0; i<getCantidadElementos(); i++)
        {
            System.out.println(arreglos[i]);
        }
    }

//BUSCAR ELEMENTO

    public void buscarElementos(int elemento)
    {
        int i;

        for(i=0;i<getCantidadElementos(); i++)
        {
            if(getElementos()==arreglos[i])
            {
                System.out.println(i);
                break;
            }
        }
        if(i==elementos)
        {
            System.out.println("No se encontro:"+ elemento);
        }
        else
        {
            System.out.println("Se encontro" + elemento);
        }
    }

//EDITAR ELEMENTO

    public void editarElementos()
    {
        System.out.println(getCantidadElementos());
        elementos = cantidadElementos;

        if (elementos>=getCantidadElementos())
        {
            System.out.println(elementos = getElementos());
            elementos = getElementos();
        }

        System.out.println(elementos = arreglos[elementos]);
        arreglos[elementos] = elementos;

        for(i=0; i<getCantidadElementos(); i++)
        {
            System.out.println(arreglos[i]);
        }
    }

//ELIMINAR ELEMENTO

    public void eliminarElemento()
    {
        elementos = cantidadElementos;

        for (i = 0; i < getCantidadElementos(); i++)
        {
            if (arreglos[i]==elementos)
            {
                System.out.println(elementos);

                for(i=i; i<getCantidadElementos()-1; i++)
                {
                    arreglos[i]=arreglos[i=1];
                }
            }

//IMPRIMIR ARREGLO

            for(i=0;i<getCantidadElementos();i++)
            {
                System.out.println(arreglos[i]);
            }
        }
    }
}