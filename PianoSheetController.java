public class PianoSheetController extends PianoSheet {

    public PianoSheetController(PianoSheet sheet) {
        this = sheet;
    }

    public PianoBar getNextBar() {
        nextBar = getBarList().poll();
        if (nextBar != null) {
            
        }
    }
}
