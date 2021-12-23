/*

 */
package ejercicio2;

import ejercicio2.relaciones.entidades.Juego;
import ejercicio2.relaciones.entidades.Jugador;
import ejercicio2.relaciones.entidades.Revolver;
import java.util.ArrayList;

public class ejercicio2 {

    public static void main(String[] args) {
        Juego juego = new Juego();
        ArrayList<Jugador> js = new ArrayList();
        Revolver r = new Revolver();
        System.out.println("Bienvenido ");
        System.out.println("========== ");
        System.out.print("                             ,_____________________________7 \n" +
"           |-_______------. `\\                             |\n" +
"       _,/ | _______)     |___\\____________________________|\n" +
"  .__/`((  | _______      | (/))_______________=.\n" +
"     `~) \\ | _______)     |   /----------------_/\n" +
"       `__y|______________|  /\n" +
"       / ________ __________/\n" +
"      / /#####\\(  \\  /     ))\n" +
"     / /#######|\\  \\(     //\n" +
"    / /########|.\\______ad/`\n" +
"   / /###(\\)###||`------``\n" +
"  / /##########||\n" +
" / /###########||\n" +
"( (############||\n" +
" \\ \\####(/)####))\n" +
"  \\ \\#########//\n" +
"   \\ \\#######//\n" +
"    `---|_|--`\n" +
"       ((_))\n" +
"        `-`");
        System.out.println("   ");
        
        for (int i = 0; i < 6; i++) {
            js.add(new Jugador(i+1));

        }
        r.llenarResolver();
        juego.llenarJuego(js, r);
        //       for (int i = 0; i < 6; i++) {
        //         juego.agregarLista();
//            juego.llenarJuego(js, r);
        // }
//         juego.llenarJuego(js, r);

        juego.ronda();
        

//    juego.llenarJuego(js, r);
//for (int i = 0; i < 6; i++) {
//         juego.agregarLista();
//        }
    }
}
