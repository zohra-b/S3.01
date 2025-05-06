package org;

import org.commands.Accelerar;
import org.commands.Arrencar;
import org.commands.Command;
import org.commands.Frenar;
import org.invoker.Invoker;
import org.receivers.*;

public class Main {
    public static void main(String[] args) {

        Cotxe cotxe = new Cotxe();
        Bici bici = new Bici();
        Avio avio = new Avio();
        Vaixell vaixell = new Vaixell();

        Arrencar arrencar = new Arrencar();
        Accelerar accelerar = new Accelerar();
        Frenar frenar = new Frenar();

        Invoker invokerCotxe = new Invoker(cotxe);
        invokerCotxe.submit(arrencar);
        invokerCotxe.submit(accelerar);
        invokerCotxe.submit(frenar);
        System.out.println("\n");

        Invoker invokerBici = new Invoker(bici);
        invokerBici.submit(arrencar);
        invokerBici.submit(accelerar);
        invokerBici.submit(frenar);
        System.out.println("\n");

        Invoker invokerAvio = new Invoker(avio);
        invokerAvio.submit(arrencar);
        invokerAvio.submit(accelerar);
        invokerAvio.submit(frenar);
        System.out.println("\n");

        Invoker invokerVaixell = new Invoker(vaixell);
        invokerVaixell.submit(arrencar);
        invokerVaixell.submit(accelerar);
        invokerVaixell.submit(frenar);

    }
}