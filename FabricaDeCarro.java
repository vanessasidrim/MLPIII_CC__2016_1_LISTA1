public class FabricaDeCarro {
	
	/* O Padrão Singleton tem como definição garantir que uma classe tenha apenas uma 
	 * instância de si mesma e que forneça um ponto global de acesso a ela. Ou seja, uma 
	 * classe gerencia a própria instância dela além de evitar que qualquer outra classe 
	 * crie uma instância dela. A própria classe sempre vai oferecer a própria instância 
	 * dela e caso não tenha ainda uma instância, então ela mesma cria e retorna essa 
	 * nova instância criada.
	 */
	
		private static FabricaDeCarro teste = new FabricaDeCarro();
		
		private FabricaDeCarro() {
		}
		
		public static FabricaDeCarro getteste(){
			return teste;	
		}
}




