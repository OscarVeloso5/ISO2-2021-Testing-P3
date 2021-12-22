package C03_Testing_P3;

public class Adecuacion_Funcional {

	int adecuacionFun;
	
	int completitudFun;
	int correccionFun;
	int pertinenciaFun;
		
	int rango;
	
	public Adecuacion_Funcional(int completitudFun, int correccionFun, int pertinenciaFun, int rango) {
		
		this.completitudFun = completitudFun;
		this.correccionFun = correccionFun;
		this.pertinenciaFun = pertinenciaFun;
		this.rango = rango;
	}
	
	// Metodos necesarios para adecuacion 
	
	public int medicionCompletitudFun(int rango) {
		
		if(rango>=0 && rango<10) {
			
			completitudFun= 0;
		}else if(rango>=10 && rango<35) {
			
			completitudFun= 1;
		}else if(rango>=35 && rango<50) {
			
			completitudFun= 2;
			
		}else if(rango>=50 && rango<70) {
			
			completitudFun= 2;
		}else if(rango>=70 && rango<90) {
			
			completitudFun= 3;
		}else if(rango>=90 && rango<100) {
			completitudFun= 4;
		}
		
		return completitudFun;
	}
	
	public int medicionCorreccionFun(int rango) {
		
		if(rango>=0 && rango<10) {
			correccionFun= 0;
		}
		else if(rango>=10 && rango<35) {
			correccionFun= 1;
		}
		else if(rango>=35 && rango<50) {
			correccionFun= 2;
		}
		else if(rango>=50 && rango<70) {
			correccionFun= 2;
		}
		else if(rango>=70 && rango<90) {
			correccionFun= 3;
		}
		else if(rango>=90 && rango<100) {
			correccionFun= 4;
		}
		
		return correccionFun;
	}
	
	public int medicionPertinencia(int rango) {
	
		if(rango>=0 && rango<10) {
			
			pertinenciaFun= 0;
		}
		else if(rango>=10 && rango<35) {
			
			pertinenciaFun= 1;
		}
		else if(rango>=35 && rango<50) {
			
			pertinenciaFun= 2;
		}
		else if(rango>=50 && rango<70) {
			pertinenciaFun= 2;
		}
		else if(rango>=70 && rango<90) {
			pertinenciaFun= 3;
		}
		else if(rango>=90 && rango<100) {
			pertinenciaFun= 4;
		}
		
		return pertinenciaFun;
	}
	

	public int AdecuacionFuncional(int a, int b,int c) {
		
		int min= 10;
		int num= 0;
		int[] mediciones = (new int[] {a,b,c});
		
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
