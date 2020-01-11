void setup(){
  size(500,500);
}

void draw(){
int mom = 400;
  for(int i = 0; i<8; i++){
    if(i % 2 == 0){
      fill(200,0,0);
    }
    else{
      fill(3,0,0);
    }
    ellipse(250,250,mom,mom);
    mom=mom-50;
  }

  
  
  
    }
