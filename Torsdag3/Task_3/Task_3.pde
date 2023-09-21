String[] Artists = {"Mac Miller", "Kendrik Lamar", "Frank Ocean", "Logic", "Post Malone"};
String[] ArtistsMessage = {"Gang gang", "Blib blob", "Peace man", "everyday wake up, everyday wake up, everyday wake up", "Rockstar baby"};

void setup() {
  size(200, 200);
  
  for (int i = 0 ; i < Artists.length ; i++ ){
    println((i + 1) + ". " + Artists[i] + " : " + ArtistsMessage[i]);
  }
}
