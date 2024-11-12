package tarea_10b;

/* Realiza un programa Java que lea los datos de 5 alumnos, y genere un documento JSON
 * con estos alumnos.
 * 
 * Para cada alumno se tiene: NIA (entero), Nombre (String), Apellidos (String), Genero (Char),
 * Fecha de Nacimiento (Fecha), Ciclo (String), Curso (String), Grupo (String).
 * 
 * Crea un programa que lea un fichero JSON que contiene alumnos y los muestre por pantalla.
 * 
 * El formato de JSON es el mismo que utilizaste en el programa anterior.*/

public class App {
	public static void main(String[] args) {

		// lee los datos de 5 alumnos, y genere un documento JSON con estos alumnos.
		new Alumno().generaJSONconGSONdesdeLista(new Alumno().leeAlumnos());

		// lee un fichero JSON que contiene alumnos y los muestra por pantalla:
		new Alumno().leerJSONconGSONyMostrarAlumnos(new Alumno().solicitarFicheroJSON());
	}
}