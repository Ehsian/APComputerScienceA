#include <iostream>
#include <stdlib.h>
using namespace std;
string board[6][7]; //G = Green, R = Red, O = Empty, G = p1 R = p2
string p1name;
string p2name;
int p1wins;
int p2wins;
string turn;
string token;

void printBoard();
bool win();

int main() {
  cout<<"How to play:\nInput a valid column number (1-7) when it is your turn."<<endl;
  cout<<"First to connect 4 of their colored tokens in a row, column, or diagonal wins!"<<endl;
  for(int i=0;i<6;i++){
    for(int j=0;j<7;j++){
      board[i][j]="O";
    }
  }
  cout<<"Player 1 (G): ";
  cin>>p1name;
  cout<<"Player 2 (R): ";
  cin>>p2name;

  restart:
  srand (time(NULL));
  if(rand()%2==0){
    turn = p1name;
  } else{
    turn = p2name;
  }
  start:
  while(true){
    cout<<turn<<"'s turn!"<<endl;
    printBoard();
    int choice;
    cin>>choice;
    while(cin.fail()||choice==0||choice>7){
      cout<<"Please input a valid column."<<endl;
      cin.clear();
      cin.ignore();
      cin>>choice;
    }
    if(turn==p1name){
      token = "G";
    }else{
      token = "R";
    }
    for(int i=5;i>=0;i--){
      if(board[i][choice-1]=="O"){
        board[i][choice-1]=token;
        break;
      }
      if(i==0){
        cout<<"That column is full! Please input a valid column."<<endl;
        goto start;
      }
    }
    if(win()){
      printBoard();
      cout<<turn<<" wins!"<<endl;
      if(turn==p1name){
        p1wins++;
      }else{
        p2wins++;
      }
      cout<<"Score: "<<p1name<<": "<<p1wins<<" - "<<p2name<<": "<<p2wins<<endl;
      break;
    }
    else{
      if(turn==p1name){
          turn = p2name;
        }else{
          turn = p1name;
        }
    }
  }
  cout<<"Play again? (Y/N)"<<endl;
  string again;
  cin>>again;
  while(cin.fail()||(again!="Y"&&again!="N")){
    cout<<"Please input a valid choice."<<endl;
      cin.clear();
      cin.ignore();
      cin>>again;
  }
  if(again=="Y"){
    goto restart;
  }
  else{
    cout<<"Thanks for playing!"<<endl;
  }
}

void printBoard(){
  for(int i=0;i<6;i++){
    for(int j=0;j<7;j++){
      cout<<board[i][j]<<" ";
    }
    cout<<endl;
  }
  cout<<"1 2 3 4 5 6 7"<<endl;
}

bool win(){
  //Horizontal
  for(int i=0;i<6;i++){
    for(int j=0;j<4;j++){
      bool win = true;
      for(int k=0;k<4;k++){
        if(board[i][j+k]!=token){
          win=false;
        }
      }
      if(win){
      return true;
      }
    }
  }
  //Vertical
  for(int j=0;j<7;j++){
    for(int i=0;i<3;i++){
      bool win = true;
      for(int k=0;k<4;k++){
        if(board[i+k][j]!=token){
          win=false;
        }
      }
      if(win){
        return true;
      }
    }
  }
  //Diagonals1
  string diagonals[12];
  string diag;
  for(int k=0;k<12;k++){
    diag = "";
    for(int j=0;j<k+1;j++){
      int i = k-j;
      if(i<6&&j<7){
        diag+=board[i][j];
      }
    }
    diagonals[k]=diag;
  }
  for(string str:diagonals){
    if(str.find(token+token+token+token)!=string::npos){//npos similar to indexOf = -1
      return true;
    }
  }
  //Diagonals2
  string flipboard[7][6];
  for(int i=0;i<7;i++){
    for(int j=0;j<6;j++){
      flipboard[i][j]=board[6-j-1][i];
    }
  }
  for(int k=0;k<12;k++){
    diag = "";
    for(int j=0;j<k+1;j++){
      int i = k-j;
      if(i<7&&j<6){
        diag+=flipboard[i][j];
      }
    }
    diagonals[k]=diag;
  }
  for(string str:diagonals){
    if(str.find(token+token+token+token)!=string::npos){//npos similar to indexOf = -1
      return true;
    }
  }
  return false;
}
