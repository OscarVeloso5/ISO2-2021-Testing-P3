package C03_Testing_P3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CertificadoTest {

	
	// TEST testCertificadofin (Cobertura MC/DC)
	@Test
	public void testCertificadofin1() {
		
		Adecuacion_Funcional a = new Adecuacion_Funcional(0,0,0,0);
		mantenibilidad m = new mantenibilidad (0,0,0,0,0,0,0);
		Certificado c = new Certificado(a,m);
		
		assertEquals("No se ha podido certificar el software",c.certificadofin());
		
		
		Adecuacion_Funcional a1 = new Adecuacion_Funcional(0,0,0,22);
		mantenibilidad m1 = new mantenibilidad (0,0,0,0,0,0,15);
		Certificado c1 = new Certificado(a1,m1);
		
		assertEquals("No se ha podido certificar el software",c1.certificadofin());
		
		Adecuacion_Funcional a2 = new Adecuacion_Funcional(0,0,0,40);
		mantenibilidad m2 = new mantenibilidad (0,0,0,0,0,0,40);
		Certificado c2 = new Certificado(a2,m2);
		
		assertEquals("No se ha podido certificar el software",c2.certificadofin());
		
		Adecuacion_Funcional a3 = new Adecuacion_Funcional(0,0,0,55);
		mantenibilidad m3 = new mantenibilidad (0,0,0,0,0,0,60);
		Certificado c3 = new Certificado(a3,m3);
		
		assertEquals("No se ha podido certificar el software",c3.certificadofin());
		
		Adecuacion_Funcional a4 = new Adecuacion_Funcional(0,0,0,80);
		mantenibilidad m4 = new mantenibilidad (0,0,0,0,0,0,85);
		Certificado c4 = new Certificado(a4,m4);
		
		assertEquals("El software se ha certificado con calidad",c4.certificadofin());
		
		Adecuacion_Funcional a5 = new Adecuacion_Funcional(0,0,0,91);
		mantenibilidad m5 = new mantenibilidad (0,0,0,0,0,0,95);
		Certificado c5 = new Certificado(a5,m5);
		
		assertEquals("El software se ha certificado con calidad",c5.certificadofin());
		
		Adecuacion_Funcional a6 = new Adecuacion_Funcional(0,0,0,40);
		mantenibilidad m6 = new mantenibilidad (0,0,0,0,0,0,70);
		Certificado c6 = new Certificado(a6,m6);
		
		assertEquals("No se ha podido certificar el software",c6.certificadofin());
	}
	
	


}
