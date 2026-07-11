
class BubbleSort {
    public static void main(String[] args) {
        int [] data= {7,0,2,5,1,6,8,3};
        display(data);
        bubbleSort(data);
        display(data);
        System.out.println("Done.");
    }
    
    static void bubbleSort(int [] data) {
        for(int i=0;i<data.length-1;i++){
            for(int j=0;j<data.length-1-i;j++){
                if(data[j]>data[j+1]){
                    int t=data[j];
                    data[j]=data[j+1];
                    data[j+1]=t;
                }
            }
        }
        
    }
    
    static void display(int [] data) {
        for(int i=0;i<data.length-1;i++){
            System.out.print(data[i]+",");
        }
        System.out.println("");
    }
}
