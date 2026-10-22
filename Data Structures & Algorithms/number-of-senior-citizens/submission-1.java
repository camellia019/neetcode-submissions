class Solution {
    public int countSeniors(String[] details) {
        int numPassengers = 0;
        for (int i = 0; i < details.length; i++){

            int agePassenger = (details[i].charAt(11) - '0') * 10 + 
                               (details[i].charAt(12) - '0');

            if (agePassenger > 60){
                numPassengers++;
            }
        }
        
        return numPassengers;

        
    }
}