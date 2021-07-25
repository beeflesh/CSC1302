/*Name: Savannah Smalley
Date: 7/6/21
Panther ID: 002-57-8974
Description: this code sorts through a Parks[] array to compare park objects to determine the park of greatest length.
Uses Park.java to describe park objects.
 */
//class start
public class ParkClient {
    //start of main()
    public static void main(String[] args) {
        //biggestPark starts empty but will be reassigned through the for-loop later on
        Park biggestPark = new Park();
        //Here we make an array to hold our 5 Park objects
        Park[] parks= new Park[5];
        //first park
        parks[0]=new Park("CSC1302",74,"Circle",5);
        //second park
        parks[1]=new Park("CSC1302",77,"Square",6);
        //three randomly named parks with random IDs, shapes, and lengths
        parks[2]=new Park("Bee Park",33,"Circle",7);
        parks[3]=new Park("Shame Pit",86,"Square",9);
        parks[4]=new Park("Just A Hole",92,"Circle",4);
        //for-loop compares each park object in the parks array and switches biggestPark to
        //the park with the biggest length each iteration.
        for(int i=0;i<parks.length-1;i++){
            //if current park length being tested is greater than the park in the element after
            //AND if the current park length is greater than current biggestPark, biggestPark gets reassigned
            //to the current park tested.
           if(parks[i].ParkLengthGetter()>parks[i+1].ParkLengthGetter()&&parks[i].ParkLengthGetter()>biggestPark.ParkLengthGetter()){
               biggestPark=parks[i];
               //if current park length being tested is less than the park in the element after
               //AND if that park length is greater than current biggestPark, biggestPark gets reassigned
            }else if (parks[i].ParkLengthGetter()<parks[i+1].ParkLengthGetter()&&parks[i+1].ParkLengthGetter()>biggestPark.ParkLengthGetter()){
               biggestPark=parks[i+1];
            }
        }
        //here the biggestPark's name gets printed.
        System.out.println(biggestPark.ParkName+" is the biggest park.");
}}
