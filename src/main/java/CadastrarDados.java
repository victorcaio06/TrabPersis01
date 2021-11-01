import java.io.*;
import java.util.*;

public class CadastrarDados {
    private static final String fileCsv = "fileCsv.csv";
    /*Crie uma classe Java para cadastrar dados relacionados à entidade definida na questão 1.
    A classe deve receber dados via teclado e os salvar ao final de um arquivo CSV (append).
     */
    public void FileWriteCsv(Carro car) {
        try{
            System.out.println("Gerando O CSV!!!");
            FileOutputStream fp = new FileOutputStream(fileCsv, true);
            OutputStreamWriter osw = new OutputStreamWriter(fp);
            BufferedWriter bw = new BufferedWriter(osw);

            String savingData = car.getId() + "," +  car.getModel() + "," + car.getColor() + "," + car.getYear() + "," + car.getQtdTank() + "," + car.getNumRim() + "," + car.getTypeTire();

            bw.write(savingData);
            bw.newLine();
            bw.flush();
            bw.close();

            System.out.println("Arquivo CSV gerado!!!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void GetData() {

        Random rd = new Random();
        int numberAle = rd.nextInt(1000);
        Scanner sc = new Scanner(System.in);
        int id, qtdTank, numRim;
        String model, color, typeTire, year;
        id = numberAle;
        System.out.println("Digite o modelo do carro: ");
        model = sc.nextLine();
        System.out.println("Digite a cor do carro: ");
        color = sc.nextLine();
        System.out.println("Digite o ano do carro: ");
        year = sc.nextLine();
        System.out.println("Digite a capacidade do tanque de combustível: ");
        qtdTank = sc.nextInt();
        System.out.println("Digite o tamanho do aro do carro: ");
        numRim = sc.nextInt();
        System.out.println("Digite o tipo do pneu: ");
        typeTire = sc.next();

        Carro cr = new Carro(id, model, color, year, qtdTank, numRim, typeTire);
        FileWriteCsv(cr);
    }
}
