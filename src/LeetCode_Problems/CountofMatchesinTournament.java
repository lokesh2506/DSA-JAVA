class Solution {
    public boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
    public int numberOfMatches(int teams) {
        int plyd = 0;
        while(teams > 1){
            if(isEven(teams)){
                teams /= 2; 
                plyd += teams;
            }else{
                teams = ((teams-1)/2)+1;
                plyd += teams-1;
            }
        }
        return plyd;
    }
}