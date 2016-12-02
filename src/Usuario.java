import java.util.Calendar;
import java.util.Random;

import org.springframework.format.annotation.DateTimeFormat;

public class Usuario {
    private Long id;

	private String nome;
	private int simbolo1;
	private int simbolo2;
	private int simbolo3;
	private int moeda = 10;
    @DateTimeFormat(pattern="dd/MM/yyyy HH:MI:SS")
    private Calendar dataJogada;
    
    public Long getId() {
    	return id;
    }
    
    public void setId(Long id) {
    	this.id = id;
    }
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMoeda() {
		return moeda;
	}
	public void setMoeda(int moeda) {
		this.moeda = moeda;
	}
	
    public Calendar getDataJogada() {
    	return dataJogada;
    	}
    
    public void setDataJogada(Calendar dataJogada) {
    	this.dataJogada = dataJogada;
    	}
	public int getSimbolo1() {
		Random r = new Random();
		int Low = 0;
		int High = 9;
		simbolo1 = r.nextInt(High-Low) + Low;
		return simbolo1;
	}
	
	public int getSimbolo2() {
		Random r = new Random();
		int Low = 0;
		int High = 9;
		simbolo2 = r.nextInt(High-Low) + Low;
		return simbolo2;
	}
	
	public int getSimbolo3() {
		Random r = new Random();
		int Low = 0;
		int High = 9;
		simbolo3 = r.nextInt(High-Low) + Low;
		return simbolo3;
	}
	
	

}
