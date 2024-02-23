import java.util.List;

public class CostePersonal {
    //Iteraciones de la lista supuesta de trabajadores
    public static float CosteDelPersonal(List<Trabajador> trabajadores) {
        float costeFinal = 0;

        for (Trabajador trabajador : trabajadores) {
            costeFinal += CosteTrabajador(trabajador);
        }
        return costeFinal;
    }


    //Cálculo del trabajador con el coste (su salario) y horas extras,
    //teniendo en cuenta el tipo de trabajador que es
    private static float CosteTrabajador(Trabajador trabajador) {
        float coste = trabajador.getNomina();
        float horasExtra = trabajador.getHorasExtras();
        int tipoTrabajador = trabajador.getTipoTrabajador();


        if (tipoTrabajador == Trabajador.DIRECTOR || tipoTrabajador == Trabajador.SUBDIRECTOR) {
            return coste;
        }
        else {
            coste += (horasExtra * 20);
        }
        return coste;
    }


    //Clase trabajador que recoge los datos de cada uno
    private static class Trabajador{
        //Constantes Tipos de trabajador
        public static final int DIRECTOR = 1;
        public static final int SUBDIRECTOR = 2;
        public static final int EMPLEADO = 3;


        //Variables que determinan el salario
        private float nomina, horasExtras;
        //Variable que determina cómo se calcula el salario
        private int tipoTrabajador;

        public Trabajador(float nomina, float horasExtras, int tipoTrabajador) {

            this.nomina = nomina;
            this.horasExtras = horasExtras;

            this.tipoTrabajador = tipoTrabajador;
        }

        //Getters de las variables
        public float getNomina() {
            return nomina;
        }
        public float getHorasExtras() {
            return horasExtras;
        }
        public int getTipoTrabajador() {
            return tipoTrabajador;
        }
    }
}






