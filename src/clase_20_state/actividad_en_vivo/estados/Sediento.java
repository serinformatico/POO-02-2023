package clase_20_state.actividad_en_vivo.estados;

import clase_20_state.actividad_en_vivo.*;

public class Sediento implements TamagotchiState {

    // Atributo privado
    private String nombreDelEstado;
    private Tamagotchi tamagotchi;

    // Constructor
    public Sediento(Tamagotchi tamagotchi) {
        this.tamagotchi      = tamagotchi;
        this.nombreDelEstado = "sediento";
    }

    // Métodos obligatorios
    @Override
    public void comer() {
        System.out.println("Display: ñom ñom ñom (estoy " + this.nombreDelEstado + " y me puse triste)");
        this.tamagotchi.setEstado(new Triste(tamagotchi));
    }

    @Override
    public void beber() {
        System.out.println("Display: glu glu glu (estoy " + this.nombreDelEstado + " y me puse feliz)");
        this.tamagotchi.setEstado(new Feliz(tamagotchi));
    }

    @Override
    public void mimar() {
        System.out.println("Display: mimando... (sigo " + this.nombreDelEstado + ")");
    }
}
