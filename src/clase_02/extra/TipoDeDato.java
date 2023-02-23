package clase_02.extra;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class TipoDeDato {
    public static void main(String[] args) {

        // Tipos de datos primitivos
        byte numeroEnteroConSignoMuyCorto = 127;                                    // Rango: de -128 a 127 (8 bits).
        short numeroEnteroConSignoCorto = 32767;                                    // Rango: de -32768 a 32767 (16 bits).
        int numeroEnteroConSigno = 2147483647;                                      // Rango: de -2147483648 a 2147483647 (32 bits).
        long numeroEnteroConSignoLargo = 9223372036854775807l;                      // Rango: de -9223372036854775808 a 9223372036854775807 (64 bits).
        float numeroDecimalEnorme = 9223372036854775807.0f;                         // (32 bits).
        double numeroDecimalMasEnorme = 92233720368547758079223372036854775807.0;   // (64 bits).
        boolean valorBoleano = true;                                                // true o false (1 bit).
        char valorCaracter = 'a';                                                   // Carácter Unicode - usar comillas simples (16 bits).


        // Tipos de datos wrappers
        String cadenaDeTexto = "Hola"; // Se usan comillas dobles
        Byte objNumeroEnteroConSignoMuyCorto = 127;
        Short objNumeroEnteroConSignoCorto = 32767;
        Integer objNumeroEnteroConSigno = 2147483647;
        Long objNumeroEnteroConSignoLargo = 9223372036854775807l;
        Float objNumeroDecimalEnorme = 9223372036854775807.0f;
        Double objNumeroDecimalMasEnorme = 92233720368547758079223372036854775807.0;
        Boolean objValorBoleano = true;
        Character objValorCaracter = 'a';


        // Tipos de datos Arrays:
        String[] cadenasDeTexto = {"Hola", "Chau"};
        byte[] numerosEnteroConSignoMuyCorto = {0, 127};
        short[] numerosEnteroConSignoCorto = {0, 32767};
        int[] numerosEnteroConSigno = {0, 2147483647};
        long[] numerosEnteroConSignoLargo = {0, 9223372036854775807l};
        float[] numerosDecimalEnorme = {0, 9223372036854775807.0f};
        double[] numerosDecimalMasEnorme = new double[]{0, 92233720368547758079223372036854775807.0};
        boolean[] valoresBoleano = new boolean[]{false, true};
        char[] valoresCaracter = new char[3];
        valoresCaracter[0] = 'a';
        valoresCaracter[1] = 'b';
        valoresCaracter[2] = 'c';


        // Tipos de datos DateTime
        LocalTime horarioActual             = LocalTime.now();
        LocalTime horarioIndicada           = LocalTime.of(20, 45);
        LocalDate fechaActual               = LocalDate.now();
        LocalDate fechaIndicada             = LocalDate.of(1950, 06, 25);
        LocalDateTime fechaYHorarioActual   = LocalDateTime.now();
        LocalDateTime fechaYHorarioIndicada = LocalDateTime.of(1950, 06, 25, 20, 45);
        LocalDateTime fechaDelUltimoDiaDelMes = fechaYHorarioActual.with(TemporalAdjusters.lastDayOfMonth());

        // Extraciones específicas de DateTime
        int horaDeFechaYHorario = fechaYHorarioIndicada.getHour();
        int minutoDeFechaYHorario = fechaYHorarioIndicada.getMinute();
        int diaDeFechaYHorario = fechaYHorarioIndicada.getDayOfMonth();
        int mesDeFechaYHorario = fechaYHorarioIndicada.getMonthValue();
        int anioDeFechaYHorario = fechaYHorarioIndicada.getYear();

        // Manipulaciones de DateTime
        LocalDateTime fechaYHorarioIndicadaMasUnaHora = fechaYHorarioIndicada.plusHours(1);
        LocalDateTime fechaYHorarioIndicadaMasUnMinuto = fechaYHorarioIndicada.plusMinutes(1);
        LocalDateTime fechaYHorarioIndicadaMasUnDia = fechaYHorarioIndicada.plusDays(1);
        LocalDateTime fechaYHorarioIndicadaMasUnMes = fechaYHorarioIndicada.plusMonths(1);
        LocalDateTime fechaYHorarioIndicadaMasUnAnio = fechaYHorarioIndicada.plusYears(1);
    }
}