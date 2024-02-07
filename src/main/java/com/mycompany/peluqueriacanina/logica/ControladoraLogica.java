
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    ControladoraPersistencia controladoraPersis =new ControladoraPersistencia();

    public void guardar(String nombreMascota, String raza, 
            String color, String observaciones, String alergico,
            String atEspecial, String nomDuenio, String celDuenio) {
        
           Duenio duenio =new Duenio();
           duenio.setNombre(nomDuenio);
           duenio.setCelular(celDuenio);
           
           Mascota mascota = new Mascota();
           mascota.setNombre(nombreMascota);
           mascota.setRaza(raza);
           mascota.setColor(color);
           mascota.setObservaciones(observaciones);
           mascota.setAlergico(alergico);
           mascota.setAtencion_especial(atEspecial);
           mascota.setDuenio(duenio);
           
          controladoraPersis.guardar(duenio, mascota);
           
    }
}
