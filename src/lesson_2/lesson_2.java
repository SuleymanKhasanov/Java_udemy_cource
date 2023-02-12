package lesson_2;
/*Урок №2: Типы данных, обявление переменной. В Java существуют 8 тпов данных 4 из них отвечают за целые числа это:
* 1. Byte - числа значения которых не превышают 127 (8 бит)
* 2. Short - числа значения которых не превышают 32767 (16 бит)
* 3. Int - числа значения которых не превышают 2147483647 (32 бит) (Значение по умолчанию)
* 4. Long - числа значения которых не превышают 9223372036854775807 (64 бит) (На конце необхадимо ставить букву "L")
*
* Также имеются 2 тапа данных определяющих дробные числа это:
* 1. Float - является на именее точным занчением (32 бит) (На конце необхадимо ставить букву "F")
* 2. Double - является наибелее точным занчением (64 бит) Значение по умолчанию
*
* Тип данных Boolean отвечает за логтческие операции имеет занчения "True", "False"
*
* Тип данных Char является символьным типом данных записывается в одинарных кавычках ' ' может содержать
* только значение одного символа например:
* 1. char symbol-1 = 'a';
* 2. char unicode-2 = '\u4546'; символ Юникода*/


public class lesson_2 {
    public static void main(String[] args) {

        byte binByte = 0b1100;
        byte decByte = 12;
        byte octByte = 014;
        byte hexByte = 0xC;

        System.out.println(binByte);
        System.out.println(decByte);
        System.out.println(octByte);
        System.out.println(hexByte);

        short binShort = 0b10100010100;
        short decShort = 1300;
        short octShort = 02424;
        short hexShort = 0x514;

        System.out.println(binShort);
        System.out.println(decShort);
        System.out.println(octShort);
        System.out.println(hexShort);

        int binInt = 0b0;
        int decInt = 0;
        int octInt = 00;
        int hexInt = 0x0;

        System.out.println(binInt);
        System.out.println(decInt);
        System.out.println(octInt);
        System.out.println(hexInt);

        long binLong = 0b111010110111100110100010101L;
        long decLong = 123456789L;
        long octLong = 0726746425L;
        long hexLong = 0x75BCD15L;

        System.out.println(binLong);
        System.out.println(decLong);
        System.out.println(octLong);
        System.out.println(hexLong);


        float f1 = 535.765F;
        float f2 = 1.7F;

        System.out.println(f1);
        System.out.println(f2);

        double d1 = 34567.87654;
        double d2 = 66658.998765;

        System.out.println(d1);
        System.out.println(d2);

        boolean b1 = 12 == 12;
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(b2);

        char diametrSymbol = 'Ø';
        char someUniSymbol = '\u4546';

        System.out.println(diametrSymbol);
        System.out.println(someUniSymbol);

    }
}
