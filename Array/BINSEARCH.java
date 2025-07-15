class BINSEARCH {
    public static int biSearch(int key, int num[]){
        int start = 0;
        int end = num.length-1;
        
        while(start <= end) {
        int mid = start + (end - start)/2;
            if(num[mid]<key){
                start = mid+1;
            }
            else if(num[mid]>key){
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int num[] = {2,5,6,17,23,94,150,350,450,500,565,623,654,780};
        int key = 150;
        int result = biSearch(key, num);

        if(result==-1){
            System.out.println("Item not found");
        } else {
        System.out.println("Item found at index: " + result);
        }
    }
}