package C03_Testing_P3;

public class Adecuacion_Funcional {

	int adecuacionFun;
	
	int completitudFun;
	int correccionFun;
	int pertinenciaFun;
		
	int rango;
	
	public Adecuacion_Funcional(int adecuacionFun, int completitudFun, int correccionFun, int pertinenciaFun, int rango) {
		this.adecuacionFun = adecuacionFun;
		this.completitudFun = completitudFun;
		this.correccionFun = correccionFun;
		this.pertinenciaFun = pertinenciaFun;
		this.rango = rango;
	}
	
	// Metodos necesarios para adecuacion 
	
	public int medicionCompletitudFun() {
		
		if(rango>=0 && rango<10) {
			completitudFun= 0;
		}
		if(rango>=10 && rango<35) {
			completitudFun= 1;
		}
		if(rango>=35 && rango<50) {
			completitudFun= 2;
		}
		if(rango>=50 && rango<70) {
			completitudFun= 2;
		}
		if(rango>=70 && rango<90) {
			completitudFun= 3;
		}
		if(rango>=90 && rango<100) {
			completitudFun= 4;
		}
		
		return completitudFun;
	}
	
	public int medicionCorreccionFun() {
		
		if(rango>=0 && rango<10) {
			correccionFun= 0;
		}
		if(rango>=10 && rango<35) {
			correccionFun= 1;
		}
		if(rango>=35 && rango<50) {
			correccionFun= 2;
		}
		if(rango>=50 && rango<70) {
			correccionFun= 2;
		}
		if(rango>=70 && rango<90) {
			correccionFun= 3;
		}
		if(rango>=90 && rango<100) {
			correccionFun= 4;
		}
		
		return correccionFun;
	}
	
	public int medicionPertinencia() {
		
		if(rango>=0 && rango<10) {
			pertinenciaFun= 0;
		}
		if(rango>=10 && rango<35) {
			pertinenciaFun= 1;
		}
		if(rango>=35 && rango<50) {
			pertinenciaFun= 2;
		}
		if(rango>=50 && rango<70) {
			pertinenciaFun= 2;
		}
		if(rango>=70 && rango<90) {
			pertinenciaFun= 3;
		}
		if(rango>=90 && rango<100) {
			pertinenciaFun= 4;
		}
		
		return pertinenciaFun;
	}
	public int AdecuacionFuncional(int completitudFun, int correccionFun, int pertinenciaFun) {
		int min= 0;
		int num= 0;
		int[] mediciones = (new int[] {completitudFun, correccionFun, pertinenciaFun});
		
		for(int i =0; i<mediciones.length; i++) {
			num= mediciones[i];
			if (num<min) {
				min = num;
			}
		}
		adecuacionFun = min;
		return adecuacionFun;
	}
	
	
}
