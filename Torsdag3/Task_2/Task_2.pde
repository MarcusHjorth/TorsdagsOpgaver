void setup() {
  size(200,200);
  
  printPartOfWord("computer", 3, 7);
}

void printPartOfWord(String StringPart, int start, int end) {
 println(StringPart.substring(start, end)); 
}
