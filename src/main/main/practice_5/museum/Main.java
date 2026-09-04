package practice_5.museum;

public class Main {
    public static void main(String[] args){

        SystemMuseum systemMuseum = new SystemMuseum();
        Exhibit sculpture = new Sculpture();

        systemMuseum.addExhibit(sculpture);
        systemMuseum.forceCare();
        systemMuseum.showStory();

        Exhibit manuscript = new Manuscript();
        systemMuseum.addExhibit(manuscript);
        systemMuseum.forceCare();
        systemMuseum.showStory();



    }
}
