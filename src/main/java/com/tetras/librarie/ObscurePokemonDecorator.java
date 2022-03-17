package com.tetras.librarie;



public class ObscurePokemonDecorator{

    public Pokemon poke;

    public ObscurePokemonDecorator (Pokemon pPokemon){
        if (pPokemon instanceof Bulbizarre){
            poke = new BulbizarreObscure();
        } else if(pPokemon instanceof Herbizarre){
            poke = new HerbizarreObscure();
        } else if(pPokemon instanceof Florizarre){
            poke = new FlorizarreObscure();
        }
    }

    public Pokemon Purifier(){
        if (this.poke instanceof BulbizarreObscure){
            return new Bulbizarre();
        } else if(this.poke instanceof HerbizarreObscure){
            return new Herbizarre();
        } else {
            return new Florizarre();
        } 
    }
}