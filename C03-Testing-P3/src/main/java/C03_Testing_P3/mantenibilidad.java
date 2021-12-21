package C03_Testing_P3;

public class mantenibilidad {

	int mantenibilidad;
	
	int modularidad;
	int reusabilidad;
	int analizabilidad;
	int capacidadMod;
	int capacidadPro;
	
	int rango;
	
	public mantenibilidad(int mantenibilidad, int modularidad, int reusabilidad,int analizabilidad, int capacidadMod,
			int capacidadPro, int calidadFinal, int rango) {
		this.mantenibilidad = mantenibilidad;
		this.modularidad = modularidad;
		this.reusabilidad = reusabilidad;
		this.analizabilidad = analizabilidad;
		this.capacidadMod = capacidadMod;
		this.capacidadPro = capacidadPro;
		this.rango = rango;
	}
	public int getMantenibilidad() {
		return mantenibilidad;
	} 
public int medicionModularidad() {
		
		if(rango>=0 && rango<10) {
			modularidad= 0;
		}
		if(rango>=10 && rango<35) {
			modularidad= 1;
		}
		if(rango>=35 && rango<50) {
			modularidad= 2;
		}
		if(rango>=50 && rango<70) {
			modularidad= 2;
		}
		if(rango>=70 && rango<90) {
			modularidad= 3;
		}
		if(rango>=90 && rango<100) {
			modularidad= 4;
		}
		
		return modularidad;
	}

public int medicionReusabilidad() {
	
	if(rango>=0 && rango<10) {
		reusabilidad= 0;
	}
	if(rango>=10 && rango<35) {
		reusabilidad= 1;
	}
	if(rango>=35 && rango<50) {
		reusabilidad= 2;
	}
	if(rango>=50 && rango<70) {
		reusabilidad= 2;
	}
	if(rango>=70 && rango<90) {
		reusabilidad= 3;
	}
	if(rango>=90 && rango<100) {
		reusabilidad= 5;
	}
	
	return reusabilidad;
}
public int medicionAnalizabilidad() {
	
	if(rango>=0 && rango<10) {
		analizabilidad= 0;
	}
	if(rango>=10 && rango<35) {
		analizabilidad= 0;
	}
	if(rango>=35 && rango<50) {
		analizabilidad= 1;
	}
	if(rango>=50 && rango<70) {
		analizabilidad= 2;
	}
	if(rango>=70 && rango<90) {
		analizabilidad= 3;
	}
	if(rango>=90 && rango<100) {
		analizabilidad= 5;
	}
	
	return analizabilidad;
}
public int medicionCapadidadMod() {
	
	if(rango>=0 && rango<10) {
		capacidadMod= 0;
	}
	if(rango>=10 && rango<35) {
		capacidadMod= 1;
	}
	if(rango>=35 && rango<50) {
		capacidadMod= 2;
	}
	if(rango>=50 && rango<70) {
		capacidadMod= 3;
	}
	if(rango>=70 && rango<90) {
		capacidadMod= 4;
	}
	if(rango>=90 && rango<100) {
		capacidadMod= 5;
	}
	
	return capacidadMod;
}
public int medicionCapadidadPro() {
	
	if(rango>=0 && rango<10) {
		capacidadPro= 0;
	}
	if(rango>=10 && rango<35) {
		capacidadPro= 1;
	}
	if(rango>=35 && rango<50) {
		capacidadPro= 1;
	}
	if(rango>=50 && rango<70) {
		capacidadPro= 2;
	}
	if(rango>=70 && rango<90) {
		capacidadPro= 4;
	}
	if(rango>=90 && rango<100) {
		capacidadPro= 4;
	}
	
	return capacidadMod;
}


public int Mantenibilidad(int modularidad, int reusabilidad, int analizabilidad, int capacidadMod, int capacidadPro) {
	int min= 0;
	int num= 0;
	int[] mediciones = (new int[] {modularidad, reusabilidad, analizabilidad, capacidadMod, capacidadPro});
	
	for(int i =0; i<mediciones.length; i++) {
		num= mediciones[i];
		if (num<min) {
			min = num;
		}
	}
	mantenibilidad = min;
	return mantenibilidad;
}
}
