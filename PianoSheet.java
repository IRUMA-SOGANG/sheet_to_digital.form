import java.util.ArrayList;

public class PianoSheet {
	int barNum;
	double tempo;
	double totalSecond;
	ArrayList<PianoBar> barList = new ArrayList<>();

    public PianoSheet(int barNum, double tempo, double totalSecond, ArrayList<PianoBar> barList) {
        this.barNum = barNum;
        this.tempo = tempo;
        this.totalSecond = totalSecond;
        this.barList = barList;
    }

    public int getBarNum() {
        return barNum;
    }

    public void setBarNum(int barNum) {
        this.barNum = barNum;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getTotalSecond() {
        return totalSecond;
    }

    public void setTotalSecond(double totalSecond) {
        this.totalSecond = totalSecond;
    }

    public ArrayList<PianoBar> getBarList() {
        return barList;
    }

    public void setBarList(ArrayList<PianoBar> barList) {
        this.barList = barList;
    }
}
