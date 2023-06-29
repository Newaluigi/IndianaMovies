class Movies {
    public static void main(String[] args) {
        String[][] films = {
            {"Raiders of the Lost Ark", "Indiana Jones and the Temple of Doom", "Indiana Jones and the Last Crusade"},
            {"Harrison Ford", "Karen Allen", "Paul Freeman"},
            {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"},
            {"Harrison Ford", "Sean Connery", "Alison Doody"}
        };

        for (int i = 0; i < films[0].length; i++) {
            String filmTitle = films[i][0];
            String actor1 = films[i][0];
            String actor2 = films[i][1];
            String actor3 = films[i][2];

            System.out.printf("In the movie %s, the main actors are : %s, %s, %s\n", filmTitle, actor1, actor2, actor3);
        }
    }
}