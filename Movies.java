class Movies {
    public static void main(String[] args) {
        String[] films = {"Raiders of the Lost Ark", "Indiana Jones and the Temple of Doom", "Indiana Jones and the Last Crusade"};
        String [][] actors = {
            {"Harrison Ford", "Karen Allen", "Paul Freeman"},
            {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"},
            {"Harrison Ford", "Sean Connery", "Alison Doody"}
        };

        for (int i = 0; i < films.length; i++) {
		System.out.println ("In the movie " + films[i] + ", the main actors are : " + actors[i][0] + ", " + actors[i][1] +  ", " + actors[i][2]);
		}
    }
}