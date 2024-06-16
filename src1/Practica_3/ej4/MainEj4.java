package Practica_3.ej4;
import Practica_3.GeneralTree;
public class MainEj4 {
	public static void main(String[] args) {
		AnalizadorArbol aux= new AnalizadorArbol();
		
		GeneralTree<AreaEmpresa> arbol = new GeneralTree<AreaEmpresa>();
		
		//cargol el arbol con los diferentes datos
		arbol.setData(new AreaEmpresa ("M",14));
		arbol.addChild(new GeneralTree <AreaEmpresa>(new AreaEmpresa("J",13)));
		arbol.addChild(new GeneralTree <AreaEmpresa>(new AreaEmpresa("K",25)));
		arbol.addChild(new GeneralTree <AreaEmpresa>(new AreaEmpresa("L",10)));
		arbol.getChildren().get(0).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("A",4)));
		arbol.getChildren().get(0).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("B",7)));
		arbol.getChildren().get(0).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("C",5)));
		arbol.getChildren().get(1).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("D",6)));
		arbol.getChildren().get(1).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("E",10)));
		arbol.getChildren().get(1).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("F",18)));
		arbol.getChildren().get(2).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("G",9)));
		arbol.getChildren().get(2).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("H",12)));
		arbol.getChildren().get(2).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("I",19)));
		
		//realizo lo pedido por el inciso
		System.out.println("El promedio de latencia maxima de un solo nivel es: "+ aux.devolverMaximoPromedio(arbol));
	}

}
