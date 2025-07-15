class LINEARSEARCH{
    public static int search(int numbers[], int key){
        for(int i=0; i<numbers.length; i++)
        {
            if(key == numbers[i])
            return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[] = {1,5,7,84,34,50,23};
        int key = 84;
        int index = search(numbers, key);
        if(index == -1)
        {
            System.out.println("Element not found!");
        }
        else
        {
            System.out.println("Element index: " + index);
        }
    }
}