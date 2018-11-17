import java.util.ArrayList;

public class PianoSheet{
	int madi_number;
	double tempo;
	double total_second;
	ArrayList<PianoBar> barList = new ArrayList<>();

    public PianoSheet(int madi_number, double tempo, double total_second, ArrayList<PianoBar> barList) {
        this.madi_number = madi_number;
        this.tempo = tempo;
        this.total_second = total_second;
        this.barList = barList;
    }

    public int getMadi_number() {
        return madi_number;
    }

    public void setMadi_number(int madi_number) {
        this.madi_number = madi_number;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getTotal_second() {
        return total_second;
    }

    public void setTotal_second(double total_second) {
        this.total_second = total_second;
    }

    public ArrayList<PianoBar> getBarList() {
        return barList;
    }

    public void setBarList(ArrayList<PianoBar> barList) {
        this.barList = barList;
    }
}
