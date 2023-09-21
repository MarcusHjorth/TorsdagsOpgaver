void setup() {
  size(200,200);
  
  println(getRandom());
}

int[] arr = { 28, 230, 9, 310, 72};


int getRandom(){
  int newRandom = int(random(arr.length));
  return arr[newRandom];
}
