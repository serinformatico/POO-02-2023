package clase_02.extra;

public class ConversionDeTipoDeDato {
    public static void main(String[] args) {

        // Primitivos
        char caracterPrimitivo         = 'A'; // Nota: En código ANSI el 65 es la A
        int numeroEnteroPrimitivo      = 9;
        float numeroDecimalPrimitivo1  = 175.50f;
        double numeroDecimalPrimitivo2 = 255.75;

        // Wrappers
        Character caracterWrapper    = '5'; // Nota: En código ANSI el 53 es el 5
        Integer numeroEnteroWrapper  = 125;
        Float numeroDecimalWrapper1  = 175.50f;
        Double numeroDecimalWrapper2 = 255.75;

        // Cadenas de texto
        String numeroEnteroString  = "50";
        String numeroDecimalString = "750.25";
        String letraString         = "Hola Mundo";


        // Conversiones entre primitivos: Se logra por medio de un casting
        int primitivoFloatToPrimitivoInt     = (int) numeroDecimalPrimitivo1;
        int primitivoDoubleToPrimitivoInt    = (int) numeroDecimalPrimitivo2;
        float primitivoIntToPrimitivoFloat   = (float) numeroEnteroPrimitivo;
        double primitivoIntToPrimitivoDouble = (double) numeroEnteroPrimitivo;


        // Conversiones de primitivos a wrappers:
        Character primitivoCharToWrapperCharacter = caracterPrimitivo;
        Integer primitivoIntToWrapperInteger      = numeroEnteroPrimitivo;
        Float primitivoFloatToWrapperFloat        = numeroDecimalPrimitivo1;
        Double primitivoDoubleToWrapperDouble     = numeroDecimalPrimitivo2;


        // Conversiones de wrappers a primitivos:
        char wrapperCharacterToPrimitivoChar   = caracterWrapper.charValue();
        int wrapperFloatToPrimitivoInt         = numeroDecimalWrapper1.intValue();
        int wrapperDoubleToPrimitivoInt        = numeroDecimalWrapper2.intValue();
        float wrapperIntegerToPrimitivoFloat   = numeroEnteroWrapper.floatValue();
        double wrapperIntegerToPrimitivoDouble = numeroEnteroWrapper.doubleValue();


        // Conversiones de wrappers a wrappers:
        Integer wrapperFloatToWrapperInt       = numeroDecimalWrapper1.intValue();
        Integer wrapperDoubleToWrapperInt      = numeroDecimalWrapper2.intValue();
        Float wrapperIntegerToWrapperFloat     = numeroEnteroWrapper.floatValue();
        Double wrapperIntegerToWrapperDouble   = numeroEnteroWrapper.doubleValue();
        String wrapperCharacterToWrapperString = caracterWrapper.toString();


        // Conversiones de strings a wrappers:
        Integer stringToWrapperInt  = Integer.parseInt(numeroEnteroString);
        Float stringToObjetoFloat   = Float.parseFloat(numeroDecimalString);
        Double stringToObjetoDouble = Double.parseDouble(numeroDecimalString);


        // Conversiones de wrappers/primitivo a strings:
        String charaterWrapperToString   = String.valueOf(caracterWrapper);
        String charaterPrimitivoToString = String.valueOf(caracterPrimitivo);
        String integerWrapperToString    = String.valueOf(numeroEnteroWrapper);
        String integerPrimitivoToString  = String.valueOf(numeroEnteroPrimitivo);
        String doubleWrapperToString     = String.valueOf(numeroDecimalWrapper2);
        String doublePrimitivoToString   = String.valueOf(numeroDecimalPrimitivo2);
    }
}