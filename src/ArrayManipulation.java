public class ArrayManipulation {
    public static boolean findDuplicateInt() {
        boolean isDuplicate = false;
        int  userSize = InputUser.getInt("How many numbers do you want to store as collection number of an array? ");
        if(userSize <=0){
            System.out.println("Invalid input, please try again with positive number");
        }
        int[] userArr = InputUser.getIntArray("Let's type each of number ! ", userSize);
        for (int u = 0; u < userArr.length - 1; u++ ){
            for(int s = u + 1; s < userArr.length;s++){
                if(userArr[u] == userArr[s]){
                    isDuplicate = true;
                }


            }
        }
        return isDuplicate;
    }
}
