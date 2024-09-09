public class ArrayManipulation {
    /* Make method that give return true or false if the input is an array consist of numbers that have duplicate value
    1. Store variable to determine the size of an array
    2. Allow user to input number as they wish
    3. Loop outer to check the value similarities to the second two last
    4. Loop inner to check the value similarities start the second elements to last
    5. If during iteration they match the same value then it  is found there is duplicate
    */
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

    public static String getTextReverse(){
        String userText = InputUser.getString("What word would you like to reverse:? ");
        String resUserText = "";
        char[] userTextArr = userText.toCharArray();

        //System.out.println(userText.length());
        for(int s = userText.length() -1 ; s>=0 ; s--){
          resUserText += userTextArr[s];
        }

        return resUserText;
    }
}
