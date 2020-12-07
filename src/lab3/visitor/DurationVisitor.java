package lab3.visitor;

public class DurationVisitor implements Visitor{
    private float totalDuration=0;
    @Override
    public void visit(Book book) {
        totalDuration+=book.getNumberOfPages()*5;
    }

    @Override
    public String toString() {
        return "The visited elements have a total duration of: "+totalDuration+" min";
    }

    @Override
    public void visit(Video video) {

        totalDuration+=video.getTime()+video.getTime()/30*5;
    }

    @Override
    public void visit(Audio audio) {
        totalDuration+=audio.getTime()+audio.getNumberOfSongs()*0.3;
    }
}
