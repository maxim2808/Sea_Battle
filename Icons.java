package java_dz.SeaBattle;

public enum Icons {
    //Empty_cell(" ⬜"),
    Empty_cell(" \uD83C\uDF0A"),Filled_cell(" \uD83D\uDEA2" ), Miss(" \uD83D\uDC40"), Hit(" 🔥"), Destroy(" ❌");



   public  String picture;

    Icons(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
