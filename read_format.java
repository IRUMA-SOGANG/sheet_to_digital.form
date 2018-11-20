public class PianoEumpyo{
	String asset_name;
	int duration_count;
	int color;	

}	
	
public class PianoMadi{
	boolean hand_type;
	int finger_count;
	
	Queue <PianoEumpyo> queue = new RightFingerList <PianoEumpyo> ();
	Queue <PianoEumpyo> queue = new LeftFingerList <PianoEumpyo> ();
	
	//list of eumpyo
	//Queue <String> queue = new FingerList <int> ();
	//For the piano sheet ex) 'C5', 'G5', 'D#5'
}	
	
public class Sheet{
	int madi_number;
	ArrayList <PianoMadi> MadiList = new ArrayList <PianoMadi> ();
	double tempo;	
	double total_second;
	
	//like bpm
}	
