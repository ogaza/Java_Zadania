package z32;

class Dzialanie extends Wierzcholek {

    private char op; // operator +, -, / lub *

    public Dzialanie(char znak) throws NiepoprawneWyrazenie {

        if (znak != '+' && znak != '-' && znak != '*' && znak != '/') {
            throw new NiepoprawneWyrazenie();
        }

        op = znak;
    }

    public void dodajLewyArg(Wierzcholek arg) {
        lewy = arg;
    }

    public void dodajPrawyArg(Wierzcholek arg) {
        prawy = arg;
    }

    @Override
    public int wartosc() throws DzieleniePrzezZero, NiepoprawneWyrazenie {

        if (lewy == null || prawy == null) {
            throw new NiepoprawneWyrazenie();
        }

        switch (op) {
            case '+':
                return lewy.wartosc() + prawy.wartosc();
            case '-':
                return lewy.wartosc() - prawy.wartosc();
            case '/':
                if (prawy.wartosc() == 0) {
                    throw new DzieleniePrzezZero();
                }
                return lewy.wartosc() / prawy.wartosc();
            case '*':
                return lewy.wartosc() * prawy.wartosc();
        }
        return 0;
    }
}
