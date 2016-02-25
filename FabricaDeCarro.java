public class FabricaDeCarro {
	
	/* O Padr�o Singleton tem como defini��o garantir que uma classe tenha apenas uma 
	 * inst�ncia de si mesma e que forne�a um ponto global de acesso a ela. Ou seja, uma 
	 * classe gerencia a pr�pria inst�ncia dela al�m de evitar que qualquer outra classe 
	 * crie uma inst�ncia dela. A pr�pria classe sempre vai oferecer a pr�pria inst�ncia 
	 * dela e caso n�o tenha ainda uma inst�ncia, ent�o ela mesma cria e retorna essa 
	 * nova inst�ncia criada.
	 */
	
		private static FabricaDeCarro teste = new FabricaDeCarro();
		
		private FabricaDeCarro() {
		}
		
		public static FabricaDeCarro getteste(){
			return teste;	
		}
}




