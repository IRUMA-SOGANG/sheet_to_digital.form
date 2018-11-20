import java.util.ArrayList;

public class PianoNote {
	ArrayList<Key> keyList;
	//** KeyList **//
	//1. sound
	//2. octave
	//3. die(#)
	//4. isDown
	int durationCount;
	//int color;
	int fingerNumber;

    public PianoNote(ArrayList<Key> keyList, int durationCount, int color, int fingerNumber) {
        this.keyList = keyList;
        this.durationCount = durationCount;
        this.color = color;
        this.fingerNumber = fingerNumber;
    }

    public ArrayList<Key> getKeyList() {
        return keyList;
    }

    public void setKeyList(ArrayList<Key> keyList) {
        this.keyList = keyList;
    }

    public int getDurationCount() {
        return durationCount;
    }

    public void setDurationCount(int durationCount) {
        this.durationCount = durationCount;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getFingerNumber() {
        return fingerNumber;
    }

    public void setFingerNumber(int fingerNumber) {
        this.fingerNumber = fingerNumber;
    }
}
