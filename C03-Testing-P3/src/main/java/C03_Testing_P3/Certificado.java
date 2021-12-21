package C03_Testing_P3;

public class Certificado{

	int certificadoFinal;
	mantenibilidad mantenibilidad;
	Adecuacion_Funcional adecuacionFun;

	public Certificado(Adecuacion_Funcional adecuacionFun, mantenibilidad mantenibilidad, int certificadoFinal) {
		this.adecuacionFun = adecuacionFun;
		this.mantenibilidad = mantenibilidad;
		this.certificadoFinal = certificadoFinal;
	}
	public String certificadofinal() {
		String msgCertificado= "";
		if (adecuacionFun.adecuacionFun == 1) {
			if (mantenibilidad.mantenibilidad ==1) {
				certificadoFinal = 1;
			}else if (mantenibilidad.mantenibilidad ==2) {
				certificadoFinal = 1;
			}else if (mantenibilidad.mantenibilidad ==3) {
				certificadoFinal = 1;
			}else if (mantenibilidad.mantenibilidad ==4) {
				certificadoFinal = 1;
			}else if (mantenibilidad.mantenibilidad ==5) {
				certificadoFinal = 1;
			}
		}else if (adecuacionFun.adecuacionFun == 2) {
			if(mantenibilidad.mantenibilidad==1) {
				certificadoFinal = 1;
			}else if (mantenibilidad.mantenibilidad ==2) {
				certificadoFinal = 2;
			}else if (mantenibilidad.mantenibilidad ==3) {
				certificadoFinal = 2;
			}else if (mantenibilidad.mantenibilidad ==4) {
				certificadoFinal = 2;
			}else if (mantenibilidad.mantenibilidad ==5) {
				certificadoFinal = 2;
			}
		}else if (adecuacionFun.adecuacionFun ==3) {
			if(mantenibilidad.mantenibilidad ==1) {
				certificadoFinal =2;
			}else if (mantenibilidad.mantenibilidad ==2) {
				certificadoFinal = 2;
			}else if (mantenibilidad.mantenibilidad ==3) {
				certificadoFinal = 3;
			}else if (mantenibilidad.mantenibilidad ==4) {
				certificadoFinal = 3;
			}else if (mantenibilidad.mantenibilidad ==5) {
				certificadoFinal = 3;
			}
		}else if (adecuacionFun.adecuacionFun == 4) {
			if (mantenibilidad.mantenibilidad ==1) {
				certificadoFinal =3;
			}else if (mantenibilidad.mantenibilidad ==2) {
				certificadoFinal = 3;
			}else if (mantenibilidad.mantenibilidad ==3) {
				certificadoFinal = 3;
			}else if (mantenibilidad.mantenibilidad ==4) {
				certificadoFinal = 3;
			}else if (mantenibilidad.mantenibilidad ==5) {
				certificadoFinal = 4;
			}
		}else if(adecuacionFun.adecuacionFun==5) {
			if (mantenibilidad.mantenibilidad ==1) {
				certificadoFinal = 3;
			}else if (mantenibilidad.mantenibilidad ==2) {
				certificadoFinal = 3;
			}else if (mantenibilidad.mantenibilidad ==3) {
				certificadoFinal = 4;
			}else if (mantenibilidad.mantenibilidad ==4) {
				certificadoFinal = 4;
			}else if (mantenibilidad.mantenibilidad ==5) {
				certificadoFinal = 5;
			}
		}
		
		if (certificadoFinal >= 3) {
			msgCertificado= "El software se ha certificado con una calidad de"+certificadoFinal;
		}else {
			msgCertificado = "No se ha podido certificar el software";
		}
	
		return msgCertificado;
	}
}
