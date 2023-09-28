class Result {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */
    static ArrayList<Integer> getRank(ArrayList<Integer> ranked,int n){
        ArrayList<Integer>rank = new ArrayList<>() ;
        for(int i=0;i<n;i++){
            if(i==0){
                rank.add(1);
            }
            else{
                if(ranked.get(i)==ranked.get(i-1)){
                    rank.add(rank.get(i-1)) ;
                }
                else{
                    rank.add(rank.get(i-1)+1) ;
                }
            }
        }
        
        return rank ;
    }
    public static List<Integer> climbingLeaderboard(List<Integer> r, List<Integer> p) {
    // Write your code here
        int n=r.size() ;
        int m=p.size() ;
        ArrayList<Integer>ranked=(ArrayList<Integer>)r ;
        ArrayList<Integer>player=(ArrayList<Integer>)p ;
        
        
        ArrayList<Integer>ans=new ArrayList<>() ;
        ArrayList<Integer>rank=new ArrayList<>() ;
        //rank=getRank(ranked,n) ;
        for(int i=0;i<n;i++){
            if(i==0){
                rank.add(1);
            }
            else{
                if(ranked.get(i).equals(ranked.get(i-1))){ // don't write ==
                    rank.add(rank.get(i-1)) ;
                }
                else{
                    rank.add(rank.get(i-1)+1) ;
                }
            }
            //System.out.println(rank.get(i)) ;
        }
        
        int last=n-1 ;
        
        for(int i=0;i<m;i++){
            int x=player.get(i) ;
            
            while(last>=0 && ranked.get(last)<x){
                last-- ;
            }
            
            
            
            if(last==-1){
                ans.add(1) ;
            }
            else if(ranked.get(last)==x){
                ans.add(rank.get(last)) ;
            }
            else{
                ans.add(rank.get(last)+1) ;
            }
        }
        
        return ans ;
    }

}
