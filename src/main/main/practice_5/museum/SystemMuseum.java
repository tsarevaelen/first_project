package practice_5.museum;

public class SystemMuseum {
    public Exhibit exhibit;

    public void addExhibit(Exhibit exhibit){
        this.exhibit = exhibit;
        System.out.println("Экспонат " + exhibit + " прибыл в музей");
    }

    public void forceCare(){
        this.exhibit.care();
    }

    public void showStory(){
        this.exhibit.story();
    }
}
