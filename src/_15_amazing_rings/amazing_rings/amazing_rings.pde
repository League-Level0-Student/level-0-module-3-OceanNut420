void setup(){
  size(500,500);
  
}
void draw(){
  int mom = 10;
  for(int i = 0; i<50; i++){
    noFill();
    ellipse(100,250,mom,mom);
    mom = mom+10;
    
    
  }
  int dad = 10;
    for(int i = 0; i<50; i++){
    noFill();
    ellipse(400,250,dad,dad);
    dad = dad+10;
    
    
  }
}
