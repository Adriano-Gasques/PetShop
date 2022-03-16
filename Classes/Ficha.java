package Classes;

import Classes.Animal;
import Classes.Cliente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Ficha {

    private String Prazo;
    private String obs;
    private int cod;

    private Cliente cliente = new Cliente();

    private Animal animal = new Animal();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    //Tentando fazer algo em relação as data/horas
    private LocalDate data;
    private LocalTime hora;
    private LocalDateTime dataHora;

    /**
     * Fiz esse teste para saber se ia da certo.
     *         Ficha ficha = new Ficha();
     *
     *         System.out.println(ficha.getData());
     *         System.out.println(ficha.getHora());
     *         System.out.println(ficha.getDataHora());
     */

    DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //Um pequeno detalhe aqui, o HH o formato das horas fica em 24hrs, já em hh o formato fica em 12hrs.
    DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm:ss");
    DateTimeFormatter formatadorDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");

    public String getData() {
        data = LocalDate.now();
        return data.format(formatadorData);
    }

    public String getHora() {
        hora = LocalTime.now();
        return hora.format(formatadorHora);
    }

    public String getDataHora() {
        dataHora = LocalDateTime.now();
        return dataHora.format(formatadorDataHora);
    }

    public String getPrazo() {
        return Prazo;
    }

    public void setPrazo(String prazo) {
        Prazo = prazo;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }


}
