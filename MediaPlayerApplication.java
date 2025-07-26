package demo1;
class Media{
	String title;
	public Media(String title) {
		this.title=title;
	}
	public void play() {
		System.out.println("Playing "+title);
		
	}
	
}
class AudioMedia extends Media{
	String artist;
	public AudioMedia(String title,String artist) {
		super(title);
		this.artist=artist;
	}
	public void play() {
		System.out.println("Playing "+title+" of "+artist+" in audioplayer");
		
	}
	public void adjustVolume() {
		System.out.println("Adjusting the volume ..");
		}
	
	
}
class VideoMedia extends Media{
	int duration;
	public VideoMedia(String title,int duration) {
		super(title);
		this.duration=duration;
	}
	public void play() {
		System.out.println("Playing "+title+" in videoplayer of duration " +duration+"minutes");
		
	}
	public void skipForward() {
		System.out.println("Skipping the media..");
		}
	
}

public class MediaPlayerApplication {
	public static void main(String args[]) {
		Media[] playlist=new Media[2];
		playlist[0]=new AudioMedia("MUKUNDA MURARI","Shankar mahadevan");
		playlist[1]=new VideoMedia("MUKUNDA MURARI",5);
		
		
		for (Media newplaylist:playlist)
		{
			if( newplaylist instanceof VideoMedia) {
			VideoMedia v=(VideoMedia) newplaylist;
			v.skipForward();
			}
			else {
				AudioMedia a=(AudioMedia) newplaylist;
				a.adjustVolume();
			}
			
			newplaylist.play();
		}
	  
		
	}

}
