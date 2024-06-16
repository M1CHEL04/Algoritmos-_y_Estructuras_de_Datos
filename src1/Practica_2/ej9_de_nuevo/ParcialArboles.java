package Practica_2.ej9_de_nuevo;
import Practica_2.BinaryTree;
public class ParcialArboles {
	
	public BinaryTree<Valores> sumAndDif (BinaryTree<Integer> arbol){
		BinaryTree <Valores> arbolValor=new BinaryTree<Valores>();
		if(arbol == null) {
			return arbolValor;
		}
		else {
			int padre=0;
			int sumatoria=0;
			sumAndDifPriv(arbol,arbolValor,padre,sumatoria);
			return arbolValor;
		}
	}
	
	private void sumAndDifPriv(BinaryTree<Integer>ab,BinaryTree<Valores>av,int padre,int sumatoria){
		Valores val= new Valores();
		val.suma=ab.getData()+sumatoria;
		val.dif=ab.getData() - padre;
		
		av.setData(val);
		
		if(ab.hasLeftChild()) {
			av.addLeftChild(new BinaryTree<Valores>());
			sumAndDifPriv(ab.getLeftChild(), av.getLeftChild(), ab.getData(), val.suma);
		}
		if(ab.hasRightChild()) {
			av.addRightChild(new BinaryTree<Valores>());
			sumAndDifPriv(ab.getRightChild(), av.getRightChild(), ab.getData(), val.suma);
		}
	}
}
