package C03_Testing_P3;

public class Certificado{

	
	mantenibilidad mantenibilidad;
	Adecuacion_Funcional adecuacionFun;

	public Certificado(Adecuacion_Funcional adecuacionFun, mantenibilidad mantenibilidad) {
		this.adecuacionFun = adecuacionFun;
		this.mantenibilidad = mantenibilidad;
	
	}
	public String certificadofin() {
		int certificadoFinal=0;
		String msgCertificado= "";
		
		int adecuacion = adecuacionFun.AdecuacionFuncional(adecuacionFun.medicionCompletitudFun(adecuacionFun.rango)
				,adecuacionFun.medicionCorreccionFun(adecuacionFun.rango), adecuacionFun.medicionPertinencia(adecuacionFun.rango));
		
		int mantenibilidadFinal = mantenibilidad.Mantenibilidad(mantenibilidad.medicionModularidad(mantenibilidad.rango), mantenibilidad.medicionReusabilidad(mantenibilidad.rango),
				mantenibilidad.medicionAnalizabilidad(mantenibilidad.rango), mantenibilidad.medicionCapadidadMod(mantenibilidad.rango), mantenibilidad.medicionCapadidadPro(mantenibilidad.rango));
		
		if (adecuacion == 1) {
		
			if (mantenibilidadFinal ==1) {
				certificadoFinal = 1;
			}else if (mantenibilidadFinal ==2) {
				certificadoFinal = 1;
			}else if (mantenibilidadFinal ==3) {
				certificadoFinal = 1;
			}else if (mantenibilidadFinal ==4) {
				certificadoFinal = 1;
			}else if (mantenibilidadFinal ==5) {
				certificadoFinal = 1;
			}
		}else if (adecuacion == 2) {
			
			if(mantenibilidadFinal==1) {
				certificadoFinal = 1;
			}else if (mantenibilidadFinal ==2) {
				certificadoFinal = 2;
			}else if (mantenibilidadFinal ==3) {
				certificadoFinal = 2;
			}else if (mantenibilidadFinal ==4) {
				certificadoFinal = 2;
			}else if (mantenibilidadFinal ==5) {
				certificadoFinal = 2;
			}
		}else if (adecuacion==3) {
			
			if(mantenibilidadFinal==1) {
				certificadoFinal =2;
			}else if (mantenibilidadFinal ==2) {
				certificadoFinal = 2;
			}else if (mantenibilidadFinal ==3) {
				certificadoFinal = 3;
			}else if (mantenibilidadFinal ==4) {
				certificadoFinal = 3;
			}else if (mantenibilidadFinal ==5) {
				certificadoFinal = 3;
			}
		}else if (adecuacion == 4) {
		
			if (mantenibilidadFinal ==1) {
				certificadoFinal =3;
			}else if (mantenibilidadFinal==2) {
				certificadoFinal = 3;
			}else if (mantenibilidadFinal==3) {
				certificadoFinal = 3;
			}else if (mantenibilidadFinal==4) {
				certificadoFinal = 3;
			}else if (mantenibilidadFinal ==5) {
				certificadoFinal = 4;
			}
		}else if(adecuacion==5) {
		
			if (mantenibilidadFinal==1) {
				certificadoFinal = 3;
			}else if (mantenibilidadFinal==2) {
				certificadoFinal = 3;
			}else if (mantenibilidadFinal ==3) {
				certificadoFinal = 4;
			}else if (mantenibilidadFinal ==4) {
				certificadoFinal = 4;
			}else if (mantenibilidadFinal==5) {
				certificadoFinal = 5;
			}
		}
		
		if (certificadoFinal >= 3) {
			
			msgCertificado= "El software se ha certificado con calidad";
		}else {
			msgCertificado = "No se ha podido certificar el software";
		}
	
		return msgCertificado;
	}
}
