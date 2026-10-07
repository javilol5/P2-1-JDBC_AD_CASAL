package javier.casal;

import java.sql.Date;

public class Anime {

    private String nome;
    private String descripcion;
    private Date data;
    private int puntuacion;

    public Anime(String nome, String descripcion, Date data, int puntuacion) {
        this.nome = nome;
        this.descripcion = descripcion;
        this.data = data;
        this.puntuacion = puntuacion;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getNome() {
        return nome;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Date getData() {
        return data;
    }
    public int getPuntuacion() {
        return puntuacion;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", data=" + data +
                ", puntuacion=" + puntuacion +
                '}';
    }
}