public class NewVisitor extends StringOpBaseVisitor<String> {

    public String visitProg(StringOpParser.ProgContext ctx) {
        return visit(ctx.wyrazenie());
    }

    public String visitCiag(StringOpParser.CiagContext ctx) {

        return ctx.CIAG().toString().substring(1, ctx.CIAG().toString().length() - 1);
    }

    public String visitWyjmij(StringOpParser.WyjmijContext ctx) {

        int n1 = Integer.parseInt(ctx.LICZBA_DODATNIA(0).toString());
        int n2 = Integer.parseInt(ctx.LICZBA_DODATNIA(1).toString());

        String wynik = null;
        try {
            wynik = visit(ctx.wyrazenie()).toString().substring(n1, n2);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Zakres wyłuskiwania wykracza poza długość ciągu. Wprowadź poprawne wartości");
        }
        return wynik;
    }

    public String visitWielkosc(StringOpParser.WielkoscContext ctx) {

        String wynik = null;

        switch (ctx.op.getType()) {

            case StringOpParser.KAPITALIZACJA:
                wynik = visit(ctx.wyrazenie()).toUpperCase();
                break;

            case StringOpParser.DEKAPITALIZACJA:
                wynik = visit(ctx.wyrazenie()).toLowerCase();
                break;

        }
        return wynik;
    }

    public String visitOperacja(StringOpParser.OperacjaContext ctx) throws IllegalArgumentException {

        if (null == ctx.op)
            return visit(ctx.wyrazenie(0));

        String wynik = null;
        String arg1 = visit(ctx.wyrazenie(0));
        String arg2 = visit(ctx.wyrazenie(1));

        switch (ctx.op.getType()) {
            case StringOpParser.KONKATENACJA:
                wynik = arg1 + arg2;
                System.out.println(wynik);
                break;

            case StringOpParser.ROZNICA:
                wynik = odejmij(arg1, arg2);
                break;

            default:
                throw new IllegalArgumentException();
        }
        return wynik;
    }

    public String visitPrzesun(StringOpParser.PrzesunContext ctx) {

        int n = Integer.parseInt(ctx.LICZBA_DODATNIA().toString());

        String wynik = null;

        try {
            switch (ctx.op.getType()) {

                case StringOpParser.PRZESUNIECIE_PRAWO:
                    wynik = przesun_prawo(visit(ctx.wyrazenie()).toString(), n);
                    break;

                case StringOpParser.PRZESUNIECIE_LEWO:
                    wynik = przesun_lewo(visit(ctx.wyrazenie()).toString(), n);
                    break;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Przesunięcie nie może być dłuższe niż długość ciągu. Wprowadź poprawną wartość");
        }

        return wynik;
    }

    public static String odejmij(String ciag1, String ciag2) {
        String wynik = ciag1.replace(ciag2, "");

        return wynik;
    }

    private static String przesun_lewo(String ciag, int liczba) {
        return (ciag.substring(liczba) + ciag.substring(0, liczba));
    }

    private static String przesun_prawo(String ciag, int liczba) {
        return ciag.substring(ciag.length() - liczba) + ciag.substring(0, ciag.length() - liczba);
    }

}
