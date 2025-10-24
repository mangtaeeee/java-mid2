package collection.compare.main;

public enum Suit {

    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLUB("♣")
    ;

    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

}
