public class PianoSheetController{
	PianoSheet sheet;

	//** Functions we need to make for the MusicSheet **//
	int noteIndex = 0;
	boolean startFlag = false, finishFlag = false;
	PianoBar currentBar, nextBar;
	PianoNote currentRightNote, currentLeftNote;
	PianoNote nextRightNote, nextLeftNote;
	int rightFingerNumber, leftFingerNumber;
	//Function#1 : Read Next Key Element -> Both right and left hand

	public PianoSheetController(PianoSheet sheet, boolean startInputFlag) {
		this.sheet = sheet;
	}	

	public Boolean PianoNoteController(PianoNote inputNote){
		this.note = inputNote;
	}	

	public Boolean checkCorrentness(PianoNote currentNote, PianoNote inputNote){
		//#1 - If Correct continue to next step
		//#2 - If not correct do not continue next step
		if(inputNote.sound == currentNote.sound &&
				inputNote.octave == currentNote.octave &&
				inputNote.die == currentNote.die){
			return true;
		}else{
			//Wrong Piano Key Pressed - Error pop out;
			return false;
		}
	}	

	public PianoNote getNextNote(){
		if(!currentBar.isEmpty()){
			nextRightNote = currentBar.getRightQueue().poll();
			nextLeftNote  = currentBar.getLeftQueue().poll();
		}else{
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

		/*
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
		   currentBar = this.sheet.getBarList().poll();
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
		   */
	}
	if(startInputFlag){
		startFlag = startInputFlag;
	}else{
		//Recursively get new sheet and new startFlag
	}	
	while(startFlag && !finishFlag){
		currentBar = this.sheet.getBarList().poll();
		
	}
}
