public class PianoSheetController extends PianoSheet {
	
	//** Functions we need to make for the MusicSheet **//
	
    public PianoSheetController(PianoSheet sheet) {
        this = sheet;
    }

	//Function#1 : Read Next Key Element -> Both right and left hand
    public PianoBar getNextBar() {
        nextBar = getBarList().poll();
		
		if (nextBar != null){
		//If there exists next Key Element 
					
		}else{
		//If there does not exists next Key Element
			
		}
	}
	//Functino#2 : Brings the Sound File (.wav) -> We don't think about this here 
		
	//Function#3 : Show Fingering Number
	public PianoBar getFingerNumber(){
										
	}		
		
	//Function#4 : Show Fingering Handtype
	public PianoBar getFingerHand(){
		
	}	
		
	//Function#X : Tempo setting
	public PianoBar tempoSetting(){
		
	}
}
