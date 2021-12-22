package C03_Testing_P3;

public class Main{
	
	public static void main(String[] args) {
		
		Adecuacion_Funcional adecuacionFun = new Adecuacion_Funcional(0,0,0,80);
		mantenibilidad mantenibilidad = new mantenibilidad(0,0,0,0,0,0,90);
		Certificado certificadofin = new Certificado(adecuacionFun, mantenibilidad);
		System.out.println(certificadofin.certificadofin());
	}
}