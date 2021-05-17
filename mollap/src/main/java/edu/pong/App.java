package edu.pong;

import edu.pong.administrator.TasksProgrammer;
import edu.pong.clients.Mollapp;
import edu.pong.filters.Authorization;
import edu.pong.targets.Vehicle;
import edu.pong.filters.Authentication;

public final class App {
    public static void main(String[] args) {

        /**
         * Configuració del programador de tasques
         * del sistema amb el tipus de target triat:
         * des de vehicles a qualsevol cosa que admiteix
         * la recepció d'un missatge.
         */
        TasksProgrammer programadorTasques = new TasksProgrammer(new Vehicle());

        /**
         * Afegir al sistema les tasques que volem que el sistema
         * executi al rebre la petició del client.
         */
        programadorTasques.setTasks(new Authentication());
        programadorTasques.setTasks(new Authorization());

        /**
         * Configuració de l'app client per a que
         * executi les tasques programades i
         * enviï el misstage al sistema.
         */
        Mollapp mollapp = new Mollapp();
        mollapp.setTasksProgrammer(programadorTasques);
        mollapp.sendRequest("Francesc");
    }
}