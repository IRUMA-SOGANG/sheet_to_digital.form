public class PianoSheetController{
	PianoSheet sheet;

	//** Functions we need to make for the MusicSheet **//
	int noteIndex = 0;
	boolean startFlag = false, barEmptyFlag = false, finishFlag = false;
	PianoBar currentBar, nextBar;
	PianoNote currentRightNote, currentLeftNote;
	PianoNote nextRightNote, nextLeftNote;
	int rightFingerNumber, leftFingerNumber;
	//Function#1 : Read Next Key Element -> Both right and left hand

	public PianoSheetController(PianoSheet sheet, boolean startInputFlag) {
		this.sheet = sheet;
	}	

	public Boolean PianoNoteController(PianoNote inputRightNote, PianoNote inputLeftNote){
		this.rightNote = inputRightNote;
		this.leftNote  = inputLeftNote;
	}	

	public Boolean checkCorrentness(PianoNote currentNote, PianoNote inputNote){
		//#1 - If Correct continue to next step
		//#2 - If not correct do not continue next step
		if(inputNote.keyList.sound == currentNote.keyList.sound &&
				inputNote.keyList.octave == currentNote.keyList.octave &&
				inputNote.keyListdie == currentNote.keyList.die){
			return true;
		}else{
			//Wrong Piano Key Pressed - Error pop out;
			return false;
		}
	}	

	public PianoNote getNextRightNote(){
		if(!currentBar.isEmpty()){
			nextRightNote = currentBar.getRightQueue().poll();
		}else{
			barEmptyFlag = true;
			return null;
		}
	}	

	public PianoNote getNextLeftNote(){
		if(!currentBar.isEmpty()){
			nextLeftNote  = currentBar.getLeftQueue().poll();
		}else{
			barEmptyFlag = true;
			return null;
		}
	}	


	public PianoBar getNextBar() {
		if(!this.sheet.getBarList().isEmpty()){
			nextBar = this.sheet.getBarList().poll();
			return nextBar;
		}else{
			finishFlag = true;
			return null;
		}
	}			
	while(!finishFlag){
		//If there is leftover music bar to read
		if(!startFlag && startInputFlag){
			//When reading the sheet for the first time
			if(this.sheet == null){
				//If sheet data doesn't exists ** HELP **
				//Message : "Please Download Music File"
			}else{
				startFlag        = startInputFlag;
				currentBar       = getNextBar();
				currentRightNote = getNextRightNote();
				currentLeftNote  = getNextLeftNote();
			}
		}else{
			if(checkCorrentness(this.inputLeftNote, currentLeftNote) &&
					checkCorrentness(this.inputRightNote, currentRightNote)){
				if(currentRightNote.durationCount > 0){
					currentRightNote.durationCount--;
				}else{
					currentRightNote = getNextRightNote();
				}
				if(currentLeftNote.durationCount > 0){
					currentLeftNote.durationCount--;
				}else{
					currentLeftNote  = getNextLeftNote();
				}
				if(barEmptyFlag){
					currentBar   = getNextBar();
					barEmptyFlag = false;
				}
			}else{
				//Recursively get new inputNote ** HELP **
				//Do Not Read Next Key Element
			}
		}
	}
}
