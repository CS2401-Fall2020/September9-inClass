
public class Album {
  private String title;
  private String artist;
  private String[] track_name;
  private int[] track_duration;
  
  public int album_duration() {
    int total = 0;
    for(int i=0; i<track_duration.length; i++) {
      total += track_duration[i];
    }
    return total;
  }
  
  int curLastTrack = 0;
  public boolean setNextTrack(String inName, int inDuration) {
    if(curLastTrack == track_name.length) return false;
    track_name[curLastTrack] = inName;
    track_duration[curLastTrack] = inDuration;
    curLastTrack++;
    return true;
  }
  
  public Album(int numTrack, String inArtist, String inTitle) {
    track_duration = new int[numTrack];
    track_name = new String[numTrack];
    artist = inArtist;
    title = inTitle;
  }
  
  public void print() {
    System.out.println("Artists: " + artist);
    System.out.println("Title: " + title);
    
    for(int i=0; i<track_duration.length; i++) {
      // print "#. Name (time)"
      System.out.println((i+1) + ". " + track_name[i] + " (" + track_duration[i] + ")");
    }
    System.out.println("Total duration: " + album_duration());
  }
  
}
