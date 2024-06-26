public class Main {

    public static void main(String[] args) {

        String[] myArray ={"bcd","abc","hjk","dds","DDS","abc"};

        for(int i = 0; i< myArray.length; i++){
            for(int j = i+1; j< myArray.length;j++){
                if((myArray[i].equals(myArray[j]))&&(i!=j)){
                    System.out.println("Duplicate Element is : " + myArray[j]);
                }
            }
        }
    }
}