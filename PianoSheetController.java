public class PianoSheetController{
	PianoSheet sheet;

	//** Functions we need to make for the MusicSheet **//
	int noteIndex = 0;
	boolean startFlag = false;
	PianoBar currentBar, nextBar;
	PianoNote currentRightNote, currentLeftNote;
	PianoNote nextRightNote, nextLeftNote;
	int rightFingerNumber, leftFingerNumber;
	//Function#1 : Read Next Key Element -> Both right and left hand

	public PianoSheetController(PianoSheet sheet, boolean startFlagValue) {
		this.sheet = sheet;
		startFlag = startFlagValue;
	}
	if(startflag) {
		getNextbar();
	}

	public PianoNote checkCorrentness(PianoNote this.sheet.barList.keyList[noteIndex], PianoNote currentNote){
		//#1 - If Correct continue to next step
		//#2 - If not correct do not continue next step
		if(this.sheet.barList.keyList[noteIndex].sound  == currentNote.sound &&
				this.sheet.barList.keyList[noteIndex].octave == currentNote.octave &&
				this.sheet.barList.keyList[noteIndex].die    == currentNote.die){
			getNextBar();				
		}else{
			//Wrong Piano Key Pressed - Error pop out;
		}
	}

	public PianoBar getNextBar() {
		if(startflag){
			currentBar       = this.sheet.getBarList().poll();
			nextBar          = this.sheet.getBarList().poll();

			currentRightNote = currentBar.rightQueue.poll();
			nextRightNote    = currentBar.rightQueue.poll();
			rightFingerNumber= currentRightNote.keyList[noteIndex].fingerNumber;

			currentLeftNote  = currentBar.leftQueue.poll();
			nextLeftNote     = currentBar.leftQueue.poll();
			leftFingerNumber = currentLeftNote.keyList[noteIndex].fingerNumber;
			noteIndex++;
		}else{
			if (currentBar.isEmpty()){
				noteIndex = 0;	

			}else{
				//Call next Bar
				currentBar = nextBar;
				nextBar    = this.sheet.getBarList().poll();

				currentRightNote = currentBar.rightQueue.poll();
				nextRightNote    = currentBar.rightQueue.poll();
				rightFingerNumber= currentRightNote.keyList[noteIndex].fingerNumber;

				currentLeftNote  = currentBar.leftQueue.poll();
				nextLeftNote     = currentBar.leftQueue.poll();
				leftFingerNumber = currentLeftNote.keyList[noteIndex].fingerNumber;
				
				noteIndex++;
			}
		}			
	}	

}
