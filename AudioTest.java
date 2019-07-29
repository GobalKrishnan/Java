
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.spi.AudioFileWriter;

public class AudioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AudioWork a=new AudioWork();
     //wav file only
     a.play("test.wav"); //add your file to it when file finish it stop
     
     
     //use only recording from mic for below codes
     a.start(); //to record audio from microphone
     a.stop();//to stop recording
     try {
		a.play();
	} catch (UnsupportedAudioFileException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}//to play record audio
     
	}

}
