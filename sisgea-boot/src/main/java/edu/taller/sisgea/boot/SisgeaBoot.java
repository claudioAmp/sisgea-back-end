package edu.taller.sisgea.boot;

import edu.taller.sisgea.consultas.ConsultasBoot;
import edu.taller.sisgea.mantenimientos.MantenimientosBoot;
import edu.taller.sisgea.procesos.ProcesosBoot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackageClasses = {
                MantenimientosBoot.class,
                ConsultasBoot.class,
                ProcesosBoot.class
        }
)
public class SisgeaBoot {

    public static void main(String[] args){
        SpringApplication.run(SisgeaBoot.class,args);
    }

}
