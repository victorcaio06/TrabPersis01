import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Carro cc = new Carro();
        CadastrarDados cd = new CadastrarDados();
        XmlJson xj = new XmlJson();

        cd.GetData();
        xj.readCsv();
    }
}
