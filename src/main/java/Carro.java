public class Carro  {
    private int id;
    private String model;
    private String color;
    private String year;
    private int QtdTank;
    private int numRim;
    private String typeTire;

    public Carro(){
    }

    public Carro(int id, String model, String color, String year, int qtdTank, int numRim, String typeTire) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.year = year;
        this.QtdTank = qtdTank;
        this.numRim = numRim;
        this.typeTire = typeTire;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getModel() {
        return model;
    }

    public void setModel(String model) { this.model = model; }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getQtdTank() {
        return QtdTank;
    }

    public void setQtdTank(int qtdTank) {
        QtdTank = qtdTank;
    }

    public int getNumRim() {
        return numRim;
    }

    public void setNumRim(int numRim) {
        this.numRim = numRim;
    }

    public String getTypeTire() {
        return typeTire;
    }

    public void setTypeTire(String typeTire) {
        this.typeTire = typeTire;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", QtdTank=" + QtdTank +
                ", numRim=" + numRim +
                ", typeTire='" + typeTire + '\'' +
                '}';
    }
}
