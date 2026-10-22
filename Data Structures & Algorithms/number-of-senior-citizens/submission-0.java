class Solution {
    public int countSeniors(String[] details) {
        int numPassengers = 0;
        for (int i = 0; i < details.length; i++){
            String age = "" + details[i].charAt(11) + details[i].charAt(12);

            int agePassenger = 0;
            for (int j = 0; j < age.length(); j++){
                agePassenger = agePassenger * 10 + age.charAt(j) - '0';
            }

            if (agePassenger > 60){
                numPassengers++;
            }
        }
        
        return numPassengers;

        
    }
}