class Solution {
    static boolean checkSelfDividing(int og){
        int num = og;
        while(num > 0){
            int remin = num % 10;
            if(remin == 0 ||  og % remin != 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        for(int i = left;i<= right;i++){
            
            if(checkSelfDividing(i)){
                list.add(i);
            }
        }

        return list;
    }
}