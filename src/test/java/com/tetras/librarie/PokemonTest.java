package com.tetras.librarie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class PokemonTest {

    @Test
    public void testTest() {
        assertTrue(true);

        




        //init des pokemon
        Bulbizarre petitBulbizarre = new Bulbizarre();

        Herbizarre moyenhHerbizarre = new Herbizarre();

        IMegaEvoluable Mega = new FlorizarreToMegaFlorizarreAdapter();

        //Tests
        assertTrue(petitBulbizarre instanceof Bulbizarre);
        assertTrue(petitBulbizarre.evoluer() instanceof Herbizarre);
        assertTrue(moyenhHerbizarre.evoluer() instanceof Florizarre);
        assertTrue(Mega.megaEvoluer() instanceof MegaFlorizzare);
        
        System.out.print(petitBulbizarre.getTypes());



        ObscurePokemonDecorator bulbidark = new ObscurePokemonDecorator(new Bulbizarre());
        ObscurePokemonDecorator herbidark = new ObscurePokemonDecorator(new Herbizarre());
        ObscurePokemonDecorator floridark = new ObscurePokemonDecorator(new Florizarre());

        assertTrue(bulbidark.poke instanceof BulbizarreObscure);
        assertTrue(herbidark.poke instanceof HerbizarreObscure);
        assertTrue(floridark.poke instanceof FlorizarreObscure);

        Bulbizarre bulbilight = new Bulbizarre();
        Herbizarre herbilight = new Herbizarre();
        Florizarre florilight = new Florizarre();

        assertTrue(bulbilight instanceof Bulbizarre);
        assertTrue(herbilight instanceof Herbizarre);
        assertTrue(florilight instanceof Florizarre);

    }

}