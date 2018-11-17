import sun.misc.Queue;

public class PianoSheet {
	double tempo;
	double totalSecond;
	Queue<PianoBar> barList = new Queue<>();

    public PianoSheet(double tempo, double totalSecond, Queue<PianoBar> barList) {
        this.tempo = tempo;
        this.totalSecond = totalSecond;
        this.barList = barList;
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

    public Queue<PianoBar> getBarList() {
        return barList;
    }

    public void setBarList(Queue<PianoBar> barList) {
        this.barList = barList;
    }
}
