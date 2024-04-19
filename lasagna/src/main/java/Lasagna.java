public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int actualMinutes){
        int expectedMinutes = expectedMinutesInOven();
        return expectedMinutes - actualMinutes;
    }

    public int preparationTimeInMinutes(int noOfLayers){
        return 2 * noOfLayers;        
    }

    public int totalTimeInMinutes(int noOfLayers,int noOfMinutesLasangaInTheOven){
        int preparationTime = preparationTimeInMinutes(noOfLayers);
        return (preparationTime + noOfMinutesLasangaInTheOven);
    }
}
