package tp1;
import java.time.LocalDate;
import java.time.Period;


public class Persona {
	String nombre;
	int edad;
	LocalDate fecha;
	int dni;
	String sexo;
	double peso;
	double altura;
	
	
	public Persona(int dni){
		this.nombre = "N";
		this.fecha = LocalDate.of(2000, 1, 1);
	    this.edad = (this.calcularEdadActual());
		this.dni = dni;
		this.sexo = "femenino";
		this.peso = 1;
		this.altura = 1; 
		
	}

		
	public Persona (int dni, String nuevonombre){
		this.nombre = nuevonombre;
		this.edad = (this.calcularEdadActual());
		this.fecha = LocalDate.of(2000, 1, 1);
		this.dni = dni;
		this.sexo = "femenino";
		this.peso = 1;
		this.altura = 1; 
		
		
	}
	public Persona (int dni, String nuevonombre, LocalDate fecha){
		this(dni, nuevonombre);
		this.fecha = fecha;
		this.edad = this.calcularEdadActual();
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public LocalDate getFecha() {
		return fecha;
	}

	public double getPeso() {
		return peso;
	}
	
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public double getAltura() {
		return altura;
	}
	
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	double calcularIndiceMasaCorporal() {
	      double indiceMasaCorporal;
	      if (this.altura > 0.0) {
	         indiceMasaCorporal = this.peso / (this.altura * this.altura);
	      } else {
	         indiceMasaCorporal = 0.0;
	      }

	      return indiceMasaCorporal;
	   }

	   boolean saberSiEstaEnForma() {
	      return this.calcularIndiceMasaCorporal() > 18.5 && this.calcularIndiceMasaCorporal() < 25.0;
	   }

	   boolean saberSiCumpleAnios() {
	      LocalDate hoy = LocalDate.now();
	      return hoy.isEqual(this.getFecha());
	   }

	  


	private int calcularEdadConCualquierFecha(LocalDate fechaActual) {
	      Period periodo = Period.between(this.fecha, fechaActual);
	      return periodo.getYears();
	   }

	   private int calcularEdadActual() {
	      LocalDate fechaActual = LocalDate.now();
	      Period periodo = Period.between(this.fecha, fechaActual);
	      return periodo.getYears();
	   }

	   boolean saberSiEsMayorDeEdad() {
	      return this.calcularEdadActual() >= 18;
	   }

	   boolean saberSiPuedeVotar() {
	      return this.calcularEdadActual() >= 16;
	   }

	   boolean saberSiEsCoherente(LocalDate fechaActual) {
	      int edadCalculada = this.calcularEdadConCualquierFecha(fechaActual);
	      return this.edad == edadCalculada;
	   }

	   public String toString() {
	      return "Persona{nombre='" + this.nombre + '\'' + ", edad=" + this.edad + ", fechaNacimiento=" + this.fecha + ", DNI='" + this.dni + '\'' + ", sexo='" + this.sexo + '\'' + ", peso=" + this.peso + ", altura=" + this.altura + '}';
	   }
      
	}
	