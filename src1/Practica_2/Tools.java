package Practica_2;
import Practica_1.ej8.Queue;
public class Tools {
	
	//agregar por niveles a un arbol
    public <T> void insertarPorNivel(BinaryTree<T> arbol, T dato) {

        BinaryTree<T> aux = null;
        Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
        int indice = 0;

        boolean insertado = false;

        if (arbol != null) {
            if (!arbol.isEmpty()) {

                indice = 1;

                cola.enqueue(arbol);
                cola.enqueue(null);

                while (!cola.isEmpty() && !insertado) {
                    aux = cola.dequeue();
                    if (aux != null) {

                        if (aux.hasLeftChild()) {
                            cola.enqueue(aux.getLeftChild());
                            if (aux.hasRightChild()) {
                                cola.enqueue(aux.getRightChild());
                            } else {
                                aux.addRightChild(new BinaryTree<T>(dato));
                                System.out.println("Insertado en el nivel " + indice);
                                insertado = true;
                            }
                        } else {
                            aux.addLeftChild(new BinaryTree<T>(dato));
                            System.out.println("Insertado en el nivel " + indice);
                            insertado = true;
                        }
                    } else {
                        indice++;
                        if (!cola.isEmpty()) {
                            cola.enqueue(null);
                        }
                    }
                }
            } else {
                arbol.setData(dato);
                System.out.println("Insertado en el nivel " + indice);
            }
        } else {
            arbol = new BinaryTree<T>(dato);
            System.out.println("Insertado en el nivel " + indice);
        }
    }
    
  //imprimir en orden el arbol binario
  	public <T> void print_inOrden (BinaryTree <T> a) {
  		if(a != null) {
  			print_inOrden(a.getLeftChild());
  			if(!a.isEmpty()) {
  				System.out.println("["+a.getData()+"] - >");
  			}
  			else {
  				System.out.println("[Nodo vacio]");
  			}
  			print_inOrden(a.getRightChild());
  		}
  	}
  	
  	//imprimir en post order
  	public <T> void  print_postOrden (BinaryTree <T> a) {
  		if(a != null) {
  			print_postOrden(a.getLeftChild());
  			print_postOrden(a.getRightChild());
  			if(!a.isEmpty()) {
  				System.out.println("["+a.getData()+"] ->");
  			}
  			else {
  				System.out.println("[Nodo vacio]");
  			}
  		}
  	}
  	
  	//imprimir en pre orden
  	public <T> void print_preOrden (BinaryTree <T> a) {
  		if(a != null) {
  			if(!a.isEmpty()) {
  				System.out.println("["+a.getData()+"] ->");
  			}
  			else {
  				System.out.println("[Nodo vacio}");
  			}
  			print_preOrden(a.getLeftChild());
  			print_preOrden(a.getRightChild());
  		}
  	}
  	
  	//imprimir por niveles
  	public <T> void print_niveles (BinaryTree <T> a) {
  		BinaryTree <T> aux= new BinaryTree <T> ();
  		Queue <BinaryTree<T>> cola = new Queue<>();
  		cola.enqueue(a);
  		cola.enqueue(null);
  		while(!cola.isEmpty()) {
  			aux=cola.dequeue();
  			if(aux != null) {
  				System.out.println("["+aux.getData()+"] ->");
  				if(aux.hasLeftChild()) {
  					cola.enqueue(aux.getLeftChild());
  				}
  				if(aux.hasRightChild()) {
  					cola.enqueue(aux.getRightChild());
  				}
  			}
  			else {
  				if(!cola.isEmpty()) {
  					cola.enqueue(null);
  				}
  			}
  		}
  	}
}
