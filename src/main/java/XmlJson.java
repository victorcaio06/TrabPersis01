import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XmlJson {
    public void readCsv() throws IOException {
        String fileCsv = "fileCsv.csv";
        try (BufferedReader in = new BufferedReader(new FileReader(fileCsv))) {
            List<Carro> carros = new ArrayList<>();
            String[] x;
            String aux;
            while ((aux = in.readLine()) != null){
                x = aux.split(",");
                int id = Integer.parseInt(x[0]);
                String model = x[1];
                String color = x[2];
                String year = x[3];
                int tank = Integer.parseInt(x[4]);
                int rim = Integer.parseInt(x[5]);
                String tire = x[6];

                Carro car = new Carro(id, model, color, year, tank, rim, tire);
                carros.add(car);
                aux = in.readLine();
            }

            ToJson(carros);
            ToXml(carros);
        }
    }

    public void ToJson(List<Carro> carro) throws IOException {
        String outFile = "arq.json";
        ObjectMapper obmap = new ObjectMapper();
        File file = new File(outFile);
        obmap.writeValue(file, carro);
        System.out.println("JSON gerado!!!");
    }
    public void ToXml(List<Carro> carro) throws IOException {
        String outFileXml = "arq.xml";
        XmlMapper xmap = new XmlMapper();
        File fls = new File(outFileXml);
        xmap.writeValue(fls, carro);
        System.out.println("XML gerado!!!");
    }
}
