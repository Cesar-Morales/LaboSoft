package ejercicio4;

public class Partido {
	Partido() throws FutbolException{}
	void evento() throws FutbolException{}
	void jugada() throws EquipoIncompleto,
	Falta{}
	void penal(){}
}

// Throws en las clases se heredan, y en los metodos no
// En las clases tenes que implementar todo throws de tu superclase
// y agregarles los que quieras

// En cambio con los metodos pasa al reves, podes heredarlos o no
// pero no podes agregarle nuevos throws