package C03_Testing_P3;

public class Certificado{

	int certificadoFinal;
	

	public Certificado(int adecuacionFun, int mantenibiliad, int certificadoFinal) {
		this.adecuacionFun = adecuacionFun;
		this.mantenibiliad = mantenibiliad;
		this.certificadoFinal = certificadoFinal;
	}
	public String certificadofinal() {
		String msgCertificado= "";
		if (adecuacionFun == 1) {
			if (mantenibilidad ==1) {
				certificadoFinal = 1;
			}else if (mantenibilidad ==2) {
				certificadoFinal = 1;
			}else if (mantenibilidad ==3) {
				certificadoFinal = 1;
			}else if (mantenibilidad ==4) {
				certificadoFinal = 1;
			}else if (mantenibilidad ==5) {
				certificadoFinal = 1;
			}
		}else if (adecuacionFun == 2) {
			if(mantenibilidad==1) {
				certificadoFinal = 1;
			}else if (mantenibilidad ==2) {
				certificadoFinal = 2;
			}else if (mantenibilidad ==3) {
				certificadoFinal = 2;
			}else if (mantenibilidad ==4) {
				certificadoFinal = 2;
			}else if (mantenibilidad ==5) {
				certificadoFinal = 2;
			}
		}else if (adecuacionFun ==3) {
			if(mantenibilidad ==1) {
				certificadoFinal =2;
			}else if (mantenibilidad ==2) {
				certificadoFinal = 2;
			}else if (mantenibilidad ==3) {
				certificadoFinal = 3;
			}else if (mantenibilidad ==4) {
				certificadoFinal = 3;
			}else if (mantenibilidad ==5) {
				certificadoFinal = 3;
			}
		}else if (adecuacionFun == 4) {
			if (mantenibilidad ==1) {
				certificadoFinal =3;
			}else if (mantenibilidad ==2) {
				certificadoFinal = 3;
			}else if (mantenibilidad ==3) {
				certificadoFinal = 3;
			}else if (mantenibilidad ==4) {
				certificadoFinal = 3;
			}else if (mantenibilidad ==5) {
				certificadoFinal = 4;
			}
		}else if(adecuacionFun==5) {
			if (mantenibilidad ==1) {
				certificadoFinal = 3;
			}else if (mantenibilidad ==2) {
				certificadoFinal = 3;
			}else if (mantenibilidad ==3) {
				certificadoFinal = 4;
			}else if (mantenibilidad ==4) {
				certificadoFinal = 4;
			}else if (mantenibilidad ==5) {
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
