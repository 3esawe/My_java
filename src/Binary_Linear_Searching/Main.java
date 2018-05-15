package Binary_Linear_Searching;

public class Main {
    public static void main(String[] args) {
        Data data = new Data("najwa", "7ke", 6);
        Data data1 = new Data("essa", "nar", 5);
        Data data2 = new Data("ali", "goal", 7);
        Data [] x = new Data[3];
        x[0] = data;
        x[1] = data1;
        x[2] = data2;
        System.out.println(find(x,"ali"));
        System.out.println(binarySearch(x,"ali"));




    }
    public static String find(Data[] data, String name){
            for (int i =0;i < data.length;i++){
                if(data[i].getName().equals(name)){
                    return data[i].getAlbum();
                }
        }
        return null;
    }
    public  static String binarySearch(Data[] data, String name){
        int low = 0;
        int high = data.length+1;
        int mid ;
        while (low <= high ){
            mid = low+((high-low)/2) ;
            int comp = name.compareTo(data[mid].getName());
            if (comp > 0 ){
                low= mid +1;
            }
            else if (comp < 0){

                high = mid -1;
            }
           else return data[mid].getAlbum();
        }
        return null;
    }
}
