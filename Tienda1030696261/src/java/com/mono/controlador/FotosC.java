package com.mono.controlador;

import com.mono.modelo.Fotos;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class FotosC extends Fotos{
    private List<Fotos> fotos;
    
    @PostConstruct
    public void init(){
        fotos=new ArrayList<>();
        for(int i=0;i<5;i++){
            Fotos f=new Fotos(i, "Campo verde", i+".png", i+"");
            fotos.add(f);
        }
    }
    

    public List<Fotos> getFotos() {
        return fotos;
    }

    public void setFotos(List<Fotos> fotos) {
        this.fotos = fotos;
    }
    
}
