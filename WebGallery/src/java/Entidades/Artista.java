/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author raar
 */
public class Artista extends Usuario{
    private ArrayList<String> curriculum=new ArrayList<String>();
    private String distinciones;
    private ArrayList<Obra_de_arte> obras=new ArrayList();

    public ArrayList<String> getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(ArrayList<String> curriculum) {
        this.curriculum = curriculum;
    }

    public String getDistinciones() {
        return distinciones;
    }

    public void setDistinciones(String distinciones) {
        this.distinciones = distinciones;
    }

    public ArrayList<Obra_de_arte> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra_de_arte> obras) {
        this.obras = obras;
    }
    
}
