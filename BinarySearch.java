public class BinarySearch {

    int binarySearch(int myArray[], int numToFind, int left, int right){
            if (right >= left) {
            int mid = left + (right - left) / 2;
            if(myArray[mid] == numToFind) {
                return mid;
            }
            else if(numToFind < myArray[mid]){
                return binarySearch(myArray, numToFind, left, mid - 1);
            }
            else {
                return binarySearch(myArray, numToFind, mid + 1, right);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int myArray[] = { 2, 3, 4, 10, 40 };
        int lenght = myArray.length;
        int numToFind = 40;
        int result = ob.binarySearch(myArray, numToFind, 0, lenght - 1);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println(
                "Element is present at index " + result);
    }
}