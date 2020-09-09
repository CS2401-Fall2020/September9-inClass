
public class driver {

  public static void main(String[] args) {
    Album myAlbum = new Album(2, "Hey look an artists", "And it has a title");
    // track 1, 73 seconds called "I made a track" 
    System.out.println(myAlbum.setNextTrack("I made a track", 73));
    System.out.println(myAlbum.setNextTrack("track 2", 85));
    System.out.println(myAlbum.setNextTrack("The lost track", 700));
    System.out.println("Total duration: " + myAlbum.album_duration());
    myAlbum.print();
    //System.out.println(myAlbum.title);
    //myAlbum.title = "";
    System.out.println("\n------\n");
    
    Album[] myCollection = new Album[4];//an array of 4 albums
    myCollection[0] = myAlbum;
    for(int i=1; i<myCollection.length; i++) {
      // title is "title", arists is "artists" and 
      //contain 1 track of 2 seconds called "empty feeling"
      myCollection[i] = new Album(1, "artist","title");
      myCollection[i].setNextTrack("empty feeling", 2);
    }
    //print second album in list
    myCollection[1].print();
    
    System.out.println("\nMy entire collection:");
    for(Album current: myCollection) {
      current.print();
    }

  }

}
