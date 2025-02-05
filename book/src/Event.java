public class Event {
    int eventId, capacity;
    String eventName, category, date;
    public Event(int eventId, String eventName, String category, String date, int capacity){
        this.eventId = eventId;
        this.eventName = eventName;
        this.category = category;
        this.date = date;
        this.capacity = capacity;
    }
}
