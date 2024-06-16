package Practica_2.ej9;
import Practica_2.BinaryTree;
public class ParcialArbolesEj9 {
	
	public BinaryTree<Content> sumAndDif(BinaryTree <Integer> ab){
		int padre=0;
		int sumatoria=0;
		
		if(ab !=null) {
			return (sumAndDifAux(ab, sumatoria, padre));
		}
		else {
			return null;
		}
	}
	
	private BinaryTree<Content> sumAndDifAux(BinaryTree <Integer> ab,int sumatoria, int padre){
		BinaryTree<Content> abN;
		Content cont= new Content();
		int num;
		
		if(!ab.isEmpty()) {
			num=ab.getData();	
		}
		else {
			num=0;
		}
		
		cont.setDif(num-padre);
		cont.setSuma(num+sumatoria);
		
		//creo el nuevo arbol con los datos de la raiz
		abN= new BinaryTree<Content> (cont);
		
		//hago el recorrido recursivo respectivamente
		if(ab.hasLeftChild()) {
			abN.addLeftChild(sumAndDifAux(ab.getLeftChild(), num+sumatoria, num));
		}
		if(ab.hasRightChild()) {
			abN.addRightChild(sumAndDifAux(ab.getRightChild(), num+sumatoria, num));
		}
		
		return abN;
	}
}
