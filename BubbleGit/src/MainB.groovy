
class MainB {

	static main(args) {
		def numeros = ["7","2","5","8","3","9","4"]
		def auxiliar
		def intercambio = false
		println "Numeros desordenados $numeros"
		while(true){
			intercambio = false
			for (int i = 1 ; i  < numeros.size(); i++) {
				if (numeros[i] < numeros[i-1]) {
					auxiliar = numeros[i]
					numeros[i] = numeros[i-1]
					numeros[i-1] = auxiliar
					intercambio = true
				}
			}
			if (intercambio == false) {
				break;
			}
		}
		
		println "Numeros ordenados $numeros"
	}
}
