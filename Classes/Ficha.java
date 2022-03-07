package Classes;

import Classes.Animal;
import Classes.Cliente;

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

    // private Date data;
   // private String data1 = new SimpleDateFormat("dd/MM/yyyy").format(data);
  //  private String hora = new SimpleDateFormat("HH:mm").format(data);

    /*   public String getData1() {
           return data1;


     /*  public void setData1(String data1) {
           this.data1 = data1;
       }

       public String getHora() {
           return hora;
       }

       public void setHora(String hora) {
           this.hora = hora;
       }
           public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

     */
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
