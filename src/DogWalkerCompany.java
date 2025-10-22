public class DogWalkerCompany {
    public int dogWalkShift(int startHour, int endHour) {
        int pay = 0;
        while(startHour <= endHour)
        {
            int dogs = walkDogs(startHour);
            pay += dogs * 5;
            startHour++;
            if (dogs == maxDogs || startHour >= 9 && startHour <= 17)
                pay += 3;
            pay = pay;
        }
        return pay;
}
