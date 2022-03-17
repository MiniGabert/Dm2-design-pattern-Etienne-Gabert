package com.tetras.librarie;


public class FlorizarreToMegaFlorizarreAdapter implements IMegaEvoluable{
    
    private Florizarre pokmon  = new Florizarre();

    @Override 
    public Pokemon megaEvoluer(){
        return new MegaFlorizzare();
    } 
}
